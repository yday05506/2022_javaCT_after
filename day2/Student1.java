package day2;

public class Student1 implements Comparable<Student1> {
    private String name;
    private int score;

    // 생성자
    public Student1(String name, int score) {
        super();
        this.name = name;
        this.score = score;
    }

    // getter/setter
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student1 o) {
        return Integer.compare(score, o.score);
    }
}
