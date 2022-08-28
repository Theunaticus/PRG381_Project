package DataObjects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int student_id;
    private String student_name;
    private String student_address;
    private String student_email;
    private String student_password;

    public Boolean CheckPassword (String Password){
        return Password==student_password;
    }
}
