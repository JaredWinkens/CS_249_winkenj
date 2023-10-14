package edu.winkenj.assign03;

public class Narrator {
    private char b;
    private String [] l;
    public Narrator(String [] lines, char boundaryChar){
        setLines(lines);
        setBoundaryChar(boundaryChar);
    }

    public char getBoundaryChar(){
        return b;
    }

    public String getLines(){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < l.length; i++){
            s.append(l[i]);
            s.append("\n");
        }
        return s.toString();
    }
    public void setBoundaryChar(char boundaryChar){
        b = boundaryChar;
    }
    public void setLines(String [] lines){
        l = new String[lines.length];
        for (int i = 0; i < lines.length; i++){
            l[i] = lines[i];
        }
    }
    public String generateBoundaryLine(){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 50; i++){
            s.append(b);
        }
        s.append("\n");
        return s.toString();
    }
    public String generateCenteredLine(String text){
        StringBuilder s = new StringBuilder();
        s.append(b);
        int totalSpaces = 50 - text.length() - 2;
        int firstHalf = totalSpaces/2;
        int secondHalf = totalSpaces - firstHalf;
        for (int i = 0; i < firstHalf; i++){
            s.append(" ");
        }
        s.append(text);
        for (int i = 0; i < secondHalf; i++){
            s.append(" ");
        }
        s.append(b);
        s.append("\n");
        return s.toString();
    }
    public String toString(){
        int lineCnt;
        int extraLineCnt;
        StringBuilder s = new StringBuilder();
        for (int p = 0; p < l.length; p += 4) {
            s.append(generateBoundaryLine());
            s.append(generateCenteredLine(""));
            int linesLeft = l.length -p;
            if (linesLeft < 4) {
                lineCnt = linesLeft;
                extraLineCnt = 4 - linesLeft;
            } else {
                lineCnt = 4;
                extraLineCnt = 0;
            }
            for (int i = 0; i < lineCnt; i++) {
                s.append(generateCenteredLine(l[i+p]));
            }
            for (int j = 0; j < extraLineCnt; j++) {
                s.append(generateCenteredLine(""));
            }
            s.append(generateCenteredLine(""));
            s.append(generateBoundaryLine());
        }
        return s.toString();
    }
}
