package com.example.project.controller;

import com.example.project.dto.BoardForm;
import com.example.project.entity.Board;
import com.example.project.repository.BoardRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Slf4j
@Controller
public class BoardsController {

    @Autowired
    private BoardRepository boardRepository;

    @GetMapping("/boards/new")
    public String newBoardForm() {
        return "boards/new";
    }

    @PostMapping("/boards/create")
    public String createBoard(BoardForm boardform) {
        log.info(boardform.toString());

        //1. dto -> 엔티티 변환
        Board boardEntity = boardform.toEntity();

        //2. 리파지터리로 엔티티 DB에 저장
        Board saved = boardRepository.save(boardEntity);
        //System.out.println(saved.toString());
        log.info(boardform.toString());

        // sql = "Insert into board where id = 1 .... ;
        return "redirect:/boards/" + saved.getId();
    }

    @GetMapping("/boards/{id}")
    public String read(@PathVariable Long id, Model model){
        log.info("id :" +id);

        //1. id를 조회해서 데이터를 가져오기
        Board boardEntity = boardRepository.findById(id).orElse(null);

        //2. 모델에 데이터 등록하기
        model.addAttribute("board",boardEntity);

        //3. 뷰 페이지 반환하기
        return "boards/read";
    }

    //전체 조회 메서드
    @GetMapping("/boards")
    public String reads(Model model){

        //1. 모든 데이터 가져오기
        List<Board> boardEntityList = boardRepository.findAll();

        //2. 모델에 데이터 등록하기
        model.addAttribute("boardEntityList",boardEntityList);

        //3. 뷰 페이지 반환하기
        return "boards/reads";

    }
    @GetMapping("/boards/{id}/edit")
    public String edit(@PathVariable Long id , Model model){

        //1. id를 조회해 수정할 데이터 가져오기

        Board boardEntity = boardRepository.findById(id).orElse(null);

        //2. 모델에 데이터 등록하기
        model.addAttribute("board",boardEntity);

        //3. 뷰 페이지 반환하기
        return "/boards/edit";
    }

    @PostMapping("/boards/update")
    public String update(BoardForm boardform){
        log.info(boardform.toString());

        //1. dto를 엔티티로 반환하기
        Board boardEntiy = boardform.toEntity();
        //로그 찍기
        log.info(boardform.toString());

        //2, 엔티티를 DB에 저장하기.
        Board saved = boardRepository.findById(boardEntiy.getId()).orElse(null);

        if(saved != null){
            boardRepository.save(boardEntiy);
        }

        //로그 찍기
        log.info(boardform.toString());

        //상세페이지로 리다이렉트 하기
        return "redirect:/boards/" + saved.getId();
    }


    @GetMapping("/boards/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes msg) {
        log.info("삭제 요청이 들어왔습니다.");

        Board deleteData = boardRepository.findById(id).orElse(null);
        log.info(toString());

        if (deleteData != null) {
            boardRepository.delete(deleteData);
            msg.addFlashAttribute("message","삭제되었습니다.");
        }

        return "redirect:/boards";
    }


}
