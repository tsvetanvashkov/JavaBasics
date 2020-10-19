package pb_more_for_loop;

public class Clock {

	public static void main(String[] args) {
		
		int hour = 0;
		int min = 0;
		
		for (int i = 0; i < 24; i++, hour++) {
			for (int j = 0; j < 60; j++, min++) {
				System.out.printf("%d : %d\n", hour, min);
			}
			min = 0;
		}
		

	}

}
