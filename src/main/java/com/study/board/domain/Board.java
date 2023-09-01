package com.study.board.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Setter
@Getter
@NoArgsConstructor
@EntityScan
public class Board {
    // 글 고유 아이디
}
