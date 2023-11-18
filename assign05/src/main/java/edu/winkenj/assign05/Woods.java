package edu.winkenj.assign05;

import java.util.ArrayList;

public class Woods {
    protected ArrayList<Giant> giantArray = new ArrayList<>();
    public Giant createGiant(String name, String typeName){
        if (!(name.isEmpty())){
            switch (typeName){
                case "GIANT": return new Giant(name);
                case "TROLL": return new Troll(name);
                case "TREE": return new Tree(name);
                case "ENT": return new Ent(name);
                case "HUORN": return new Huorn(name);
                default: {
                    return null;
                }
            }
        }
        else{
            return null;
        }

    }
    public boolean addGiant(String name, String typeName){
        Giant newGiant = createGiant(name,typeName);
        if (newGiant != null){
            giantArray.add(newGiant);
            return true;
        }
        else{
            return false;
        }
    }
    public Giant getGiant(int index){
        if (index >= 0 && index < giantArray.size()){
            return giantArray.get(index);
        }
        else{
            return null;
        }
    }
    public void printAllGiants(){
        System.out.println("ALL GIANTS:");
        for (Giant giant: giantArray){
            System.out.println("- "+ giant.toString());
        }
    }
    public void printAllTrees(){
        System.out.println("ALL TREES:");
        for (Giant giant: giantArray){
            if (giant instanceof Tree) {
                System.out.println("- " + giant + ": " + ((Tree) giant).speak());
            }
        }
    }

    public void printAllTrolls(){
        System.out.println("ALL TROLLS:");
        for (Giant giant: giantArray){
            if (giant instanceof Troll) {
                System.out.println("- " + giant + ": " + ((Troll) giant).cook());
            }
        }
    }

}
