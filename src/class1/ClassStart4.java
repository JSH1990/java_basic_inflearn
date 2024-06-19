package class1;

public class ClassStart4 {

    public static void main(String[] args) {
        // Student 객체 생성
        Student s1 = new Student("학생1", 18, 60);
        Student s2 = new Student("학생2", 19, 80);

        // Student 배열 생성
        Student[] students = {s1, s2};

        System.out.println("s1 = " + s1);
        System.out.println("students = " + students);

        // for 루프 수정
        for(Student student1 : students) {
            // 학생 정보 출력
            System.out.println("이름: " + student1.getName() + ", 나이: " + student1.getAge() + ", 점수: " + student1.getScore());
        }
    }
}

// Student 클래스 정의
class Student {
    private String name;
    private int age;
    private int score;

    // 생성자
    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // 게터 메서드
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }
}
