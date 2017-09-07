package com.quinnnorris.ssm.service;

import com.quinnnorris.ssm.basejson.BaseJson;

/**
 * Title: GetMessageService
 * Description:
 * Company: www.QuinnNorris.com
 *
 * @date: 2017/9/7 下午7:11 星期四
 * @author: quinn_norris
 * @version: 1.0
 */
public interface GetMessageService {

    public BaseJson getBlogInfo(String nickname);

}
