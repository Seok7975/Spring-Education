package com.apple.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ContentController {

    private final ContentRepository contentRepository;

    @GetMapping("/content")
        /*@ResponseBody*/ // 데이터만 보내고 싶을 때 사용
    String content(Model model) {
//        model.addAttribute("전달할데이터이름", "데이터");
//        데이터가 전달할데이터이름으로 .html에 전달됨

        List<Content> result = contentRepository.findAll(); // 모든 테이블을 가져옴
        model.addAttribute("contents", result);


        var b = new Content();
        System.out.println(result);

        return "Content.html";
    }
}
