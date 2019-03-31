package com.youhyun.jdbc.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArticleMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("chap02.xml");
        ArticleService articleService = ctx.getBean("articleService", com.youhyun.jdbc.example.ArticleService.class);
        MemberService memberService = ctx.getBean("memberService", com.youhyun.jdbc.example.MemberService.class);

        articleService.addArticle();
        memberService.registerMember();

        ctx.close();
    }

}

 