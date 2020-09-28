package de.neuefische.students;

import de.neuefische.students.model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void setName() {
        Student student = new Student("Heinz");
        //student.setName("Heinz");
        //String newName= "Heinz";
        //student.setName("Heinz");
        assertEquals("Heinz", student.getName("Heinz"));
    }

    @Test
    void setAge() {
    }

    @Test
    void setGoodStudent() {
    }
}