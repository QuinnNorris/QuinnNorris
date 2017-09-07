package com.quinnnorris.ssm.mapper;

import com.quinnnorris.ssm.bean.Bloginfo;
import com.quinnnorris.ssm.bean.BloginfoCustom;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Title: BloginfoCustomMapper
 * Description:
 * Company: www.QuinnNorris.com
 *
 * @date: 2017/9/7 下午7:14 星期四
 * @author: quinn_norris
 * @version: 1.0
 */
@Repository("bloginfoCustomMapper")
public interface BloginfoCustomMapper {

    public List<BloginfoCustom> selectBloginfoByNickname(BloginfoCustom bloginfoCustom);

}
