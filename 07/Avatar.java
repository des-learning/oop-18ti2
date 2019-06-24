public class Avatar {
	private String name;
	private Bag inventory;

	public Avatar(String name, double maxInventoryCap) {
		this.name = name;
		this.inventory = new Bag(maxInventoryCap);
	}

	public boolean addItem(Item item) {
		return this.inventory.addItem(item);
	}

	public Item getItem(String itemName) {
		return this.inventory.removeItem(itemName);
	}

	public void displayInventory() {
		System.out.printf("%s inventory:\n", this.name);
		for (Item item: this.inventory.getItems()) {
			System.out.println(item.getName());
		}
	}
}
