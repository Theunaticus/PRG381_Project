package DataObjects;

public class Student {
    int student_id;
    String student_name;
    String student_address;
    String student_email;
    String student_password;

    public Boolean CheckPassword (String Password){
        return Password==student_password;
    }
}
