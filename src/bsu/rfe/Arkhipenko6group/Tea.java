package bsu.rfe.Arkhipenko6group;

public class Tea extends Food{
    private String color;

    public Tea(String color){
        super("Tea");
        this.color = color;
    }
    public String getColor(){return color;}
    public void setColor(String color){
        this.color = color;
    }
    public void consume() {
        System.out.println(this + " has been consumed!");
    }

    @Override
    public String toString() {
        return color + " " + name;
    }
}