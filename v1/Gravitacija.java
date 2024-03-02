public class Gravitacija {
	public static void main(String[] arg) {
		System.out.println("OIS je zakon!");
	}
	
	public static double izracunGravitecije(double visina) {
		double C = 6.67e-11;
		double M = 5.972e24;
		double r = 6.371e6;
		return (C * M) / Math.pow(r + visina, 2.0)
	}
}