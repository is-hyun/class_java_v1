package com.oop15;

// 전체(Whole): 회사 클래스
public class Company {
    private String companyName;
    private Employee[] employees; // 일반 기본 배열 사용
    private int count;            // 현재 고용된 직원 수를 세는 변수

    // 회사 생성 시 최대 직원 수를 미리 정합니다.
    public Company(String companyName, int capacity) {
        this.companyName = companyName;
        this.employees = new Employee[capacity]; // 배열 크기 설정
        this.count = 0;
    }

    // 외부에서 생성된 Employee 객체를 배열에 넣음
    public void hireEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count] = employee;
            count++;
        } else {
            System.out.println("더 이상 직원을 채용할 수 없습니다.");
        }
    }

    public void showCompanyInfo() {
        System.out.println("회사명: " + companyName);
        System.out.println("직원 명단:");
        for (int i = 0; i < count; i++) {
            System.out.println("- " + employees[i].getName());
        }
    }
}
