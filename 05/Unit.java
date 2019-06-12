public abstract class Unit {
    protected String name;

    public String getName() {
        return this.getClass().getName() + ": " + this.name;
    }

    public abstract void move();
}