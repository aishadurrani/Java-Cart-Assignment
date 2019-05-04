package cartSystemExample;

import java.util.Arrays;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public abstract class TheSystem {
	private HashMap<String, Item> itemCollection;

	TheSystem() throws FileNotFoundException {
		itemCollection = new HashMap<String, Item>();

		if (getClass().getSimpleName().equals("AppSystem")) {
			// read file and fill the itemCollection object
			// FileReader
			FileReader reader = new FileReader(new File("src\\sample.txt"));

			Scanner scan = new Scanner(reader);

			while (scan.hasNextLine()) {

				String[] row = scan.nextLine().split("  ");

				Item ITM = new Item();
				ITM.setItemName(row[0]);
				ITM.setItemDesc(row[1]);
				ITM.setItemPrice(Double.valueOf(row[2]));
				ITM.setAvailableQuantity(Integer.valueOf(row[3]));

				itemCollection.put(ITM.getItemName(), ITM);
			}
			scan.close();
		}
	}

	public HashMap<String, Item> getItemCollection() {
		return itemCollection;
	}

	public void setItemCollection(HashMap<String, Item> itemCollection) {
		this.itemCollection = itemCollection;
	}

	public Boolean checkAvailability(Item item) {
		if (item.getQuantity() >= item.getAvailableQuantity()) {
			System.out.println("System is unable to add " + item.getItemName() + "System only has "
					+ item.getAvailableQuantity() + item.getItemName());
			return false;
		} else {
			return true;
		}
	}

	public Boolean add(Item item) {
		// 1
		if (item == null) {
			return false;
		}
		// 2
		else if (itemCollection.containsKey(item.getItemName()) &&
				checkAvailability(item))
		{
			item.setQuantity(item.getQuantity() + 1);
			return true;
			}
		//3
		else if (!(this.itemCollection.containsKey(item.getItemName()))) {
			itemCollection.put(item.getItemName(), item);
			return true;
		}
		//4
		else {
			return false;
		}
	}
	
		
		
		public Item remove(String itemName) {
			return itemCollection.remove(itemName);
	}

	public abstract void display();
}


