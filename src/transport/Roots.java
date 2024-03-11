package transport;

public class Roots {
	
	private String rootname;
	private int rootno;
	public Roots(String rootname, int rootno) throws Exception {
		if(!(rootcheck(rootname, rootno)))
			throw new Exception("Invalid");
		this.rootname=rootname;
		this.rootno=rootno;
		
	}
	
	public String getRootname() {
		return rootname;
	}
	
	public void setRootname(String rootname) {
		this.rootname=rootname;
	}
	
	public String getRootno() {
		return rootname;
	}
	
	public void setRootno(int rootno) throws Exception {
		this.rootno=rootno;
	}
	
	public String toString() {
		return rootname + " " + "Root NO." + rootno;
	}
	
	
	public static boolean rootcheck(String rootname, int rootno) {
		
		return rootname!=null && rootname.length()>0 && rootno!=0;
		
	}

}
