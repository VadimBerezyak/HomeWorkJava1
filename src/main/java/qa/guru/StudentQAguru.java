package qa.guru;

public class StudentQAguru {
    String name;
    int age;
    int DayWorkTime;
    int DaySleepTime;
    int DayStudyTime;

    public StudentQAguru(String name, int age, int workTime, int sleepTime, int studyTime) {
        this.name = name;
        this.age = age;
        this.DayWorkTime = workTime;
        this.DaySleepTime = sleepTime;
        this.DayStudyTime = studyTime;
    }

    public void infoAboutStudent(StudentQAguru student) {
        System.out.println("Name: " + student.name + "," + " Age: " + student.age);
        if (DayStudyTime <= 1) {
            System.out.println("You should increase your studying time!");
        } else if (DayStudyTime >= 4) {
            System.out.println("Hold on buddy! Your head can boiled!");
        } else {
            System.out.println("Your studying time is OK! Good job!");
        }

    }
}