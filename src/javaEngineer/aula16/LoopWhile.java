package src.javaEngineer.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
		// Some examples of use "while:do|while"
		int data = 1; //count
		int max = 20;
		
		while(data <= max) {
			System.out.println("Counting till " + data);
			data++;
		}
		
		System.out.println(data);
		
		do {
			data++;
			System.out.println("Value of data: " + data);
		}while(data < 15);
		
		System.out.println(data);

	}

}
