package week_2.StudentGradingSystem;

public class Student {
    Course course1;
    Course course2;
    Course course3;
    String name;
    String studentNo;
    String classes;
    double avarage;
    boolean isPassed;


    Student(String name,String studentNo,String classes,Course course1,Course course2,Course course3){
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.avarage = 0.0;
        this.isPassed = false;
    }

    void addBulkExamNote(int note1, int note2, int note3){
        if (note1 >= 0 && note1 <= 100){
            this.course1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100){
            this.course2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100){
            this.course3.note = note3;
        }

    }

    void addBulkVerbalNote(int verbalNote1, int verbalNote2, int verbalNote3){
        if (verbalNote1 >= 0 && verbalNote1 <= 100){
            this.course1.verbalNote = verbalNote1;
        }
        if (verbalNote2 >= 0 && verbalNote2 <= 100){
            this.course2.verbalNote = verbalNote2;
        }
        if (verbalNote3 >= 0 && verbalNote3 <= 100){
            this.course3.verbalNote = verbalNote3;
        }
    }

    void printNote(){
        System.out.println(this.course1.name+"Note\t:"+this.course1.note);
        System.out.println(this.course2.name+"Note\t:"+this.course2.note);
        System.out.println(this.course3.name+"Note\t:"+this.course3.note);
        System.out.println(this.course1.name+"Note\t:"+this.course1.verbalNote);
        System.out.println(this.course2.name+"Note\t:"+this.course2.verbalNote);
        System.out.println(this.course3.name+"Note\t:"+this.course3.verbalNote);
        System.out.println("Avarage Note\t:"+this.avarage);
        System.out.println("===================================================");

    }

    void isPassed(){
        this.avarage = (((this.course1.note + this.course2.note + this.course3.note)*0.8) + ((this.course1.verbalNote + this.course2.verbalNote + this.course3.verbalNote)*0.2)) / 3;
        if (this.avarage > 55){
            System.out.println("Passed!");
            this.isPassed = true;
        } else {
            System.out.println("Sorry , You couldn't pass.");
            this.isPassed = false;
        }
        printNote();
    }





}


