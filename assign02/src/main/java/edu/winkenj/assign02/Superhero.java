package edu.winkenj.assign02;

public class Superhero {
    private String heroName = "";
    private String realName = "";
    private int height = 0;
    private double weight = 0;

    public String getHeroName(){
        return heroName;
    }
    public String getRealName() {
        return realName;
    }
    public int getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
    public void setHeroName(String name) {
        heroName = name;
    }
    public void setRealName(String name) {
        realName = name;
    }
    public void setHeight(int totalInches) {
        height = totalInches;
    }
    public void setWeight(double pounds) {
        weight = pounds;
    }
    public int calculateBMI(){
        int bmi = (int)((703 * weight)/(height * height));
        return bmi;
    }

    public String getNameString(){
        return heroName + " " + "(" + realName + ")";
    }

    public String getHeightString(){
        int feet = height / 12;
        int leftoverInches = height % 12;
        return feet + "'-" + leftoverInches + "\"";
    }

    public String getWeightString(){
        return weight + " " + "lbs.";
    }

    public String toString(){
        return "NAME: "+ getNameString() + "\n"
                + "WEIGHT: "+ getWeightString() + "\n"
                + "HEIGHT: "+ getHeightString() + "\n"
                + "BMI: "+ calculateBMI() + "\n";
    }
}
