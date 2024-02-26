package Week_2.StudentGradingSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Deniz","555","HISTORY");
        Teacher t2 = new Teacher("Einstein","999","PHYSIC");
        Teacher t3 = new Teacher("Eda","333","MATH");

        Course history = new Course("History","101","HISTORY");
        history.addTeacher(t1);

        Course physic = new Course("Physic", "102","PHYSIC");
        physic.addTeacher(t2);

        Course math = new Course("Mathematic","103","MATH");
        math.addTeacher(t3);

        Student s1 = new Student("Ali","0610","23", history,physic,math);
        s1.addBulkExamNote(100,54,67);
        s1.addBulkVerbalNote(30,78,80);
        s1.isPassed();

        Student s2 = new Student("Duman","22","5A",history,physic,math);
        s2.addBulkExamNote(10,17,19);
        s2.addBulkVerbalNote(45,67,87);
        s2.isPassed();

        Student s3 = new Student("Neşe","22","5A",history,physic,math);
        s3.addBulkExamNote(60,67,89);
        s3.addBulkVerbalNote(20,90,87);
        s3.isPassed();

    }
}
