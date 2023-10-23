package com.yedam.app.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.app.emp.service.EmpVO;

public interface EmpMapper {
	// 전체조회 (다건조회)
	public List<EmpVO> selectAllEmpInfo();
	// 사원조회 (단건조회)
	public EmpVO selectEmpInfo(EmpVO empVO);
	// 등록
	public int insertEmpInfo(EmpVO empVO);
	
	// 수정
	public int updateEmpInfo(EmpVO empVO);
	
	// 수정 : Dynamic SQL
	public int updateEmpInfoDynamic(EmpVO empVo);
	
	// 삭제
	public int deleteEmpInfo(@Param("empid") int employeeId);
}
