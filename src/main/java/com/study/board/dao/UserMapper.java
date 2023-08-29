package com.study.board.dao;


import com.study.board.dto.UserDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

// 유저 정보를 DB에 저장하기 위한 Mapper 인터페이스 구현
@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user VALUES(#{Id}, #{Pw}, #{Gender})")
    void InsertUser(UserDto dto);
    @Select("SELECT * FROM user WHERE Id=#{Id}")
    UserDto selectOneUser(String Id);
    @Select("SELECT * FROM user")
    List<UserDto> selectAllUser();

}
