package labmid;

import labmid.model.Student;

public class AdmissionSystem {
    public static void main(String[] args) {
        AdmissionService service = new AdmissionService();

        Student student1 = new Student("Umer", 19, 85);
        student1.setTestScore(70);
        student1.setInterviewScore(75);

        Student student2 = new Student("Hadi", 20, 90);
        student2.setTestScore(85);
        student2.setInterviewScore(80);

        Student student3 = new Student("Hassan", 18, 88);
        student3.setTestScore(60);
        student3.setInterviewScore(65);

        Student student4 = new Student("Huzaifa", 17, 78);
        student4.setTestScore(55);
        student4.setInterviewScore(50);

        Student student5 = new Student("AbuBakar", 21, 92);
        student5.setTestScore(95);
        student5.setInterviewScore(90);

        service.addCandidate(student1);
        service.addCandidate(student2);
        service.addCandidate(student3);
        service.addCandidate(student4);
        service.addCandidate(student5);

        service.admitStudent(student1); 
        service.admitStudent(student2); 
        service.admitStudent(student3); 
        service.admitStudent(student4); 
        service.admitStudent(student5); 
    }
}
