package com.herojoon.codecase.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface BoardRepository {

    void insertBoard(Map<String, Object> params);

    Map<String, Object> selectBoard(@Param("board_no") int boardNo);

    Map<String, Object> selectBoardForCamelCase(@Param("board_no") int boardNo);
}
