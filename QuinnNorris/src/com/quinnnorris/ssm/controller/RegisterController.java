package com.quinnnorris.ssm.controller;

import com.quinnnorris.ssm.basejson.BaseJson;
import com.quinnnorris.ssm.bean.UserCustom;
import com.quinnnorris.ssm.service.impl.RegisterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Title: registerController
 * Description:
 * Company: www.QuinnNorris.com
 *
 * @date: 2017/9/5 下午7:11 星期二
 * @author: quinn_norris
 * @version: 1.0
 */
@Controller
public class RegisterController {

    @Autowired
    private RegisterServiceImpl registerServiceImpl;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public  BaseJson registerUser(@RequestParam String email,@RequestParam String nickname , @RequestParam String pwd) {

        UserCustom userCustom = new UserCustom();
        userCustom.setEmail(email);
        userCustom.setNickname(nickname);
        userCustom.setPassword(pwd);
        return  registerServiceImpl.insertUserFromReg(userCustom);
    }


}
