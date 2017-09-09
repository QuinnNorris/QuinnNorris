package com.quinnnorris.ssm.service.impl;

import com.quinnnorris.ssm.basejson.BaseJson;
import com.quinnnorris.ssm.bean.ArticleCustom;
import com.quinnnorris.ssm.bean.BloginfoCustom;
import com.quinnnorris.ssm.bean.UserCustom;
import com.quinnnorris.ssm.mapper.ArticleCustomMapper;
import com.quinnnorris.ssm.mapper.BloginfoCustomMapper;
import com.quinnnorris.ssm.mapper.UserCustomMapper;
import com.quinnnorris.ssm.service.GetMessageService;
import com.quinnnorris.ssm.util.DataFormat;
import com.quinnnorris.ssm.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
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

    @Autowired
    private UserCustomMapper userCustomMapper;

    @Autowired
    private ArticleCustomMapper articleCustomMapper;

    @Override
    public BaseJson getBlogInfo(String nickname) {
        BloginfoCustom bloginfoCustom = new BloginfoCustom();
        bloginfoCustom.setNickname(nickname);
        BloginfoCustom selectRes = bloginfoCustomMapper.selectBloginfoByNickname(bloginfoCustom);
        BaseJson baseJson = new BaseJson();
        baseJson.setObject(selectRes);
        return baseJson;
    }

    @Override
    public BaseJson getArticles(String nickname) {
        UserCustom userCustom = new UserCustom();
        userCustom.setNickname(nickname);
        ArticleCustom articleCustom = new ArticleCustom();
        articleCustom.setAuthor_id(userCustomMapper.selectUserByNickname(userCustom).get(0).getId());
        List<ArticleCustom> selectRes = articleCustomMapper.selectArticleById(articleCustom);
        //error
        BaseJson baseJson = new BaseJson();
        baseJson.setObject(selectRes);
        return baseJson;
    }

    @Override
    public BaseJson showArticlesByPage(String nickname, int pageNow) {

        UserCustom userCustom = new UserCustom();
        userCustom.setNickname(nickname);
        ArticleCustom articleCustom = new ArticleCustom();
        articleCustom.setAuthor_id(userCustomMapper.selectUserByNickname(userCustom).get(0).getId());

        int totalCount = articleCustomMapper.getArticleCount(articleCustom);
        Page page = new Page(totalCount, pageNow);
        articleCustom.setPageSize(page.getPageSize());
        articleCustom.setStartPos(page.getStartPos());
        List<ArticleCustom> selectRes = articleCustomMapper.selectArticleByPage(articleCustom);
        BaseJson baseJson = new BaseJson();
        baseJson.setObject(selectRes);

        return baseJson;
    }
}
