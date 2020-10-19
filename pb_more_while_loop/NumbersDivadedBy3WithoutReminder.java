package pb_more_while_loop;

public class NumbersDivadedBy3WithoutReminder {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			if ((i % 3) == 0) {
				System.out.println(i);
			}
		}

	}

}
