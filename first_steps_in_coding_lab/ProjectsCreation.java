package first_steps_in_coding_lab;

import java.util.Scanner;

public class ProjectsCreation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String architectName = scan.nextLine();
		int projectsNumber = Integer.parseInt(scan.nextLine());
		System.out.printf("The architect %s will need %d hours to complete %d project/s.", architectName, (projectsNumber * 3), projectsNumber);
		scan.close();
	}

}
