package labmid.filters;

import labmid.model.Student;

public class EligibilityFilter implements AdmissionFilter {
    @Override
    public boolean execute(Student student) {
        return student.getAge() >= 18 && student.getGrade() >= 70;
    }

    @Override
    public String getSuccessMessage() {
        return "Eligibility check passed.";
    }

    @Override
    public String getFailureMessage() {
        return "Eligibility check failed. You are disqualified.";
    }
}
