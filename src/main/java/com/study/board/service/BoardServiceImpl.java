package com.study.board.service;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.study.board.dao.BoardDAO;
import com.study.board.dto.BoardDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {
    @JacksonInject
    BoardDAO boardDao;

    @Override
    public List<BoardDTO> boardList() throws Exception {
        return boardDao.boardList();
    }
}
