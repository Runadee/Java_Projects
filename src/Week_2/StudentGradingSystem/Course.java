package Week_2.StudentGradingSystem;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;

    Course(String name,String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;

        } else {
            System.out.println("teacher and course department do not match\n");
        }


    }

    void printTeacherInfo(){
        this.teacher.print();
    }
}
