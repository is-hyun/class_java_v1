package _design.builder;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String bloodType;

    // 생성자
    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.bloodType = builder.bloodType;
    }

    // 내부 클래스
    public static class Builder {
        private String name;
        private int age;
        private String gender;
        private String bloodType;

        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }
        public Builder bloodType(String bloodType) {
            this.bloodType = bloodType;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
