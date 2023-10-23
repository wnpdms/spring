package com.yedam.app.emp.service;

import java.util.Date;

import lombok.Data;

@Data
public class EmpVO {
//	private String employee_id;
//	private String first_name;
//	private String last_name;
//	private String email;
//	private String hire_date;
//	private String job_id;
//	private String department_id;
//	private String salary;
	
	// 1) 컬럼따라 타입을 구분 or 실제 타입 대신 String 사용.
	// 2) 기본타입(int, double 등) or Wrap 클래스 (Integer, Double)
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private Date hireDate;
	private String jobId;
	private double salary;
	private Double commissionPct;
	private Integer managerId;
	private Integer departmentId;
}
