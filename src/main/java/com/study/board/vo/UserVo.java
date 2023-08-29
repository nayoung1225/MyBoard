package com.study.board.vo;

import lombok.Data;

// 전체 User 엔티티 클래스
@Data // @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode 어노테이션을 한꺼번에 설정해주는 어노테이션
public class UserVo {
    private int userNo;
    private String userId;
    private String userPw;
    private String userName;
    private Grade grade;
    private String userAuth;
    private String appendDate;
    private String updateDate;

    public UserVo(int userNo, String userId, String userPw, String userName, Grade grade, String userAuth, String appendDate, String updateDate) {
        this.userNo = userNo;
        this.userId = userId;
        this.userPw = userPw;
        this.userName = userName;
        this.grade = grade;
        this.userAuth = userAuth;
        this.appendDate = appendDate;
        this.updateDate = updateDate;
    }

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public String getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(String userAuth) {
        this.userAuth = userAuth;
    }

    public String getAppendDate() {
        return appendDate;
    }

    public void setAppendDate(String appendDate) {
        this.appendDate = appendDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
} // UserVo
