package com.cn.hnust.pojo;

import java.util.Date;

public class Agent {
    private Integer id;

    private String name;

    private String weixin;

    private String tel;

    private String refereeWeixin;

    private String leaderid1;

    private String type;

    private Date createtime;

    private Integer leaderid2;

    private Integer level;

    private Integer countSubAgents;

    private Integer countUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getRefereeWeixin() {
        return refereeWeixin;
    }

    public void setRefereeWeixin(String refereeWeixin) {
        this.refereeWeixin = refereeWeixin == null ? null : refereeWeixin.trim();
    }

    public String getLeaderid1() {
        return leaderid1;
    }

    public void setLeaderid1(String leaderid1) {
        this.leaderid1 = leaderid1;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getLeaderid2() {
        return leaderid2;
    }

    public void setLeaderid2(Integer leaderid2) {
        this.leaderid2 = leaderid2;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getCountSubAgents() {
        return countSubAgents;
    }

    public void setCountSubAgents(Integer countSubAgents) {
        this.countSubAgents = countSubAgents;
    }

    public Integer getCountUser() {
        return countUser;
    }

    public void setCountUser(Integer countUser) {
        this.countUser = countUser;
    }
}