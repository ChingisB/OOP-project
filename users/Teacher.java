package users;

import java.io.Serializable;

public class Teacher extends Employee{

    public Teacher(){}

    public Teacher(String login, String password){
        super(login, password);
    }
}
