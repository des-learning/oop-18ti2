public class TestBag {
	public static void addItemIntoBag(Bag bag, Item item) {
		if (bag.addItem(item)) {
			System.out.printf("Successfully add %s to bag\n", item.getName());
		} else {
			System.out.println("Bag full!");
		}
	}

	public static void showBagItems(Bag bag) {
		System.out.println("Items in bag");
		System.out.printf("%d items, total weight: %f\n", bag.getItemsCount(), bag.getCapacity());
		for (Item i: bag.getItems()) {
			System.out.printf("%s weigh %f\n", i.getName(), i.getWeight());
		}
	}

	public static void main(String []args) {
		Item[] items = new Item[]{
			new Item("Kue", 50.0),
			new Item("Pedang", 150.0),
			new Item("Perisai", 200.0)
		};

		Bag inventory = new Bag(300.0);

		addItemIntoBag(inventory, items[0]);
		addItemIntoBag(inventory, items[1]);
		addItemIntoBag(inventory, items[2]);

		showBagItems(inventory);

		inventory.removeItem("Pedang");
		addItemIntoBag(inventory, items[0]);
		addItemIntoBag(inventory, items[0]);
		addItemIntoBag(inventory, items[0]);
		addItemIntoBag(inventory, items[0]);
		addItemIntoBag(inventory, items[0]);

		showBagItems(inventory);

		Avatar avatar = new Avatar("Budi", 300.0);
		avatar.addItem(items[0]);
		avatar.addItem(items[2]);
		avatar.addItem(items[0]);
		avatar.addItem(items[1]);
		avatar.displayInventory();
	}
}
