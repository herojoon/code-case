package com.herojoon.codecase.controller;

import com.herojoon.codecase.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("board")
@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    /**
     * 게시글 등록
     */
    @GetMapping("register")  // test를 위해서 Get Method 사용함.
    public void registerBoard() {
        Map<String, Object> params = new HashMap<>();
        params.put("board_title", "제목");
        params.put("board_content", "내용");
        params.put("board_writer", "글쓴이");
        boardService.registerBoard(params);
    }

    /**
     * 게시글 조회
     * 결과: {"board_title":"제목","board_no":1,"board_writer":"글쓴이","board_content":"내용","board_write_dt":"2021-04-05T01:12:26"}
     * @param boardNo
     * @return
     */
    @GetMapping("search")
    public Map<String, Object> searchBoard(@RequestParam("boardNo") Integer boardNo) {
        if (boardNo == null) return null;
        return boardService.searchBoard(boardNo);
    }

    /**
     * 게시글 조회 (key에 CamelCase 적용)
     * 결과: {"boardTitle":"제목","boardWriteDt":"2021-04-05T01:12:26","boardWriter":"글쓴이","boardContent":"내용","boardNo":1}
     * @param boardNo
     * @return
     */
    @GetMapping("search/camelcase")
    public Map<String, Object> searchBoardForCamelCase(@RequestParam("boardNo") Integer boardNo) {
        if (boardNo == null) return null;
        return boardService.searchBoardForCamelCase(boardNo);
    }
}
