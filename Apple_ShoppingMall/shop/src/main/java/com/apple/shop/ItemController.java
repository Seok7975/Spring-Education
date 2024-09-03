//list 페이지로 접속하면 상품목록 페이지 보내주자


package com.apple.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository itemRepository;

    //lombok쓰지 않는 정석적 방법
/*    @Autowired
    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }*/

    @GetMapping("/list")
    /*@ResponseBody*/ // 데이터만 보내고 싶을 때 사용
    String list(Model model) {
//        model.addAttribute("전달할데이터이름", "데이터");
//        데이터가 전달할데이터이름으로 .html에 전달됨

        List<Item> result = itemRepository.findAll(); // 모든 테이블을 가져옴
        model.addAttribute("items", result);

        System.out.println(result.get(0).price);
        System.out.println(result.get(0).title);

        ArrayList<Object> a = new ArrayList<>();
        a.add(30);
        a.add(40);
        System.out.println(a.get(0));

        var b = new Item();
        System.out.println(b.toString());

        return "list.html";
    }



}
