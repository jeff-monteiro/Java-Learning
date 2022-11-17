package javaEngineer.aula17;

public class LoopFor {

	public static void main(String[] args) {
		
		// Some examples of the use "for"
		for( int i = 0; i <= 10; i++) {
			System.out.println("The value of the i is: " + i);
		}
		
		for( int j = 10; j >= 0; j--) {
			System.out.println("The value of the j is: " + j);
		}
		
		for(int t = 0, m = 5 ; t < m ; t++, m--) {
			System.out.println("Values are: "+ t + "; "+ m);
		}
		
		int count = 0;
		for(; count <= 10; ) {
			System.out.println("Value of count: "+ count);
			count += 2;
		}
		
		for(int cont=0; cont < 10; cont += 2) {
			System.out.println("Value of count: "+ cont);
		}
		
		int increment = 0;
		for(int i=1; i < 5; increment += i++);
		System.out.println(increment);
	}

}
