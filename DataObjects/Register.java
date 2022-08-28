package DataObjects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Register {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int RegisterId;
    private String student_name;
    private String student_address;
    private String student_email;
    private String student_password;
    private String course_name;
}
