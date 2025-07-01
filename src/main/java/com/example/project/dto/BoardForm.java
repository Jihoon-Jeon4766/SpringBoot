package com.example.project.dto;

import com.example.project.entity.Board;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class BoardForm {
    private Long id;
    private String title;
    private String content;

    public Board toEntity() {
        return new Board(id, title, content);
    }
}
