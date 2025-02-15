package com.spring.app.employee.domain;


public class EmployeeVO {

	 private String employeeNo;         // 사번
	 private String FK_positionNo;      // 직급번호
     private String FK_teamNo;         // 팀번호
     private String passwd;             // 비밀번호
     private String name;               // 이름
     private String securityLevel;     // 보안등급 // 0 < level <10
     private String email;              // 이메일
     private String mobile;             // 전화번호
     private String directCal;          // 내선번호
     private String bank;               // 은행  
     private String account;            // 계좌번호
     private String maritalStatus;		// 결혼유무(0: 결혼, 1: 미혼)
     private String disability;         // 장애여부(0: y, 1: n)
     private String employmentType;     // 채용구분(0: 신입, 1: 경력)
     private String registerDate;       // 입사일
     private String salary;             // 기본급
     private String status;             // 재직상태(1: 재직)
     private String lastDate;           // 퇴직일
     private String reasonForLeaving;   // 퇴직사유
     private String birth;				// 생년월일
     private String profileImg;			// 프로필 사진
     private int    lastChangePwd;		// 마지막 비밀번호 변경일
     private String motive;				// 동기
     private String departmentNo;		//부서번호
	
     private boolean requireLastChangePwd = false; 
     
    /////////////////////////////////////////
    
     
    public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}
	
	public String getFK_positionNo() {
		return FK_positionNo;
	}
	
	public void setFK_positionNo(String fK_positionNo) {
		FK_positionNo = fK_positionNo;
	}
	
	public String getFK_teamNo() {
		return FK_teamNo;
	}
	public void setFK_teamNo(String fK_teamNo) {
		FK_teamNo = fK_teamNo;
	}
	
	public String getPasswd() {
		return passwd;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSecurityLevel() {
		return securityLevel;
	}
	
	public void setSecurityLevel(String securityLevel) {
		this.securityLevel = securityLevel;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDirectCal() {
		return directCal;
	}
	
	public void setDirectCal(String directCal) {
		this.directCal = directCal;
	}
	
	public String getBank() {
		return bank;
	}
	
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	public String getAccount() {
		return account;
	}
	
	public void setAccount(String account) {
		this.account = account;
	}
	
	public String getMaritalStatus() {
		return maritalStatus;
	}
	
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getDisability() {
		return disability;
	}
	
	public void setDisability(String disability) {
		this.disability = disability;
	}
	public String getEmploymentType() {
		return employmentType;
	}
	
	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	
	public String getSalary() {
		return salary;
	}
	
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getLastDate() {
		return lastDate;
	}
	
	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}
	
	public String getReasonForLeaving() {
		return reasonForLeaving;
	}
	
	public void setReasonForLeaving(String reasonForLeaving) {
		this.reasonForLeaving = reasonForLeaving;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getProfileImg() {
		return profileImg;
	}

	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}

	public int getLastChangePwd() {
		return lastChangePwd;
	}

	public void setLastChangePwd(int lastChangePwd) {
		this.lastChangePwd = lastChangePwd;
	}

	public boolean isRequireLastChangePwd() {
		return requireLastChangePwd;
	}

	public void setRequireLastChangePwd(boolean requireLastChangePwd) {
		this.requireLastChangePwd = requireLastChangePwd;
	}

	public String getMotive() {
		return motive;
	}

	public void setMotive(String motive) {
		this.motive = motive;
	}

	public String getDepartmentNo() {
		return departmentNo;
	}

	public void setDepartmentNo(String departmentNo) {
		this.departmentNo = departmentNo;
	}
	
	
	
	
     
     
	
}
