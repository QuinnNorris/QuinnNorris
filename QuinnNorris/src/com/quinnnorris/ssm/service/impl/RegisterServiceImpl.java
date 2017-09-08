package com.quinnnorris.ssm.service.impl;

import com.quinnnorris.ssm.basejson.BaseJson;
import com.quinnnorris.ssm.bean.Bloginfo;
import com.quinnnorris.ssm.bean.BloginfoCustom;
import com.quinnnorris.ssm.bean.UserCustom;
import com.quinnnorris.ssm.mapper.UserCustomMapper;
import com.quinnnorris.ssm.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Title: RegisterServiceImpl
 * Description:
 * Company: www.QuinnNorris.com
 *
 * @date: 2017/9/5 下午7:13 星期二
 * @author: quinn_norris
 * @version: 1.0
 */
@Service("registerServiceImpl")
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private UserCustomMapper userCustomMapper;

    @Override
    public BaseJson insertUserFromReg(UserCustom userCustom) {
        BaseJson baseJson = new BaseJson();
        List<UserCustom> selectRes = userCustomMapper.selectUserByEmail(userCustom);
        if (selectRes != null && selectRes.size() >= 1) {
            baseJson.setErrorCode("1001");//用户已经注册
            return baseJson;
        }
        List<UserCustom> selectRes2 = userCustomMapper.selectUserByNickname(userCustom);
        if (selectRes != null && selectRes.size() >= 1) {
            baseJson.setErrorCode("1003");//昵称重复注册失败
            return baseJson;
        }
        userCustom.setRegtime(new Date());
        BloginfoCustom bloginfoCustom = new BloginfoCustom();
        bloginfoCustom.setNickname(userCustom.getNickname());
        userCustomMapper.insertUserFromReg(userCustom);
        userCustomMapper.insertBloginfoFromReg(bloginfoCustom);
        baseJson.setErrorCode("0001");//用户成功注册
        baseJson.setObject(-1);
        baseJson.setObject(userCustom.getId());
        System.out.println("ser");
        return baseJson;
    }

}
