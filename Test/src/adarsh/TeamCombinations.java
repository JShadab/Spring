package adarsh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamCombinations {

	static int TEAM_SIZE = 4;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<TeamMember> allMembers = new ArrayList<TeamMember>();

		for (int i = 1; i <= TEAM_SIZE; i++) {
			System.out.println("Enter Team member Name:");
			String name = sc.nextLine();

			System.out.println("Enter Team member Role:");
			String role = sc.nextLine();

			System.out.println("Enter Team member Weight:");
			int weight = sc.nextInt();

			TeamMember member = new TeamMember(name, weight, role);
			System.out.println(member);

			allMembers.add(member);

		}

		System.out.println(allMembers);

	}

}
