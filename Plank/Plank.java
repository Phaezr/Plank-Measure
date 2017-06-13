import java.util.Scanner;
public class Plank {
	
	public static void main(String[] args) {
		double length, width, height ;
		double volume, surArea;
		Scanner sc = new Scanner(System.in);

		
		System.out.println("What is the length of the piece of wood?");
			length = sc.nextDouble();
		System.out.println("How about the height?");
			height = sc.nextDouble();
		System.out.println("How thick is it (Width)");
			width = sc.nextDouble();
			
			volume = MyMethods.calcVolume(length, width, height);
			surArea = MyMethods.calcArea(length, width, height);
		
		System.out.println("The total surface area of the block is " + surArea + " cubic inches "  +  "(" + MyMethods.inchesToFeet(surArea) + " cubic feet" + ")");
		System.out.println("The total volume of the block of wood is " + volume + " square inches " + "(" + MyMethods.inchesToFeet(volume) + " square feet" +  ")");
	
		sc.close();


	}

}
