package edu.winkenj.exercise07;
import java.util.*;
public class RandomGrader {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter seed: ");
        int seed = input.nextInt();
        Random rand = new Random(seed);
        
        System.out.println("Enter number of students: ");
        int studentCnt = input.nextInt();
        double sumGrades = 0;
        
        for(int i = 0; i < studentCnt; i++) {
            int grade = getRandomGrade(rand);
            sumGrades += grade;
            String letter = getLetterGrade(grade);
            printGrade("Student " + (i + 1), grade, letter);
        }
        
        int aveGrade = (int)Math.round(sumGrades/studentCnt);
        printGrade("AVERAGE", aveGrade, getLetterGrade(aveGrade));
    }

    private static void printGrade(String s, int grade, String letter) {
        System.out.println(s + ": " + grade + " (" + letter + ")");
    }

    private static String getLetterGrade(int grade) {
        String letter = "F";
        if (grade >= 90){
            letter = "A";
        } else if (grade >= 70) {
            letter = "C";

        } else if (grade >= 60) {
            letter = "F";

        }
        return letter;
    }

    private static int getRandomGrade(Random rand) {
        return 50 + (int)(51+rand.nextDouble());
    }
}
