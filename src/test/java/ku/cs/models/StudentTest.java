package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s;
    @BeforeEach
    void setup(){
        s = new Student("6710450597", "test");
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45")
    void testaddScore(){
        s.addScore(45);
        assertEquals(45, s.getScore());
    }

    @Test
    void testCalculateGrade(){
        s.addScore(80);
        assertEquals("A", s.grade());
    }

    @Test
    void testchangeName(){
        s.changeName("Hiii");
        assertEquals("Hiii", s.getName());
    }

    @Test
    void testisId(){
        assertEquals(true, s.isId("6710450597"));
    }

    @Test
    void testisNameContains(){
        assertEquals(true, s.isNameContains("Test"));
    }


}