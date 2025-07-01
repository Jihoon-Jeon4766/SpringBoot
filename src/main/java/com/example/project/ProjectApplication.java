package com.example.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
//				.getBean(ProjectApplication.class).execute1();
//				.getBean(ProjectApplication.class).execute2();

	}
//	@Autowired
//	private MemberService memberService;
//
//	public void execute2() {
//		memberService.register("전지훈");
//	}

//	@Autowired
//	Greet greet;
//
//	private void execute1() {
//		greet.greeting(); //메서드 호출.
//	}


}