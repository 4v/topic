package com.dyenigma.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Users extends BaseDomain {

    private Integer user_id;
    private String myid;
    private String account;
    private String name;
    private Integer organize_id;
    private String organizeName;
    private Integer dutyId;
    private Integer title_id;
    private String password;
    private String email;
    private String lang;
    private String theme;
    private Date first_visit;
    private Date previous_visit;
    private Date last_visits;
    private Integer login_count;
    private Integer isemployee;
    private String status;
    private String ip;
    private String description;
    private Integer question_id;
    private String answer;
    private Integer isonline;
    private Date created;
    private Date lastmod;
    private Integer creater;
    private Integer modifyer;
    private String tel;
    private Set<UserRole> userRoles = new HashSet<>(0);

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getMyid() {
        return myid;
    }

    public void setMyid(String myid) {
        this.myid = myid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrganize_id() {
        return organize_id;
    }

    public void setOrganize_id(Integer organize_id) {
        this.organize_id = organize_id;
    }

    public String getOrganizeName() {
        return organizeName;
    }

    public void setOrganizeName(String organizeName) {
        this.organizeName = organizeName;
    }

    public Integer getDutyId() {
        return dutyId;
    }

    public void setDutyId(Integer dutyId) {
        this.dutyId = dutyId;
    }

    public Integer getTitle_id() {
        return title_id;
    }

    public void setTitle_id(Integer title_id) {
        this.title_id = title_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Date getFirst_visit() {
        return first_visit;
    }

    public void setFirst_visit(Date first_visit) {
        this.first_visit = first_visit;
    }

    public Date getPrevious_visit() {
        return previous_visit;
    }

    public void setPrevious_visit(Date previous_visit) {
        this.previous_visit = previous_visit;
    }

    public Date getLast_visits() {
        return last_visits;
    }

    public void setLast_visits(Date last_visits) {
        this.last_visits = last_visits;
    }

    public Integer getLogin_count() {
        return login_count;
    }

    public void setLogin_count(Integer login_count) {
        this.login_count = login_count;
    }

    public Integer getIsemployee() {
        return isemployee;
    }

    public void setIsemployee(Integer isemployee) {
        this.isemployee = isemployee;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(Integer question_id) {
        this.question_id = question_id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getIsonline() {
        return isonline;
    }

    public void setIsonline(Integer isonline) {
        this.isonline = isonline;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastmod() {
        return lastmod;
    }

    public void setLastmod(Date lastmod) {
        this.lastmod = lastmod;
    }

    public Integer getCreater() {
        return creater;
    }

    public void setCreater(Integer creater) {
        this.creater = creater;
    }

    public Integer getModifyer() {
        return modifyer;
    }

    public void setModifyer(Integer modifyer) {
        this.modifyer = modifyer;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

}
