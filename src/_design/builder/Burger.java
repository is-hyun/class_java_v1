package _design.builder;

public class Burger {

    private String bread;
    private String patty;
    private String sauce;

    // 1. private 생성자. 외부에서 new 키워드로 객체 생성 불가능
    // 2. 빌더의 build() 메서드를 통해서만 객체 생성

    // 생성자
    private Burger(Builder builder) {
        // Burger 필드(this)에 빌더 필드 값 대입해서 객체 생성
        this.bread = builder.bread;
        this.patty = builder.patty;
        this.sauce = builder.sauce;
    }

    // 정적 내부 클래스 설계
    public static class Builder {
        private String bread;
        private String patty;
        private String sauce;

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }
        public Builder patty(String patty) {
            this.patty = patty;
            return this;
        }
        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        // 핵심 메서드(마지막에 호출) : Burger 객체 생성 후 반환
        public Burger build() {
            // 외부 클래스 생성
            return new Burger(this);
        }
    } // end of inner class

    // TODO - toString 수정
    @Override
    public String toString() {
        return String.format(
                "bread : " + bread +
                " | patty : " + patty +
                " | sauce : " + sauce
        );
    }
}
