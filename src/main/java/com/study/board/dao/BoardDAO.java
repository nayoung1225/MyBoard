package com.study.board.dao;


import com.study.board.dto.BoardDTO;

import java.util.List;


public interface BoardDAO {
    // 게시물 목록 보기
    public List<BoardDTO> boardList() throws Exception;

    List<BoardDTO> boardDTOList() throws Exception;
}
