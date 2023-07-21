import java.util.ArrayList;
import java.util.Iterator;

public class FiltersDemo {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Mary");
		names.add("Bob");

		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
		    
		    System.out.println(name);
		}
		 System.out.println(names);
	}

}
