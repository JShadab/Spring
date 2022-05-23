package adarsh;

public class TeamMember {

	private String name;
	private int weight;
	private String role;

	public TeamMember(String name, int weight, String role) {
		super();
		this.name = name;
		this.weight = weight;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "TeamMember [name=" + name + ", weight=" + weight + ", role=" + role + "]";
	}

}
