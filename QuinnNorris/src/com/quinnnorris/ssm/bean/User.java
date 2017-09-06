package com.quinnnorris.ssm.bean;

import java.util.Date;

/**
 * Title: User
 * Description: user表映射bean对象
 * Company: www.QuinnNorris.com
 *
 * @date: 2017/9/5 下午7:07 星期二
 * @author: quinn_norris
 * @version: 1.0
 */
public class User {

    private int id;
    private String email;
    private String password;
    private String nickname;
    private String phone;
    private String sex;
    private String headp;
    private Date regtime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHeadp() { return headp; }

    public void setHeadp(String headp) { this.headp = headp; }

    public Date getRegtime() { return regtime; }

    public void setRegtime(Date regtime) { this.regtime = regtime; }
}
