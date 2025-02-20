package com.spring.app.document.service;

import java.util.List;
import java.util.Map;

import com.spring.app.document.domain.DocumentVO;
import com.spring.app.employee.domain.EmployeeVO;

public interface DocumentService {

	// 휴가신청서 결재 요청
	int annualDraft(Map<String, String> paraMap);

	// 임시저장 문서 리스트 가져오기
	List<DocumentVO> tempList(String employeeNo);

	// 기안 문서 리스트 가져오기
	List<DocumentVO> myDocumentList(String employeeNo);

	// 부서 문서 리스트 가져오기
	List<DocumentVO> deptDocumentList(String employeeNo);

	// 조직도에 뿌려주기 위한 사원 목록 가져오기
	List<EmployeeVO> getEmployeeList();

	
}
