package com.yedam.app.dep.mapper;

import java.util.List;

import com.yedam.app.dep.service.DepVO;

public interface DepMapper {
	// 전체 조회
		public List<DepVO> getDepAll();
		
		// 단건 조회
		public DepVO getDepInfo(DepVO depVO);
		
		// 등록
		public int insertDepInfo(DepVO depVO);
}
