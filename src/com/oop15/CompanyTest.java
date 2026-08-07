package com.oop15;

public class CompanyTest {
    public static void main(String[] args) {

        // 1. 직원 객체를 각각 독립적으로 생성
        Employee emp1 = new Employee("김사원");
        Employee emp2 = new Employee("이대리");

        // 2. 회사 객체 생성 (최대 5명까지 채용 가능한 회사)
        Company company = new Company("테크코리아", 5);

        // 3. 회사가 직원을 고용 (배열에 저장)
        company.hireEmployee(emp1);
        company.hireEmployee(emp2);

        company.showCompanyInfo();
    }
}

