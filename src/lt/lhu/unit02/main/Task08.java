package lt.lhu.unit02.main;

public class Task08 {

	public static void main(String[] args) {
		// Составить программу для вычисления значений функции; результат представить в виде таблицы

		double a;
		double b;
		double h;
		double fx;
		double x;

		a = 0;
		b = 5;
		h = 0.5;

		System.out.println("---------------------------------");
		System.out.println("|       x       |       fx      |");
		System.out.println("---------------------------------");

		for (x = a; x <= b; x = x + h) {
			fx = 2 * Math.tan(x / 2) + 1;
			
			System.out.printf("|\t%1.1f\t|\t%1.2f\t|\n", x, fx);

		}
		
		System.out.println("---------------------------------");

	}

}
