package com.youhyun.jdbc.chap04;

import com.youhyun.jdbc.chap03.RegisterRequest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * MemberRegisterService를 테스트한다.<br>
 * component scan으로 빈을 생성한다.
 * 
 * @author Youhyun
 */
public class MemberMainUsingComponentScan {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chap04.xml");
		MemberRegisterService regService = ctx.getBean("memberRegisterService",
				MemberRegisterService.class);
		
		// registerRequest 초기화
		RegisterRequest req = new RegisterRequest();
		req.setEmail("h3051710@naver.com");	
		req.setPassword("youhyun");
		req.setName("youhyun");

		// 회원 등록
		regService.regist(req);
		ctx.close();
	}
}