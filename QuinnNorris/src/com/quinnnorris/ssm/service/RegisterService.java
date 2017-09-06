package com.quinnnorris.ssm.service;

import com.quinnnorris.ssm.basejson.BaseJson;
import com.quinnnorris.ssm.bean.UserCustom;
import com.quinnnorris.ssm.mapper.UserCustomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Title: RegisterService
 * Description:
 * Company: www.QuinnNorris.com
 *
 * @date: 2017/9/5 下午7:12 星期二
 * @author: quinn_norris
 * @version: 1.0
 */
public interface RegisterService {

    public BaseJson insertUserFromReg(UserCustom userCustom) throws Exception;

}
