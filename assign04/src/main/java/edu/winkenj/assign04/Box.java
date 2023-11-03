package edu.winkenj.assign04;

public class Box {
    private int sr;
    private int sc;
    private int er;
    private int ec;
    private boolean filled;
    private char drawChar;
    public Box(int sr, int sc, int er, int ec, boolean filled, char drawChar){
        this.sr = sr;
        this.sc = sc;
        this.er = er;
        this.ec = ec;
        this.filled = filled;
        this.drawChar = drawChar;
    }
    public String toString(){
        if (filled){
            return "Filled Box from ("+sr+","+sc+") to ("+er+","+ec+") with char "+"'"+drawChar+"'";
        }
        return "Box from ("+sr+","+sc+") to ("+er+","+ec+") with char "+"'"+drawChar+"'";
    }

    public void draw(ScreenBuffer s){
        if (filled){
            for (int i = sr; i <= er; i++){
                for (int j = sc; j <= ec; j++){
                    s.setPos(i,j,drawChar);
                }
            }
        }
        else{
            for (int i = sr; i <= er; i++){
                for (int j = sc; j <= ec; j++){
                    if (i == sr || i == er || j == sc || j == ec) {
                        s.setPos(i, j, drawChar);
                    }
                }
            }
        }

    }
}
