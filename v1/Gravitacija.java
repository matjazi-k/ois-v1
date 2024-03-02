import java.util.*;

public class Gravitacija {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		izpis(sc.nextDouble());
	}
	
	public static double izracunGravitacije(double visina) {
		double C = 6.67e-11;
		double M = 5.972e24;
		double r = 6.371e6;
		return (C * M) / Math.pow(r + visina, 2.0);
	}
	
	public static void izpis(double visina){
		System.out.println(visina);
		System.out.println(izracunGravitacije(visina));
	}
}