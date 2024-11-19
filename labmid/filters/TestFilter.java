package labmid.filters;

import labmid.model.Student;

public class TestFilter implements AdmissionFilter {
    @Override
    public boolean execute(Student student) {
        return student.getTestScore() >= 50;
    }

    @Override
    public String getSuccessMessage() {
        return "Test passed.";
    }

    @Override
    public String getFailureMessage() {
        return "Test failed. You are disqualified.";
    }
}
