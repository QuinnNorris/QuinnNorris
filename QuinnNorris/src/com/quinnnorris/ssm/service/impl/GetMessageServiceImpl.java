package com.quinnnorris.ssm.service.impl;

import com.quinnnorris.ssm.basejson.BaseJson;
import com.quinnnorris.ssm.bean.BloginfoCustom;
import com.quinnnorris.ssm.mapper.BloginfoCustomMapper;
import com.quinnnorris.ssm.service.GetMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Title: GetMessageServiceImpl
 * Description:
 * Company: www.QuinnNorris.com
 *
 * @date: 2017/9/7 下午7:13 星期四
 * @author: quinn_norris
 * @version: 1.0
 */
@Service("getMessageServiceImpl")
public class GetMessageServiceImpl implements GetMessageService {

    @Autowired
    private BloginfoCustomMapper bloginfoCustomMapper;

    @Override
    public BaseJson getBlogInfo(String nickname) {
        BloginfoCustom bloginfoCustom = new BloginfoCustom();
        bloginfoCustom.setNickname(nickname);
        List<BloginfoCustom> selectRes = bloginfoCustomMapper.selectBloginfoByNickname(bloginfoCustom);
        BaseJson baseJson = new BaseJson();
        baseJson.setObject(selectRes.get(0));
        return baseJson;
    }
}
