package week_2.studentGradingSystem;

public class Teacher {
    String name;
    String mobilePhone;
    String branch;

    Teacher(String name,String mobilePhone,String branch){
        this.name = name;
        this.mobilePhone = mobilePhone;
        this.branch = branch;
    }

    void print(){
        System.out.println("Name :"+this.name);
        System.out.println("Mobile Phone :"+this.mobilePhone);
        System.out.println("Branch :"+this.branch);


    }
}
