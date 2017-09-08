package com.quinnnorris.ssm.mapper;

import com.quinnnorris.ssm.bean.ArticleCustom;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Title: ArticleCustomMapper
 * Description:
 * Company: www.QuinnNorris.com
 *
 * @date: 2017/9/8 下午3:52 星期五
 * @author: quinn_norris
 * @version: 1.0
 */
@Repository("articleCustomMapper")
public interface ArticleCustomMapper {

    public List<ArticleCustom> selectArticleById(ArticleCustom articleCustom);

    public List<ArticleCustom> selectArticleByPage(ArticleCustom articleCustom);

    public int getArticleCount(ArticleCustom articleCustom);

}
