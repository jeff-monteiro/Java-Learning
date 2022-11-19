package javaEngineer.aula19;


public class Arrays {

	public static void main(String[] args) {
		
		double[] temperatures = new double[365];
		temperatures[0] = 33;
		temperatures[1] = 35;
		
		System.out.println("Print out two temperatures: " + temperatures[0]);
		System.out.println("Print out two temperatures: " + temperatures[1]);
		
		System.out.println("Print out two temperatures: " + temperatures.length);

	}

}
