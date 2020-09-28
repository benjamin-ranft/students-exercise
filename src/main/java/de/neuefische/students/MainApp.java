package de.neuefische.students;

import de.neuefische.students.model.Student;

public class MainApp {

    public static void main(String[] args) {

        Student student = new Student("Heinz");
        //student.setName("Heinz");

        Student student2 = new Student("Heinz");
        //student2.setName("Patrick");
        //System.out.println(student2.getName());

        System.out.println(student.toString());

    }

}
