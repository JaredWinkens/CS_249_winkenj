package edu.winkenj.assign06;

import edu.winkenj.assign04.ScreenBuffer;

public class Skeleton extends Creature{
    public Skeleton(){}
    public Skeleton(int row, int col){
        super(row,col);
    }
    public String toString(){
        return "Skeleton at "+getRow()+","+getCol();
    }
    @Override
    public void draw(ScreenBuffer map) {
        map.setPos(getRow(),getCol(),'S');
    }
}
