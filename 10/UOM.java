public class UOM {
	private String name;
	private Number unit;
	private Number rate;

	public UOM(String name, Number unit, Number rate) {
		this.name = name;
		this.unit = unit;
		this.rate = rate;
	}

	public String getName() { return name; }
	public Number getUnit() { return unit; }
	public Number getRate() { return rate; }
	public String toString() { return String.format("%s<%.2f -> %.2f>", name, unit.doubleValue(), unit.doubleValue() / rate.doubleValue()); }
}
