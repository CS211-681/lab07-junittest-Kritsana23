package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentListTest {
    private StudentList s;

    @BeforeEach
    void setUp() {
        s = new StudentList();
        s.addNewStudent("6710450501", "Stu", 20);
    }

    @Test

    void testAddNewStudent() {
        s.addNewStudent("6710450502", "tstu", 15);
        assertEquals("6710450502", s.getStudents().get(1).getId());
        assertEquals("tstu", s.getStudents().get(1).getName());
        assertEquals(15, s.getStudents().get(1).getScore());

    }

    @Test

    void testFindStudentByID() {
        assertEquals("6710450501", s.getStudents().get(0).getId());
    }

    @Test

    void testFilterByName() {
        assertEquals("Stu", s.getStudents().get(0).getName());
    }

    @Test

    void testGiveScoreToId() {
        s.giveScoreToId("6710450501", 20.0);
        assertEquals(40, s.getStudents().get(0).getScore());
    }

    @Test

    void testViewGradeOfId() {
        assertEquals("F", s.getStudents().get(0).getGrade());
    }
}
