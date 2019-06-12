public class Barrack extends Building {
    public Barrack(String name) {
        this.name = name;
    }

    public void produce(Unit unit)  {
        System.out.printf("%s produce a %s\n", this.getName(), unit.getClass().getName());
    }
}