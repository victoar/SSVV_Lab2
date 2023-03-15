package test;

import domain.Student;
import org.junit.Test;
import service.Service;
import validation.StudentValidator;
import validation.ValidationException;
import validation.Validator;

public class TestValidator {
    StudentValidator validator = new StudentValidator();

    @Test
    public void validate_validInput() {
        Student student = new Student("aaaa", "Alexandra Gog", 933);
        validator.validate(student);
        assert true;
    }

    @Test(expected = ValidationException.class)
    public void validate_invalidId() {
        Student student = new Student("", "Alexandra Gog", 933);
        validator.validate(student);
    }
}
