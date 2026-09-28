package _oop_test.ch05;

public class Item {
    private String name;
    private String grade;

    // 생성자
    public Item(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    // getter
    public String getName() {
        return name;
    }
    public String getGrade() {
        return grade;
    }
}
