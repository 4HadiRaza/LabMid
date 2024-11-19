package labmid;

import labmid.filters.*;
import labmid.model.Student;

public class AdmissionService {
    private final AdmissionPipeline pipeline; 
    private final AdmissionSubject subject; 

    public AdmissionService() {
        pipeline = new AdmissionPipeline();
        subject = new AdmissionSubject();

        pipeline.addFilter(new EligibilityFilter());
        pipeline.addFilter(new TestFilter());
        pipeline.addFilter(new InterviewFilter());
    }

    public void addCandidate(Student student) {
        subject.attach(student);
    }

    public void admitStudent(Student student) {
        boolean isQualified = true;

        for (AdmissionFilter filter : pipeline.getFilters()) {
            if (!filter.execute(student)) {
                subject.notifyObserver(student, filter.getFailureMessage());
                isQualified = false;
                break; 
            } else {
                subject.notifyObserver(student, filter.getSuccessMessage());
            }
        }

        if (isQualified) {
            subject.notifyObserver(student, "Congratulations! You are admitted.");
        }
    }
}
