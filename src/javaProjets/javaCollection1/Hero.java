package javaProjets.javaCollection1;

public class Hero {

	// attributs
	private String name;
	private int age;

	// constructeurs
	public Hero(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// accesseurs (getters)
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// mutateurs (setters)
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
}