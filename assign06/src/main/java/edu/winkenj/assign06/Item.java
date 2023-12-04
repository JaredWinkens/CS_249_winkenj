package edu.winkenj.assign06;

import java.util.Scanner;

public class Item implements Loadable{
    private String ID = "";
    private int value = 0;

    public Item(){}
    public Item(String ID, int value){
        this.ID = ID;
        this.value = value;
    }
    public String getID(){
        return ID;
    }
    public int getValue(){
        return value;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public void setValue(int value){
        this.value = value;
    }
    public String toString(){
        return ID + " with value " + value;
    }
    @Override
    public void load(Scanner input) throws GameFileException {
        try {
            setID(input.next());
            setValue(input.nextInt());
        }catch (Exception e){
            setID("");
            setValue(0);
            throw new GameFileException("Error loading Item",e);
        }
    }
}
