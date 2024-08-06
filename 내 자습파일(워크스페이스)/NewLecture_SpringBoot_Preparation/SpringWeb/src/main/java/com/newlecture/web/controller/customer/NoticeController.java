package com.newlecture.web.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController : 문자를 읽어오려면 RestContoller
@Controller // 뷰페이지를 불러오려면 그냥 Controller
@RequestMapping("/customer/notice/")
public class NoticeController {
	
	@RequestMapping("list") // list, detail, edit, register => 담당 notice컨트롤러
	public String list(Model model) { // Spring MVC lib가 이 함수를 호출
		
		model.addAttribute("test", "Hello~");
		return "customer/notice/list"; // RequestMapping의 경로와 같다면 생략가능
	}
	  
	@RequestMapping("detail") // list, detail, edit, register => 담당 notice컨트롤러
	public String detail() {
		return "customer/notice/detail";
	}
	
	@RequestMapping("yunsop") // list, detail, edit, register => 담당 notice컨트롤러
	public String yunsop() {
		return "customer/notice/yunsop";
	}
}


// src의 webapp에도 RequstMapping의 경로처럼 똑같이 폴더를 만들어주면 좋음

// "/WEB-INF/view/customer/notice/list.jsp" 처럼 긴 것을 간단히 해주는 거 머 없을까? => View Resolver