package com.study.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/") // HTTP Method인 GET의 요청을 받을 수 있는 어노테이션
    public String hello(Model model){
        return "home";
    } // hello

} // end class