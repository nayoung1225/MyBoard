package com.study.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 컨트롤러 역할을 수행
@RequestMapping("/board/**") // "/board/"로 접근하는 url 처리를 이 클래스인 BoardController 에서 맡는다
public class BoardController {

    @GetMapping("/hello") // "/hello"로 접근하는 url 처리를 이 클래스인 BoardController 에서 맡는다
    public String Hello() {
        return "/boards/hello";
    }
}
