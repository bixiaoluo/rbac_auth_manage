/**
 * Created by jiyujing on 2017/11/9.
 */

$().ready(function() {
    fromValidate();
});

function login() {
    $.post("/auth/login", $("#login-form").serialize(),function (data) {
        console.log(data);
        if(data.code==-1){
            alert(data.msg);//弹出层
            return;
        }
        window.location.href="/nice_admin/index.html";
    });
}

function fromValidate() {

    $("#login-form").validate({
        rules: {
            userName: "required",
            password: {
                required: true,
                minlength: 6
            }
        },
        messages: {
            userName: "请输入用户名",
            password: {
                required: "请输入密码",
                minlength: jQuery.format("密码不能小于{0}个字 符")
            }
        },
        submitHandler:function(){
            login();
        }
    });
}