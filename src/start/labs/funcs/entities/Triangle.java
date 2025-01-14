package src.start.labs.funcs.entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    // Atribuindo responsabilidade para a devida classe de fazer o cálculo da area.
    public double area(){
        double p = (a + b + c) / 2;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result;
    }
}
