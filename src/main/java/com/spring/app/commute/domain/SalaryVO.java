package com.spring.app.commute.domain;

public class SalaryVO {

	private String seq_salary; 		// 급여명세번호
	private String overtimePay;		// 야근수당
	private String incentive;		// 인센티브
	private String paymentDate;		// 지급일자
	private String salary;			// 기본급
	
	
	
	
	
	
	
	
	public String getSeq_salary() {
		return seq_salary;
	}
	public void setSeq_salary(String seq_salary) {
		this.seq_salary = seq_salary;
	}
	public String getOvertimePay() {
		return overtimePay;
	}
	public void setOvertimePay(String overtimePay) {
		this.overtimePay = overtimePay;
	}
	public String getIncentive() {
		return incentive;
	}
	public void setIncentive(String incentive) {
		this.incentive = incentive;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
	
	
}
