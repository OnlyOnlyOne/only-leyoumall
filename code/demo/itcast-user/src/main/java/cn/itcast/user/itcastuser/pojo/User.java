package cn.itcast.user.itcastuser.pojo;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
    * 用户表 
    */
@Table(name = "imooc_mall_user")
public class User {
    /**
    * 用户id
    */
    @Id
    private Integer id;

    /**
    * 用户名
    */
    private String username;

    /**
    * 用户密码，MD5加密
    */
    private String password;

    /**
    * 个性签名
    */
    private String personalizedSignature;

    /**
    * 角色，1-普通用户，2-管理员
    */
    private Integer role;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPersonalizedSignature() {
        return personalizedSignature;
    }

    public void setPersonalizedSignature(String personalizedSignature) {
        this.personalizedSignature = personalizedSignature;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}