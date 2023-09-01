package com.study.board.controller;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.study.board.dto.BoardDTO;
import com.study.board.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller // 컨트롤러 역할을 수행
@RequestMapping("/board/**") // "/board/"로 접근하는 url 처리를 이 클래스인 BoardController 에서 맡는다
public class BoardController {

    @JacksonInject
    BoardService boardService;

    // 과거 ModelAndView를 활용한 방법
//    @RequestMapping("list.do")
//    public ModelAndView boardMenu() throws Exception {
//        List<BoardDTO> list = boardService.boardList();
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("board/board_list");
//        mav.addObject("list", list);
//        return mav; // board/board_list.jsp로 이동
//    }

    // 현재 자주 쓰는 Model 클래스를 DI 하는 방법
    @RequestMapping("list.do")
    public String boardList(Model model) throws Exception {
        List<BoardDTO> list = boardService.boardList(); // list 변수에 결과 값을 담는다
        model.addAttribute("list", list); // model에 데이터 값을 담는다
        return "board/board_list"; // board/board_list.jsp로 이동
    }

    @GetMapping("/hello") // "/hello"로 접근하는 url 처리를 이 클래스인 BoardController 에서 맡는다
    public String Hello() {
        return "/boards/hello";
    }
}
