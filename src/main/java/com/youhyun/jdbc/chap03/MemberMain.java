package com.youhyun.jdbc.chap03;

public class MemberMain {

    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();
        MemberRegisterService regService = new MemberRegisterService();
        regService.setMemberDao(memberDao);

        // registerRequest 초기화
        RegisterRequest req = new RegisterRequest();
        req.setEmail("yh_@naver.com");
        req.setPassword("1002");
        req.setName("yh");

        // 회원 등록
        regService.regist(req);
    }
}

 