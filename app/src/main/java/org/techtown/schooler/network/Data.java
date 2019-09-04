package org.techtown.schooler.network;

import org.techtown.schooler.Model.SchoolInformations;
import org.techtown.schooler.Model.User;

import java.util.List;

public class Data {

    // User
    private User user;

    // token
    private String token;

    private String authCode;

    private Integer classCount;

    // IsOverlapped (true, false 를 확인하는 것이다.)
    // true 면 중복 false 면 중복 X
    private Boolean isOverlapped;

    private List<SchoolInformations> schoolInfo;

    public Integer getClassCount() {
        return classCount;
    }

    public void setClassCount(Integer classCount) {
        this.classCount = classCount;
    }

    public List<SchoolInformations> getSchoolInfo() {
        return schoolInfo;
    }

    public void setSchoolInfo(List<SchoolInformations> schoolInfo) {
        this.schoolInfo = schoolInfo;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Boolean getOverlapped() {
        return isOverlapped;
    }

    public void setOverlapped(Boolean overlapped) {
        isOverlapped = overlapped;
    }





}