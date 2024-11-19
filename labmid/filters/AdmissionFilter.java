package labmid.filters;

import labmid.model.Student;

public interface AdmissionFilter {
    boolean execute(Student student);

    String getSuccessMessage();

    String getFailureMessage();
}
