public class Turret extends Building
    implements Offensive {
    public Turret(String name) {
        this.name = name;
    }

    public void attack(Building b) {
        System.out.printf("%s is attacking building %s with laser\n",
            this.getName(), b.getName());
    }

    public void attack(Unit b) {
        System.out.printf("%s is attacking unit %s with peluru tajam\n",
            this.getName(), b.getName());
    }
}