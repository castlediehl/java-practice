
public class Dog {

	private String name;
	private int age;
	private double weight;
	
	public Dog(String n, int a, double w) {
		this.name = n;
		this.age = a;
		this.weight = w;
		showExcitement(1);
		eating("dog food");
	}
	
	

	@Override
	public String toString() {
		return "name: " + name + "\n"
				+ "age: " + age + "\n"
				+ "weight: " + weight + "\n";
	}

	// This method shows excitement
	public void showExcitement() {
		System.out.println(name + " is wagging its tail!!");
	}
	
	// This method overloads showExcitement() taking into levelOfExcitement variable
	public void showExcitement(int levelOfExcitement) {
		if(levelOfExcitement < 5) {
			System.out.println(name + " is jumping up and down!!");
		}
		if(levelOfExcitement >= 5 && levelOfExcitement <= 10){
			System.out.println(name + " is spinning in cirlces!!!");
		}
		if(levelOfExcitement > 30) {
			System.out.println(name + " is beyond excited!!!!!");
		}
		
	}

	// This method displays that the dog is eating
	public void eating() {
		System.out.println("Eating!");
	}
	
	// This method overloads eating() with a variable called food
	public void eating(String food) {
		System.out.println("Eating " + food + "!");
	}
	
	// Getters and Setters
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
