package transport;

public class Bus {
	
	private String busnum;
	private String drivername;
	private int serial;
	private int number=0;
	
	public Bus(String busnum, String drivername)  throws Exception{
		if(!(Buscheck(busnum, drivername)))
			throw new Exception("Invalid");
		this.busnum = busnum;
		this.drivername = drivername;
		serial=++number;
	}
	public String getBusnum() {
		return busnum;
	}
	public void setBusnum(String busnum) {
		this.busnum = busnum;
	}
	public String getDrivername() {
		return drivername;
	}
	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}
	
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}
	public String toString() {
		return "Bus"+" " + busnum + ", Drivername=" + drivername ;
	}
	
	public static boolean Buscheck(String busnum, String drivername) {
		return busnum!=null && drivername.length()>0;
	}

}
