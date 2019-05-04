package cartSystemExample;

import java.io.FileNotFoundException;

public class AppSystem extends TheSystem {
	
	AppSystem() throws FileNotFoundException {
	}

	@Override
	public void display() {
		getItemCollection();
		for (String name: getItemCollection().keySet()){

   //         String key =name.toString();
            String value = getItemCollection().get(name).toString();  
            System.out.println(value);  
		}


		
	}

//	@Override
//	public Boolean add(Item item) {
//		add(item);
//		return false;
//	}
}
