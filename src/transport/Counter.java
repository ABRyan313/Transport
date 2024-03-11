package transport;

import java.util.*;

public class Counter {

	private String counterno;
	private Roots root;
	private ArrayList<Bus> bus = new ArrayList<>();

	public Counter(String counterno, Roots root, ArrayList<Bus> bus) {

		this.counterno = counterno;
		this.root = root;
		// this.bus = new ArrayList<>(Arrays.asList(bus));
		this.bus = bus;

	}

	public String getCounterno() {
		return counterno;
	}

	public void setCounterno(String counterno) {
		this.counterno = counterno;
	}

	/*
	 * public ArrayList<Bus> getBus() { ArrayList<Bus> list=new ArrayList(); for
	 * (Bus b: bus) list.add(b);
	 * 
	 * return list;
	 * 
	 * }
	 */

	public void setBus(ArrayList<Bus> bus) {
		this.bus = bus;
	}

	public int getCount() {
		return bus.size();
	}

	@Override
	public String toString() {
		return "counterno=" + counterno + ", root=" + root + bus;
	}

}
