package com.yedam.app.dep.service;

import java.util.List;

public interface DepService {
	// 전체 조회
	public List<DepVO> getDepAll();
	
	// 단건 조회
	public DepVO getDepInfo(DepVO depVO);
	
	// 등록
	public int insertDepInfo(DepVO depVO);
}
