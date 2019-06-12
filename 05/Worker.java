public class Worker extends Unit {
    public Worker(String name) {
        this.name = name;
    }

    public void move() {
        System.out.printf("%s walks", this.name);
    }

    public void build(Building building) {
        System.out.printf("%s is building %s\n", this.getName(),
        building.getClass().getName());
    }
}