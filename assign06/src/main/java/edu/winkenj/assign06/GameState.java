package edu.winkenj.assign06;

import edu.winkenj.assign04.ScreenBuffer;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GameState implements Loadable{
    private ScreenBuffer map = new ScreenBuffer(12,30,'.');
    private ArrayList<Loadable> loadables = new ArrayList<>();

    public Loadable createLoadable(String typeName) throws GameFileException{
        return switch (typeName) {
            case "Skeleton" -> new Skeleton();
            case "Rat" -> new Rat();
            case "Item" -> new Item();
            case "Tome" -> new Tome();
            default -> throw new GameFileException("Unknown type: " + typeName);
        };
    }
    @Override
    public void load(Scanner input) throws GameFileException {
        map.clear();
        loadables.clear();
        int numLines = input.nextInt();
        for (int i = 0; i < numLines; i++){
            Loadable m = createLoadable(input.next());
            m.load(input);
            loadables.add(m);
            if (m instanceof Drawable){
                ((Drawable) m).draw(map);
            }
        }
    }
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("MAP:\n"+map.getDisplayString()+"\n"+"CREATURES:\n");
        for(Loadable c: loadables) {
            if (c instanceof Creature) {
                s.append("* " + c+ "\n");
            }
        }
        s.append("INVENTORY:\n");
        for (Loadable item: loadables){
            if (item instanceof Item){
                s.append("* "+item+"\n");
            }
        }
        return s.toString();
    }
    public void save(String filename) throws GameFileException{
        try {
            PrintWriter p = new PrintWriter(filename);
            p.print(this.toString());
            p.close();
        }catch (Exception e){
            throw new GameFileException("Failed to save file!",e);
        }
    }
}
