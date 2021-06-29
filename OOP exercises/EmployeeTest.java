
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(40000);
		double n = e1.getmSal();
		
		System.out.println("E1 Salary: " + n);
		
		Employee e2	= new Employee(30000);
		double x = e2.getmSal();
		System.out.println("E2 Salary: " + x);
		
		double e1newSalary = (e1.getmSal() + (e1.getmSal() * .10));
		double e2newSalary = (e2.getmSal() + (e2.getmSal() * .10));
		
		System.out.println("E1 New Salary: " + e1newSalary);
		System.out.println("E2 New Salary: " + e2newSalary);


	}

}
