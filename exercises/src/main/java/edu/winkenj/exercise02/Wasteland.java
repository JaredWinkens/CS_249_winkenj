package edu.winkenj.exercise02;

public class Wasteland {
    public static void main(String [] args){
        System.out.println("Wasteland");

        NPC jackson = new NPC();
        NPC forest = new NPC();

        int h = jackson.getHealth();
        h -= 5;
        jackson.setHealth(h);
    }
}
