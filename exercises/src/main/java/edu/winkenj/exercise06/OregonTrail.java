package edu.winkenj.exercise06;

import edu.winkenj.exercise03.Supplies;

import java.util.Scanner;

public class OregonTrail {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Supplies supplies = new Supplies();
        GeneralStore store = new GeneralStore();
        store.enterStore(supplies,input);
        System.out.println(supplies);
    }
}
