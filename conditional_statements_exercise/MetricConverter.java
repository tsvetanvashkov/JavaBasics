package conditional_statements_exercise;

import java.util.Scanner;

public class MetricConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num = Double.parseDouble(scan.nextLine());
		String inValue = scan.nextLine();
		String outValue = scan.nextLine();
		String mm = "mm";
		String cm = "cm";
		String m = "m";
		
		if (inValue.equals(mm)) {
			if (outValue.equals(cm)) {
				num *= 0.1;
			}else if (outValue.equals(m)) {
				num *= 0.001;
			}
		}else if (inValue.equals(cm)) {
			if (outValue.equals(mm)) {
				num *= 10;
			}else if (outValue.equals(m)) {
				num *= 0.01;
			}
		}else if (inValue.equals(m)) {
			if (outValue.equals(mm)) {
				num *= 1000;
			}else if (outValue.equals(cm)) {
				num *= 100;
			}
		}
		System.out.printf("%.3f", num);
		scan.close();

	}

}
