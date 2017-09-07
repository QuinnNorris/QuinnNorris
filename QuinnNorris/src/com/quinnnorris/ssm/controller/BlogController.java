package com.quinnnorris.ssm.controller;

import com.quinnnorris.ssm.basejson.BaseJson;
import com.quinnnorris.ssm.bean.BloginfoCustom;
import com.quinnnorris.ssm.service.GetMessageService;
import com.quinnnorris.ssm.service.impl.LoginServiceImpl;
import com.quinnnorris.ssm.service.impl.RegisterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
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
    public String turnToBlogPage(@PathVariable String nickname, Model model) {
        BaseJson baseJson = getMessageService.getBlogInfo(nickname);
        Map<String, String> map = new HashMap<String, String>();
        BloginfoCustom bloginfoCustom = (BloginfoCustom) baseJson.getObject();
        map.put("hits", bloginfoCustom.getHits() + "");
        map.put("note", bloginfoCustom.getNote());
        map.put("articles", bloginfoCustom.getArticles() + "");
        map.put("fans", bloginfoCustom.getFans() + "");
        map.put("score", bloginfoCustom.getScore() + "");
        model.addAllAttributes(map);
        return "BlogPage";
    }

}
