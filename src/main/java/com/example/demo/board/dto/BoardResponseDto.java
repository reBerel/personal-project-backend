package com.example.demo.board.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardResponseDto {
    private Long boardId;
    private String writer;
    private String title;
    private String content;
    private Integer likeCount;
    private Integer readCount;
    private Integer replyCount;
}
