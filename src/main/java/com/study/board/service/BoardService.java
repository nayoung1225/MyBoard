package com.study.board.service;

import com.study.board.dto.BoardDTO;

import java.util.List;

public interface BoardService {
    // 게시물 목록 조회
    public List<BoardDTO> boardList() throws Exception;
}
