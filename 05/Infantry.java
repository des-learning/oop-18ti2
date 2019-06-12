public class Infantry extends Unit implements Offensive{
    public Infantry(String name) {
        this.name = name;
    }

    public void move() {
        System.out.printf("%s walks", this.name);
    }

    public void attack(Building b) {
        System.out.printf("%s is attacking building %s\n", this.getName(),
        b.getName());
    }

    public void attack(Unit b) {
        System.out.printf("%s is attacking unit %s\n", this.getName(),
        b.getName());
    }
}