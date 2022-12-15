package src.start.aula08_09;

public class TestingFor {
    public static void main(String[] args) {
        // This are the two ways to apply conditionals.

        for(int i=0; i <= 10; i++){
            System.out.println("Value of i is: " + i);
        }

        int cont = 0;
        while(cont <= 20){
            System.out.println(cont);
            cont++;
        }
    }
}
