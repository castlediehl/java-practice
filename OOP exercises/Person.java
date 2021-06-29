
public class Person {

	private String name;
	private int age;
	private double shoeSize;
	
	
	
	public Person(String name, int age, double shoeSize) {
		super();
		this.name = name;
		this.age = age;
		this.shoeSize = shoeSize;
	}

	public void walking() {
		System.out.println(name + ", who is " + age + 
				" years old and wears a " + shoeSize + 
				" shoe size is walking");
	}
	
	public void startWalking() {
		walking();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getShoeSize() {
		return shoeSize;
	}

	public void setShoeSize(double shoeSize) {
		this.shoeSize = shoeSize;
	}
	
	
}
