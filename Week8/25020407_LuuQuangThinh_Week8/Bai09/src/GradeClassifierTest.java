import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GradeClassifierTest {

    @Test
    public void testClassifyGrade() {
        assertEquals("Yếu", GradeClassifier.classifyGrade(0.0));
        assertEquals("Yếu", GradeClassifier.classifyGrade(4.9));

        assertEquals("Trung bình", GradeClassifier.classifyGrade(5.0));
        assertEquals("Trung bình", GradeClassifier.classifyGrade(6.0));

        assertEquals("Khá", GradeClassifier.classifyGrade(6.5));
        assertEquals("Khá", GradeClassifier.classifyGrade(7.9));

        assertEquals("Giỏi", GradeClassifier.classifyGrade(8.0));
        assertEquals("Giỏi", GradeClassifier.classifyGrade(10.0));
    }

    @Test
    public void testExceptions() {
        Exception ex1 = assertThrows(IllegalArgumentException.class, () -> GradeClassifier.classifyGrade(-0.1));
        assertEquals("GPA không hợp lệ: -0.1", ex1.getMessage());

        Exception ex2 = assertThrows(IllegalArgumentException.class, () -> GradeClassifier.classifyGrade(10.1));
        assertEquals("GPA không hợp lệ: 10.1", ex2.getMessage());
    }
}