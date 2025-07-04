package com.example.project.dto;

import com.example.project.entity.Board;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BoardForm {
    private Long id;
    private String title;
    private String content;

    public Board toEntity() {
        return new Board(id, title, content);
    }
}
