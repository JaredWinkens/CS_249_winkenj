package edu.winkenj.assign02;

import java.util.Scanner;

public class League {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Superhero p = new Superhero();
        System.out.println("Enter hero name: ");
        String heroName = scanner.nextLine();
        System.out.println("Enter real name: ");
        String realName = scanner.nextLine();
        System.out.println("Enter height (inches) and weight (pounds): ");
        String line = scanner.nextLine();
        Scanner parseLine = new Scanner(line);
        int inches = parseLine.nextInt();
        double pounds = parseLine.nextDouble();

        p.setHeroName(heroName);
        p.setRealName(realName);
        p.setHeight(inches);
        p.setWeight(pounds);

        System.out.println(p.toString());
    }
}

