import java.util.List;
import java.util.ArrayList;

public class Bag {
	private List<Item> items;
	private double maxCapacity;

	public Bag(double maxCapacity) {
		this.maxCapacity = maxCapacity;
		this.items = new ArrayList<Item>();
	}

	public boolean addItem(Item item) {
		if (this.bisaMenampung(item)) {
			this.items.add(item);
			return true;
		}
		return false;
	}

	public boolean bisaMenampung(Item item) {
		return (this.getMaxCapacity() >=
				(this.getCapacity() + item.getWeight()));
	}

	public double getCapacity() {
		double capacity = 0.0;
		for (Item item: this.items) {
			capacity += item.getWeight();
		}
		return capacity;
	}

	public int getItemsCount() {
		return this.items.size();
	}

	public double getMaxCapacity() {
		return this.maxCapacity;
	}
	
	public List<Item> getItems() {
		return this.items;
	}

	public Item removeItem(String name) {
		Item item = null;
		for (int i = 0; i < this.items.size(); i++) {
			if (this.items.get(i).getName().equals(name)) {
				item = this.items.get(i);
				this.items.remove(i);
				break;
			}
		}
		return item;
	}
}
