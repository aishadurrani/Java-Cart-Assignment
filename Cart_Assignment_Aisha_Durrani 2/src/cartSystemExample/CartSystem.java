package cartSystemExample;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Map.Entry;

public class CartSystem extends TheSystem {
	CartSystem() throws FileNotFoundException {
		
	}

	@Override
	public void display() {
		System.out.println(getItemCollection());
		getItemCollection();
		Iterator it = getItemCollection().entrySet().iterator();
		Double subtotal = 0.0;
		while (it.hasNext()) {
			Entry e = (Entry) it.next();
			Item i = (Item) e.getValue();
			subtotal+= i.getItemPrice()*i.getAvailableQuantity();
			
		}
		
		System.out.println("SUB-TOTAL: " + subtotal);
		double tax = subtotal * 0.05; 
		double total = subtotal + tax;
		System.out.println("TAX : " + tax);
		System.out.println("TOTAL: " + total);
	}
}
