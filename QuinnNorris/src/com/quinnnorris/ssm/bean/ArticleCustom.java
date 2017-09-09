package com.quinnnorris.ssm.bean;

/**
 * Title: ArticleCustom
 * Description:
 * Company: www.QuinnNorris.com
 *
 * @date: 2017/9/8 下午1:22 星期五
 * @author: quinn_norris
 * @version: 1.0
 */
public class ArticleCustom extends Article{

    private int startPos;
    private int pageSize;
    private String createtimestr;

    public int getStartPos() {
        return startPos;
    }

    public void setStartPos(int startPos) {
        this.startPos = startPos;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getCreatetimestr() {
        return createtimestr;
    }

    public void setCreatetimestr(String createtimestr) {
        this.createtimestr = createtimestr;
    }
}
