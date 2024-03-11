package transport;
import java.util.*;

public class Transport {

	public static void main(String[] args) {
		test();

	}

	private static void test() {

		try {
			
			
			ArrayList<Bus> buses=new ArrayList<>();
			buses.add(new Bus("Dhaka metro La-243923", "Khaled"));
			buses.add(new Bus("Dhaka metro La-243564", "Jamal"));
			buses.add(new Bus("Dhaka metro La-243565", "Kudu"));
			
			Counter counter1= new Counter("Syamoli", new Roots("Dhaka-Khulna", 10), buses );
			Counter counter2= new Counter("Gabtoli", new Roots("Dhaka-Khulna", 10), buses );
			print(counter1);
			print(counter2);

			/*
			 * Counter counter1 = create("Syamoli", new Roots("Dhaka-Khulna", 10), new Bus[]
			 * { new Bus("Dhaka Metro LA-243923", "Jamal"), new Bus("Dhaka Metro LA-243024",
			 * "Kudu") }); print(counter1);
			 */
		} catch (Exception E) {
			System.out.println(E.getMessage());
		}

	}

	/*
	 * private static Counter create(String counterno, Roots root, Bus ... bus) {
	 * Counter counter= new Counter(counterno,root,bus); return counter;
	 * 
	 * }
	 */

	private static void print(Counter counter) {

		
		/*for (int i=0; i<counter.getCount(); i++)
			try {
				
				ArrayList<Bus> b=counter.getBus();*/
				System.out.println(counter.toString());
				/*
				 * } catch(Exception e) { System.out.println(e.getMessage()); }
				 */
		

	}

}
