package labmid;

import labmid.filters.*;
import labmid.model.Student;

public class AdmissionService {
    private final AdmissionPipeline pipeline; // For managing filters
    private final AdmissionSubject subject; // For sending notifications

    public AdmissionService() {
        pipeline = new AdmissionPipeline();
        subject = new AdmissionSubject();

        // Add filters to the pipeline
        pipeline.addFilter(new EligibilityFilter());
        pipeline.addFilter(new TestFilter());
        pipeline.addFilter(new InterviewFilter());
    }

    // Register a candidate (observer) to receive notifications
    public void addCandidate(Student student) {
        subject.attach(student);
    }

    // Process student admission
    public void admitStudent(Student student) {
        boolean isQualified = true;

        // Execute all filters in the pipeline
        for (AdmissionFilter filter : pipeline.getFilters()) {
            if (!filter.execute(student)) {
                // Notify the student about disqualification
                subject.notifyObserver(student, filter.getFailureMessage());
                isQualified = false;
                break; // Stop processing further
            } else {
                // Notify the student about success
                subject.notifyObserver(student, filter.getSuccessMessage());
            }
        }

        // If the student passes all filters
        if (isQualified) {
            subject.notifyObserver(student, "Congratulations! You are admitted.");
        }
    }
}
