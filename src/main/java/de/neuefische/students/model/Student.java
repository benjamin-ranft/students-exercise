package de.neuefische.students.model;

public class Student {

    private String name;
    private int age = 27;
    private boolean goodStudent = true;

    public Student(String name) {
        this.name = name;
    }

    public String getName (){
        return name;
    }

    int getAge (){
        return age;
    }

    boolean getGoodStudent (){
        return goodStudent;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setAge (int age){
        this.age = age;
    }

    public void setGoodStudent (boolean goodStudent){
        this.goodStudent = goodStudent;
    }

    public String getName(String newName) {
        return name;
    }

    public String toString (){
        return name + " " + age + " " + goodStudent + " ";
    }
}
