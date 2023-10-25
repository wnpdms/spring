package com.yedam.app.board.mapper;

import java.util.List;
import java.util.Map;

import com.yedam.app.board.service.BoardVO;

public interface BoardMapper {
	// 전체
	public List<BoardVO> getBoardList();
	
	// 단건 (조건 : bno)
	public BoardVO getBoard(BoardVO boardVO);
	
	// 등록 (대상 : bno(selectkey), title, contents, writer, image)
	public int insertBoard(BoardVO boardVO);
	
	// 수정 (대상 : title, contents, writer, updatedate, image)
	public int updateBoard(BoardVO boardVO);
	
	// 삭제 (조건 : bno)
	public int deleteBoard(int boardNo);
}
