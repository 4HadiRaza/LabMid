package labmid.filters;

import labmid.model.Student;

public class InterviewFilter implements AdmissionFilter {
    @Override
    public boolean execute(Student student) {
        return student.getInterviewScore() >= 60;
    }

    @Override
    public String getSuccessMessage() {
        return "Interview passed.";
    }

    @Override
    public String getFailureMessage() {
        return "Interview failed. You are disqualified.";
    }
}
