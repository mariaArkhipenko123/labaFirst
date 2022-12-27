package bsu.rfe.Arkhipenko6group;

public class Cheese extends Food{

    public Cheese() {
        super("Cheese");
    }
    public void consume() {
        System.out.println(this + " " + "has been consumed!");
    }

    @Override
    public String toString() {
        return name;
    }
}