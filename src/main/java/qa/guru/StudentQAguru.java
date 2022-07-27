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

    public void studyingAnalysisOfStudent(StudentQAguru student) {
        System.out.println("Name: " + student.name + "," + " Age: " + student.age);
        if (DayStudyTime <= 1) {
            System.out.println("You should increase your studying time!");
            student.DayStudyTime += 1;
        } else if (DayStudyTime > 4) {
            System.out.println("Hold on buddy! Your head can boiled!");
            student.DayStudyTime = 4;
        } else {
            System.out.println("Your studying time is OK! Good job!");
        }

    }

    public void workingAnalysisOfStudent(StudentQAguru student) {
        System.out.println("Name: " + student.name + "," + " Age: " + student.age);
        if (DayWorkTime < 8) {
            System.out.println("You should increase your work time to earn more money!");
            student.DayStudyTime = 8;
        } else if (DayStudyTime > 8) {
            System.out.println("Hold on buddy! Your head can boiled!");
            student.DayStudyTime = 8;
        } else {
            System.out.println("Your working time is OK! Good job!");
        }
    }
    public void sleepingAnalysisOfStudent (StudentQAguru student) {
            System.out.println("Name: " + student.name + "," + " Age: " + student.age);
            if (DaySleepTime < 8) {
                System.out.println("You should increase your sleep time to have a good rest!");
                student.DaySleepTime = 8;
            } else if (DaySleepTime > 8) {
                System.out.println("I dont like this fact! Sorry)");
                student.DayStudyTime = 8;
            } else {
                System.out.println("Your sleeping time is OK!");
            }
        }
    public void freeTimeOfStudent(StudentQAguru student){
        if ((student.DayStudyTime + student.DayWorkTime + student.DaySleepTime) <24) {
            System.out.println("I have good news: we go to the bar tonight!)))");
        } else {
            System.out.println("Life is so hard... Be strong buddy!");
        }
    }
    }
