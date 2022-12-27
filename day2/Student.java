package day2;

public class Student {
    private String name;
    private int score;

    // 생성자
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // setter/getter
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
