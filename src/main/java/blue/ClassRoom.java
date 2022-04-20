package blue;

import java.util.ArrayList;

public class ClassRoom {
    Student [] students;

    public ClassRoom(Student[] students) {
        this.students = students;
    }

    public ClassRoom(int maxNumberOfStudents){


    }
    public ClassRoom(){
        Student[]  studs = new Student[30];
    }

    public Student[] getStudents(Student [] students){

     return students;
    }

    public double getAverageExamScore(ArrayList<Double> examScores, double students){
        double sum = 0;

        for (int i = 0; i < examScores.size(); i++) {

            sum = sum + examScores.get(i);
        }
        double avg = sum /examScores.size();

        return avg /students;
    }

    public void addStudent(Student Student){


    }

    public void removeStudent(String firstName, String lastName){
        
    }

}
