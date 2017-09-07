package com.quinnnorris.ssm.service;

import com.quinnnorris.ssm.basejson.BaseJson;
import com.quinnnorris.ssm.bean.UserCustom;

/**
 * Title: LoginService
 * Description:
 * Company: www.QuinnNorris.com
 *
 * @date: 2017/9/7 上午9:03 星期四
 * @author: quinn_norris
 * @version: 1.0
 */
public interface LoginService {


    public BaseJson findUserByEmail(UserCustom userCustom);

}
