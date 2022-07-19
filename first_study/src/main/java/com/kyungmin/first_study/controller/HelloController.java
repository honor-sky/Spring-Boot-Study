package com.kyungmin.first_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("HelloController")   // 웹 애플리케이션에서 /hello 라고 들어오면 이 메소드를 호출
    public String hello(Model model){
        model.addAttribute("data","hello!!"); // Name 이라는 attr에 "hello!!"라는 값을 추가
        return "hello";

    }

}
