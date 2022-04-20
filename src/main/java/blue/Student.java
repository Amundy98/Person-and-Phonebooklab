package blue;

import java.util.ArrayList;

public class Student {

    private ArrayList<Double> examScores;

    private String firstName;
    private String lastName;


    public Student(String firstName, String lastName, ArrayList<Double>  examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public int getNumberOfExamsTaken(ArrayList<Double> examScores){


        return examScores.size();
    }


    public String getExamScores(){


        return "Exam Scores:" + examScores;
    }


    public void addExamScores(double examScore){
        examScores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore){
       examScores.set(examNumber,newScore);

    }

    public double getAverageExamScore(ArrayList<Double> examScores){
        double sum = 0;

        for (int i = 0; i < examScores.size(); i++) {

            sum = sum + examScores.get(i);
        }

        return sum /examScores.size();
    }


    @Override
    public String toString() {
        return "Student{" +
                "examScores=" + examScores +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
