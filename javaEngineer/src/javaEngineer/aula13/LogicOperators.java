package javaEngineer.aula13;

public class LogicOperators {

	public static void main(String[] args) {
		
		int conta1 = 3;
		int conta2 = 5;
		
		boolean resultado1 = (conta1 == 3) && (conta2 == 5);
		System.out.println(resultado1);
		
		boolean resultado2 = (conta1 == 3) || (conta2 == 5);
		System.out.println(resultado2);
		
		boolean truthy = true;
		boolean falsy = false;
		
		System.out.println(truthy && falsy);
		System.out.println(truthy || falsy);
		System.out.println(truthy ^ falsy);
		System.out.println(!truthy || falsy);
	}

}
