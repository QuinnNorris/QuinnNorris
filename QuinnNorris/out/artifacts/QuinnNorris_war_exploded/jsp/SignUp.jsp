<%--
  Created by IntelliJ IDEA.
  User: quinn_norris
  Date: 2017/9/5
  Time: 下午3:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/res/css/bootstrap.css">
    <script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/res/titleCom/css/style.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/res/titleCom/css/style-wide.css"/>

    <script type="text/ecmascript" src="${pageContext.request.contextPath }/res/js/md5.js"></script>

    <!--[if lte IE 8]>
    <script src="${pageContext.request.contextPath }/res/titleCom/css/ie/html5shiv.js"></script><![endif]-->
    <script src="${pageContext.request.contextPath }/res/titleCom/js/skel.min.js"></script>
    <script src="${pageContext.request.contextPath }/res/titleCom/js/init.js"></script>
    <noscript>
        <link rel="stylesheet" href="${pageContext.request.contextPath }/res/skel.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath }/res/style-noscript.css"/>
    </noscript>
    <!--[if lte IE 9]>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/res/titleCom/css/ie/v9.css"/><![endif]-->
    <!--[if lte IE 8]>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/res/titleCom/css/ie/v8.css"/><![endif]-->

    <%--以下四个是登陆注册需要的--%>
    <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet">
    <link rel='stylesheet prefetch' href='https://fonts.googleapis.com/icon?family=Material+Icons'>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/res/dlzhi/css/style.css">
    <script src="${pageContext.request.contextPath }/res/dlzhi/js/index.js"></script>
    <%--
    <!--[if lte IE 8]>
    <script src="${pageContext.request.contextPath }/res/signCom/css/ie/html5shiv.js"></script><![endif]-->
    <script src="${pageContext.request.contextPath }/res/signCom/js/skel.min.js"></script>
    <script src="${pageContext.request.contextPath }/res/signCom/js/init.js"></script>
    <script src="${pageContext.request.contextPath }/res/dlzhi/js/index.js"></script>
    <noscript>
        <link rel="stylesheet" href="${pageContext.request.contextPath }/res/signCom/css/skel.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath }/res/signCom/css/style-noscript.css"/>
    </noscript>
    <!--[if lte IE 9]>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/res/signCom/css/ie/v9.css"/><![endif]-->
    <!--[if lte IE 8]>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/res/signCom/css/ie/v8.css"/><![endif]-->
--%>
    <title>Sign Up / Login</title>
</head>

<body class="loading">
<div style="position:absolute; width: 100%;/* left:0px; top:0px; */z-index:999999;">
    <jsp:include page="NavigationBar.jsp"/>
</div>
<div style="position:absolute;top:200px;left:50%;z-index:999999;">
    <div class="cotn_principal">
        <div class="cont_centrar">
            <div class="cont_login">
                <div class="cont_info_log_sign_up">
                    <div class="col_md_login">
                        <div class="cont_ba_opcitiy">
                            <h2>SIGN IN</h2>
                            <p>Sign in your account <br/>enjoy it</p>
                            <button class="btn_login" onclick="cambiar_login()">SIGN IN</button>
                        </div>
                    </div>
                    <div class="col_md_sign_up">
                        <div class="cont_ba_opcitiy">
                            <h2>SIGN UP</h2>
                            <p>Sign up for an account <br/> use the service</p>
                            <button class="btn_sign_up1" onclick="cambiar_sign_up()">SIGN UP</button>
                        </div>
                    </div>
                </div>
                <div class="cont_back_info">
                    <div class="cont_img_back_grey"><img
                            src="${pageContext.request.contextPath }/res/dlzhi/po.jpg" alt=""/></div>
                </div>
                <div class="cont_forms">
                    <div class="cont_img_back_"><img src="${pageContext.request.contextPath }/res/dlzhi/po.jpg"
                                                     alt=""/></div>
                    <div class="cont_form_login"><a href="#" onclick="ocultar_login_sign_up()"><i
                            class="material-icons">&#xE5C4;</i></a>
                        <h2>LOGIN</h2>
                        <input type="text" placeholder="Email"/>
                        <input type="password" placeholder="Password"/>
                        <button class="btn_login" <%--onclick="cambiar_login()"--%>>LOGIN</button>
                    </div>
                    <div class="cont_form_sign_up"><a href="#" onclick="ocultar_login_sign_up()"><i
                            class="material-icons">&#xE5C4;</i></a>
                        <h2>SIGN UP</h2>
                        <input type="email" id="reg_email" name="reg_email" placeholder="Email"/>
                        <input type="text" id="reg_name" name="reg_name" placeholder="NickName"/>
                        <input type="password" id="reg_pwd" name="reg_pwd" placeholder="Password"/>
                        <input type="password" id="reg_cpwd" name="reg_cpwd" placeholder="Confirm Password"/>
                        <button class="btn_sign_up" onclick="sign_up()">SIGN UP</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div id="wrapper">
    <div id="bg"></div>
    <div id="overlay"></div>
    <div id="main">

    </div>
</div>
</body>
<script>
    function sign_up() {
        //alert(hex_md5($("#reg_pwd").val())+" "+ hex_md5($("#reg_cpwd").val())+" "+$("#reg_email").val()+" "+$("#reg_name").val());
        var pwd_md5 = hex_md5($("#reg_pwd").val());
        var cpwd_md5 = hex_md5($("#reg_cpwd").val());
        if (pwd_md5 != cpwd_md5) {
            alert("xa")
        }
        else {
            var email = $("#reg_email").val();
            var nickname = $("#reg_name").val();

            $.ajax({

                url: '${pageContext.request.contextPath}/register',
                type: 'post',
                contentType: 'application/x-www-form-urlencoded',
                data: {email: email, nickname: nickname, pwd: pwd_md5},
                dataType: "json",
                success: function (data) {
                    alert(data.errorCode);
                }
            });
        }
    }
</script>
</html>

