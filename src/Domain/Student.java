package Domain;

import java.sql.Date;

public class Student {
    private int id;
    private String name;
    private String gender;
    private Date birtDate;
    private int age;

    public Student() {
    }

    public Student(int id, String name, String gender, Date birtDate, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birtDate = birtDate;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(Date birtDate) {
        this.birtDate = birtDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return id +" "+ name +" "+ age +" "+ gender +" "+ birtDate;
    }
}