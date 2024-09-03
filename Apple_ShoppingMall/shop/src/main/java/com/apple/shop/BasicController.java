package com.apple.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class BasicController {
    @GetMapping("/") // 누가 메인페이지에 접속하면
    /*@ResponseBody*/ // 문자 그대로 보내주세요
    String hello() {
        return "index.html"; // 폴더명/파일명
    }

    @GetMapping("/about") // 누가 /URL에 접속하면
    @ResponseBody
    String about() {
        return "돌아가요"; // 돌아가요 출력
    }

    @GetMapping("/mypage")
    @ResponseBody
    String mypage() {
        return "마이페이지입니다~";
    }

    @GetMapping("/nicetomeetyou")
    @ResponseBody
    String nicetomeetyou() {
        return "<h4>반갑습니다</h4>";
    }

    @GetMapping("/date")
    @ResponseBody
    String date() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }

    @GetMapping("/date2")
    @ResponseBody
    String date2() {
        return ZonedDateTime.now().toString();
    }
}
