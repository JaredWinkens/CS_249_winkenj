package edu.winkenj.assign04;

public class ScreenBuffer {
    private char [][] arrayChar;
    private char fillChar;
    private int rowCnt;
    private int colCnt;
    public ScreenBuffer(int rowCnt, int colCnt, char fillChar){
        this.rowCnt = rowCnt;
        this.colCnt = colCnt;
        this.fillChar = fillChar;
        arrayChar = new char[rowCnt][colCnt];
        for (int i = 0; i < rowCnt; i++){
            for (int j = 0; j < colCnt; j++) {
                arrayChar[i][j] = fillChar;
            }
        }
    }
    public void clear(){
        for (int i = 0; i < rowCnt; i++){
            for (int j = 0; j < colCnt; j++) {
                arrayChar[i][j] = fillChar;
            }
        }
    }
    public int getRowCnt(){
        return rowCnt;
    }
    public int getColCnt(){
        return colCnt;
    }
    public boolean isValidPosition(int row, int col){
        if ((row >= 0 && row < rowCnt) && (col >= 0 && col < colCnt)){
            return true;
        }
        return false;
    }
    public char getPos(int row, int col){
        if(isValidPosition(row,col)){
            return arrayChar[row][col];
        }
        return ' ';
    }
    public boolean setPos(int row, int col, char c){
        if (isValidPosition(row,col)){
            arrayChar[row][col] = c;
            return true;
        }
        return false;
    }
    public String toString(){
        return rowCnt + " x " + colCnt + " ScreenBuffer (default: " + fillChar + ")";
    }
    public String getDisplayString(){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < rowCnt; i++){
            for (int j = 0; j < colCnt; j++) {
                s.append(arrayChar[i][j]);
            }
            s.append("\n");
        }
        return s.toString();
    }

}
