package grades;

import java.util.ArrayList;

public class Student {
    //private properties for the students name grades
     private String studentName;
     private ArrayList<Integer> grades;

     public Student(String studentName){
         this.studentName = studentName;
         this.grades = new ArrayList<>();
     }

    // returns the student's name
    public String getStudentName(){
         return studentName;
    };
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    };
    // returns the average of the students grades
    public double getGradeAverage(){
        int averageGrade = 0;
        for (int grade : grades){
            averageGrade += grade;
        }
        return averageGrade/grades.size();
    };


}




