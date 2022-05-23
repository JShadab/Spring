package adarsh;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	static int count = 1;

	static int min = 52;
	static int max = 72;

	static List<TeamMember> allMembers = new ArrayList<TeamMember>();

	// Function to print all the permutations of str
	static void printPermutn(String str, String ans) {

		// If string is empty
		if (str.length() == 0) {
			String result = ans.substring(0, ans.length() - 1);

			boolean filter1 = result.contains("D") && result.contains("A") && result.contains("C");

			int totalWeight = 0;
			for (int i = 0; i < result.length(); i++) {
				String name = String.valueOf(result.charAt(i));
				totalWeight = totalWeight + getWeigthByName(name);
			}

			boolean filter2 = (totalWeight >= min) && (totalWeight <= max);
			

			if (filter1 && filter2) {

				System.out.println(result + " -> weight= " + totalWeight + " and count= " + count++);

			}

			return;
		}

		for (int i = 0; i < str.length(); i++) {

			// ith character of str
			char ch = str.charAt(i);

			// Rest of the string after excluding
			// the ith character
			String ros = str.substring(0, i) + str.substring(i + 1);

			// Recursive call
			printPermutn(ros, ans + ch);
		}
	}

	// Driver code
	public static void main(String[] args) {

		TeamMember member1 = new TeamMember("A", 10, "Captain");
		TeamMember member2 = new TeamMember("B", 5, "Player");
		TeamMember member3 = new TeamMember("C", 14, "Player");
		TeamMember member4 = new TeamMember("D", 20, "Player");
		TeamMember member5 = new TeamMember("E", 23, "Captian");

		allMembers.add(member1);
		allMembers.add(member2);
		allMembers.add(member3);
		allMembers.add(member4);
		allMembers.add(member5);

		String str = "";

		for (TeamMember member : allMembers) {
			str = str.concat(member.getName());
		}

		printPermutn(str, "");
	}

	private static int getWeigthByName(String name) {

		int weight = 0;

		for (TeamMember teamMember : allMembers) {

			if (teamMember.getName().equals(name)) {
				weight = teamMember.getWeight();
				break;
			}
		}

		return weight;

	}

}
