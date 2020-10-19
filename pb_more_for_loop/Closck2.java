package pb_more_for_loop;

public class Closck2 {

	public static void main(String[] args) {
		int hour = 0;
		int min = 0;
		int sec = 0;
		
		for (int i = 0; i < 24; i++, hour++) {
			for (int j = 0; j < 60; j++, min++) {
				for (int j2 = 0; j2 < 60; j2++, sec++) {
					System.out.printf("%d : %d : %d \n", hour, min, sec);
				}
				sec = 0;
			}
			min = 0;
		}

	}

}
