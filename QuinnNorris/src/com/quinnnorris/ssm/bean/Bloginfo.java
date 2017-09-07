package com.quinnnorris.ssm.bean;

/**
 * Title: Bloginfo
 * Description:
 * Company: www.QuinnNorris.com
 *
 * @date: 2017/9/7 下午7:09 星期四
 * @author: quinn_norris
 * @version: 1.0
 */
public class Bloginfo {

    private int id;
    private String nickname;
    private int hits;
    private int score;
    private int articles;
    private int fans;
    private String note;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getArticles() {
        return articles;
    }

    public void setArticles(int articles) {
        this.articles = articles;
    }

    public int getFans() {
        return fans;
    }

    public void setFans(int fans) {
        this.fans = fans;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
