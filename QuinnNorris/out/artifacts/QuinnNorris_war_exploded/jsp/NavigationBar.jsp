<%--
  Created by IntelliJ IDEA.
  User: quinn_norris
  Date: 2017/9/4
  Time: 下午1:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<nav class="navbar navbar-default navbar-fixed-top navbar-inverse">
    <div class="container-fluid">

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav ">
                <li class="active"><a href="#">Home Page<span class="sr-only">(current)</span></a></li>
                <li><a href="#">About Us</a></li>
                <li><a href="#">Blog</a></li>
                <li><a href="#">Services</a></li>
            </ul>

            <ul class="nav navbar-nav navbar-right">
                <form class="navbar-form navbar-left">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="QuinnNorris">
                    </div>
                    <button type="submit" class="btn btn-default">Submit</button>
                </form>
                <li><a href="${pageContext.request.contextPath }/jsp/SignUp.jsp">Sign Up</a></li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav><%--
<script>
    function toLogin() {
        /*alert(window.document.location.pathname);*/
        if(window.location.pathname == "/" || window.location.pathname == "/jsp/HomePage.jsp" /*|| window.location.pathname == ""*/) {
            getLoginReg();
            /*return;*/
        }
        else
        window.location.href="${pageContext.request.contextPath }/jsp/HomePage.jsp";
        *//*alert(window.location.pathname);*/
        /*window.location.href=""*/
    }
</script>--%>
<%--

<nav id="mainNav" class="navbar navbar-default navbar-fixed-top hc-top-up">
    <div class="container-fluid">
        <a href="javascript:void(0)" class="hc-logobox">
        </a>

        <div class="navbar-right hc-contact p768">
            <a href="#">&nbsp;Sign In&nbsp;</a>&nbsp;&nbsp;&nbsp;
            <a href="#">Sign Up</a>
        </div>
        <div id="oiBtn" class="hc-oi p1100">
            <em></em>
        </div>

        <ul id="navBox" class="nav navbar-nav navbar-right hc-navbox">
            <li>
                <a class="nav-on" href="#">Home Page</a>
                <a class="nav-off" href="#">首页</a>
            </li>
            <li>
                <a class="nav-on" href="#">About Us</a>
                <a class="nav-off" href="#">关于我们</a>
            </li>
            <li>
                <a class="nav-on" href="#">Blog</a>
                <a class="nav-off" href="#">博客专栏</a>
            </li>
            <li>
                <a class="nav-on" href="#">Services</a>
                <a class="nav-off" href="#">服务内容</a>
            </li>
            <li>
                <a class="nav-on" href="#">Project</a>
                <a class="nav-off" href="#">经典案例</a>
            </li>
            <li>
                <a class="nav-on" href="#">Project</a>
                <a class="nav-off" href="#">经典案例</a>
            </li>
            <li>
                <a class="nav-on" href="#">Contact Us</a>
                <a class="nav-off" href="#">联系我们</a>
            </li>
            <li>
                <a class="nav-on" href="#">Support</a>
                <a class="nav-off" href="#">技术支持</a>
            </li>
        </ul>
    </div>

</nav>

--%>
