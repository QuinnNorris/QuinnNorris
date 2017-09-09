package com.quinnnorris.ssm.controller;

import com.quinnnorris.ssm.basejson.BaseJson;
import com.quinnnorris.ssm.bean.ArticleCustom;
import com.quinnnorris.ssm.bean.BloginfoCustom;
import com.quinnnorris.ssm.service.GetMessageService;
import com.quinnnorris.ssm.util.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Title: BlogController
 * Description: 操作博客部分所有相关的控制器
 * Company: www.QuinnNorris.com
 *
 * @date: 2017/9/7 下午3:06 星期四
 * @author: quinn_norris
 * @version: 1.0
 */
@Controller
public class BlogController {

    @Autowired
    private GetMessageService getMessageService;

    @RequestMapping("/BlogPage/{nickname}")
    public String turnToBlogPage(@PathVariable String nickname, HttpSession httpSession, Model model) {
        int pageNow = (Integer) httpSession.getAttribute("pageNow");
        if (nickname == null || nickname.equals("null"))
            nickname = (String) httpSession.getAttribute("nickname");
        BaseJson baseJson = getMessageService.getBlogInfo(nickname);
        Map<String, String> map = new HashMap<String, String>();
        BloginfoCustom bloginfoCustom = (BloginfoCustom) baseJson.getObject();
        map.put("hits", bloginfoCustom.getHits() + "");
        map.put("note", bloginfoCustom.getNote());
        map.put("articles", bloginfoCustom.getArticles() + "");
        map.put("fans", bloginfoCustom.getFans() + "");
        map.put("score", bloginfoCustom.getScore() + "");
        model.addAllAttributes(map);
        List<ArticleCustom> list = (List<ArticleCustom>) getMessageService.showArticlesByPage(nickname, pageNow).getObject();
        for (ArticleCustom article : list) {
            try {
                article.setCreatetimestr(DataFormat.dataToFormat(article.getCreatetime()));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        model.addAttribute("artList", list);
        return "BlogPage";
    }

}
