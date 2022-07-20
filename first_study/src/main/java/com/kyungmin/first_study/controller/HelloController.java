package com.kyungmin.first_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("HelloController")   // 웹 애플리케이션 url이 /HelloController면 이 메소드를 호출하도록 맵핑
    public String hello(Model model){ // spring boot에서 model 제공
        model.addAttribute("data","hello!!"); // Name 이라는 attr에 "hello!!"라는 값을 추가
        return "hello";
        // controller가 viewResolver에  return 값인 hello와 model을 넘김
        // viewResolver는 resource:templates:"hello" 를 찾아 템플릿 엔진 처리 후 웹브라우저에 변환된 html이 그려짐
    }

}
