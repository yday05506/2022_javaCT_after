package day1;

public class Student {
    private String name;
    private int score;

    // 매개변수 생성자
    public Student(String name, int score) {
        super();
        this.name = name;
        this.score = score;
    }

    // getter 메서드
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
