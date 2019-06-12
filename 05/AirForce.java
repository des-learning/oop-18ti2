public class AirForce extends Unit {
    public AirForce(String name) {
        this.name = name;
    }

    public void move() {
        System.out.printf("%s fly", this.name);
    }
}