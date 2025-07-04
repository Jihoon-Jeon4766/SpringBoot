package com.example.project.api;

import com.example.project.dto.BoardForm;
import com.example.project.entity.Board;
import com.example.project.repository.BoardRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class BoardAPIController {

    //의존성 주입
    @Autowired
    private BoardRepository boardRepository;

    // GET
    @GetMapping("/api/boards")
    public List<Board> readBoard(){
        return boardRepository.findAll(); // JSON 데이터 반환..
    }

    @GetMapping("/api/boards/{id}")
    public Board readBoard(@PathVariable Long id){

        return boardRepository.findById(id).orElse(null);

    }

    //게시글 생성
    @PostMapping("/api/boards/create")
    public Board createBoard(@RequestBody BoardForm form){
        Board board = form.toEntity();

        return boardRepository.save(board);
    }

    @PatchMapping("/api/boards/{id}/edit")
    public ResponseEntity<Board> update(@RequestBody BoardForm form, @PathVariable Long id) {
        Board board = form.toEntity();

        log.info("id : {} board : {} ", id, board.toString());

        Board savedata = boardRepository.findById(id).orElse(null);

        if (savedata == null || id != board.getId()) {
            log.info("잘못된 요청 id : {} board : {}", id, board.toString());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }

        savedata.patch(board); //기존 데이터 -> 새로운 데이터 갖다 붙이기.
        Board updatedata = boardRepository.save(savedata);
        return ResponseEntity.status(HttpStatus.OK).body(updatedata); //수정된 데이터 DB에 저장.
    }
}
