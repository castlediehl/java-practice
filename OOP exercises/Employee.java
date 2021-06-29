
public class Employee {

	private String fName;
	private String lName;
	private double mSal;
	
	public Employee(double Salary) {
		mSal = Salary;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public double getmSal() {
		return mSal;
	}

	public void setmSal(double mSal) {
		if(this.mSal > 0) {
		this.mSal = mSal;
		}
	}
	
	

	
	
	
}
