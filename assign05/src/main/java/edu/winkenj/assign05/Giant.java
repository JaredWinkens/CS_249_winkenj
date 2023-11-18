package edu.winkenj.assign05;

public class Giant {
    protected String name;
    public Giant(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
