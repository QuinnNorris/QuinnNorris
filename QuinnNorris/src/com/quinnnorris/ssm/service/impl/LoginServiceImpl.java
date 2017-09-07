package com.quinnnorris.ssm.service.impl;

import com.quinnnorris.ssm.basejson.BaseJson;
import com.quinnnorris.ssm.bean.UserCustom;
import com.quinnnorris.ssm.mapper.UserCustomMapper;
import com.quinnnorris.ssm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Title: LoginServiceImpl
 * Description:
 * Company: www.QuinnNorris.com
 *
 * @date: 2017/9/7 上午9:08 星期四
 * @author: quinn_norris
 * @version: 1.0
 */
@Service("loginServiceImpl")
public class LoginServiceImpl implements LoginService{

    @Autowired
    private UserCustomMapper userCustomMapper;

    @Override
    public BaseJson findUserByEmail(UserCustom userCustom) {
        BaseJson baseJson = new BaseJson();
        List<UserCustom> selectRes = userCustomMapper.selectUserByEmail(userCustom);
        if (selectRes != null && selectRes.size() >= 1) {
            if(selectRes.get(0).getPassword().equals(userCustom.getPassword())) {
                baseJson.setErrorCode("0002");//输入密码正确
                baseJson.setObject(selectRes.get(0).getNickname());
            }
            else
                baseJson.setErrorCode("1002");//输入密码错误
        }else
            baseJson.setErrorCode("1003");//用户不存在
        return baseJson;
    }
}
