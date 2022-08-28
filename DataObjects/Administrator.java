package DataObjects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Administrator {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int Admin_id;
    private String Admin_name;
    private String password;
    private String contact;

    public  int GetID(){
            return Admin_id;
    }

    public  void    SetID (int value)    {
        Admin_id    =   value;
    }

    public  String  GetName ()  {
        return  Admin_name;
    }

    public  void SetName (String Name) {
        Admin_name  =   Name;
    }

    public  String GetPassword () {
        return  password;
    }

}
