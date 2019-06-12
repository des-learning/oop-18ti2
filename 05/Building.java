public abstract class Building {
    protected String name;

    public String getName() {
        return this.getClass().getName() + ": " + this.name;
    }
}