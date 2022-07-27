package qa.guru;

public class StudentQAguru {
    String name;
    int age;
    int workTime;
    int sleepTime;
    int studyTime;

    public StudentQAguru(String name, int age, int workTime, int sleepTime, int studyTime) {
        this.name = name;
        this.age = age;
        this.workTime = workTime;
        this.sleepTime = sleepTime;
        this.studyTime = studyTime;
    }

    public void infoAboutStudent(StudentQAguru student){
        System.out.println("Name: " + student.name + "," +" Age: " + student.age);

    }
}
