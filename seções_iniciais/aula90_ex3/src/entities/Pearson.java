package entities;

public class Pearson {
	private String name;
	private int age;
	private double height;
	
	public Pearson(String name, int birth, double height) {
		this.name = name;
		this.age = birth;
		this.height = height;
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

	public void setAge(int birth) {
		this.age = birth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
}
