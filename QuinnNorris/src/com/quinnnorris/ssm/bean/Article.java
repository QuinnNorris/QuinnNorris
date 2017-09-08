package com.quinnnorris.ssm.bean;

import java.util.Date;

/**
 * Title: Article
 * Description:
 * Company: www.QuinnNorris.com
 *
 * @date: 2017/9/8 下午1:20 星期五
 * @author: quinn_norris
 * @version: 1.0
 */
public class Article {

    private int id;
    private String name;
    private Date createtime;
    private int author_id;
    private int readed;
    private int agree;
    private int notagree;
    private String artpath;
    private String artbrief;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public int getReaded() {
        return readed;
    }

    public void setReaded(int readed) {
        this.readed = readed;
    }

    public int getAgree() {
        return agree;
    }

    public void setAgree(int agree) {
        this.agree = agree;
    }

    public int getNotagree() {
        return notagree;
    }

    public void setNotagree(int notagree) {
        this.notagree = notagree;
    }

    public String getArtpath() {
        return artpath;
    }

    public void setArtpath(String artpath) {
        this.artpath = artpath;
    }

    public String getArtbrief() {
        return artbrief;
    }

    public void setArtbrief(String artbrief) {
        this.artbrief = artbrief;
    }
}
