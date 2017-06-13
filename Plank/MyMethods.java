
public class MyMethods {
	
	
	
	public static double calcVolume(double a, double b, double c) {
		double value = a * b * c;
		return value;
			}
	public static double calcArea(double a, double b, double c) {
		double value = ((2*(a*b))+ (2*(b*c))+ (2*(c*a)));
		return value;
			}
	public static double inchesToFeet(double a) {
		double value = a/1728;
		return value;
			}

}
