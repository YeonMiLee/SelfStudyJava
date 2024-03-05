package quiz;

public class Person {

	int age;
	public String name;
	protected int height;
	private int weight;
	
	Person(int age, String name, int height, int weight) {
		this.age = age;
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

}
