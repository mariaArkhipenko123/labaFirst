package bsu.rfe.Arkhipenko6group;

public class Potato extends Food {
    private String type;

    public Potato(String type){
        super("Potato");
        this.type = type;
    }

    public String getType() {return type;}
    public void setType(){
        this.type = type;
    }

    public void consume(){
        System.out.println(this + " has been consumed!");
    }

    @Override
    public String toString() {
        return type + " " + name;
    }
}
