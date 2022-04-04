package com.herojoon.codecase.service;

import com.herojoon.codecase.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    /**
     * 게시글 등록
     */
    public void registerBoard(Map<String, Object> params) {
        boardRepository.insertBoard(params);
    }

    /**
     * 게시글 조회
     * @param boardNo
     * @return
     */
    public Map<String, Object> searchBoard(int boardNo) {
        return boardRepository.selectBoard(boardNo);
    }

    /**
     * 게시글 조회 (key에 CamelCase 적용)
     * @param boardNo
     * @return
     */
    public Map<String, Object> searchBoardForCamelCase(int boardNo) {
        return boardRepository.selectBoardForCamelCase(boardNo);
    }
}
