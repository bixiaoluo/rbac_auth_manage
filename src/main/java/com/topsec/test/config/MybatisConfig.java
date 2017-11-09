package com.topsec.test.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by jiyujing on 2017/11/7.
 */
@Configuration("MybatisConfiguration")//注册 数据源 对象
@MapperScan(basePackages = {"com.topsec.test.mapper"},sqlSessionTemplateRef="sqlSessionTemplate")//扫描mapper的路径
public class MybatisConfig {
    @Autowired
    private Environment env;

    @Bean(name="dataSource")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(env.getProperty("ms.db.driverClassName"));
        dataSource.setUrl(env.getProperty("ms.db.url"));
        dataSource.setUsername(env.getProperty("ms.db.username"));
        dataSource.setPassword(env.getProperty("ms.db.password"));
        dataSource.setMaxActive(Integer.parseInt(env.getProperty("ms.db.maxActive")));

        return dataSource;
    }

    @Bean(name="sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);

        Properties properties = new Properties();
        properties.setProperty("dialect", "mysql");
        sqlSessionFactoryBean.setConfigurationProperties(properties);

        //添加XML目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            sqlSessionFactoryBean.setMapperLocations(resolver.getResources(env.getProperty("mybatis.mapper-locations")));
            //加上别名，在写sql语句时用别名就可以了
            sqlSessionFactoryBean.setTypeAliasesPackage(env.getProperty("mybatis.type-aliases-package"));
            return sqlSessionFactoryBean.getObject();
    }

    @Bean(destroyMethod = "clearCache",name="sqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        sqlSessionFactory.getConfiguration().setMapUnderscoreToCamelCase(true);
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
