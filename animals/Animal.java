package animals;

public class Animal {
	private String name;
	private String preferredFood;
	private String cry;
	private int id;
	private String sex;

	public Animal(String name, String preferredFood, String cry, int id, String sex) {
		this.name = name;
		this.preferredFood = preferredFood;
		this.cry = cry;
		this.id = id;
		this.sex = sex;
	}

	public void feed(String food) {
		makeCry();
		if (food.equals(preferredFood)) {
			System.out.println("Mangia felicemente e sembra piacergli!");
		} else {
			System.out.println("Non sembra piacergli molto...");
		}
	}

	public void makeCry(){
		System.out.println(cry);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPreferredFood() {
		return preferredFood;
	}

	public void setPreferredFood(String preferredFood) {
		this.preferredFood = preferredFood;
	}

	public String getCry() {
		return cry;
	}

	public void setCry(String cry) {
		this.cry = cry;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
