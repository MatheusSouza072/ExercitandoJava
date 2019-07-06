package cursojavacompleto.cp1;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        
        double a = 1.0, b = -3.0, c = -4.0;
        double x1 = (-b + Math.sqrt(b * b - 4.0 * a * c)) / (2.0 * a);

        System.out.println(x1);
    }

    
}