package edu.winkenj.assign03;

import java.util.Scanner;

public class SilentFilm {

    public static Narrator askForNarration(Scanner input){
        System.out.println("Enter boundary character:");
        String boundaryInput = input.nextLine();
        char b = boundaryInput.charAt(0);
        System.out.println("Enter number of lines:");
        String line = input.nextLine();
        int lineNum = Integer.parseInt(line);

        String [] allLines = new String[lineNum];
        System.out.println("Enter lines:");
        for (int i = 0; i < lineNum; i++){
            String l = input.nextLine();
            allLines[i] = l;
        }
        Narrator n = new Narrator(allLines,b);
        return n;
    }

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        Narrator n = askForNarration(s);
        System.out.println("Our story begins...");
        System.out.println(n);
    }
}
