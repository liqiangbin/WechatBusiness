package com.cn.hnust.pojo;

import java.util.Date;

public class User {
    private Integer id;

    private String name;

    private String weixin;

    private String refereeWeixin;

    private String tel;

    private Date createtime;

    private Integer leaderid;
    
    private String agentweixin;

    
    public String getAgentweixin() {
		return agentweixin;
	}

	public void setAgentweixin(String agentweixin) {
		this.agentweixin = agentweixin;
	}

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

    public String getRefereeWeixin() {
        return refereeWeixin;
    }

    public void setRefereeWeixin(String refereeWeixin) {
        this.refereeWeixin = refereeWeixin == null ? null : refereeWeixin.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }


    public Integer getLeaderid() {
        return leaderid;
    }

    public void setLeaderid(Integer leaderid) {
        this.leaderid = leaderid;
    }
}