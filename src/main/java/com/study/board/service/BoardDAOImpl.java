package com.study.board.service;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.study.board.dao.BoardDAO;
import com.study.board.dto.BoardDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class BoardDAOImpl implements BoardDAO {
    @JacksonInject
    SqlSession sqlsession;

    @Override
    public List<BoardDTO> boardList() throws Exception {
        return sqlsession.selectList("board.boardList");
    }

    @Override
    public List<BoardDTO> boardDTOList() throws Exception {
        return null;
    }

}
