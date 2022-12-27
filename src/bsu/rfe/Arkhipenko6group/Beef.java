package bsu.rfe.Arkhipenko6group;

public class Beef extends Food{
    private String preparedness;

    public Beef(String preparedness){
        super("Beef");
        this.preparedness = preparedness;
    }
    public String getPreparedness() {
        return preparedness;
    }
    public void setPreparedness(){
        this.preparedness = preparedness;
    }

    public void consume(){
        System.out.println(this + " has been consumed!");}

    @Override
    public String toString() {
        return preparedness + " " + name;
    }
}