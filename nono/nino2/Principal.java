public class Principal  implements Calculadora {
    public double adicionar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        double a = 10;
        double b = 5;
        
        System.out.println("Adição: " + calc.adicionar(a, b));
        System.out.println("Subtração: " + calc.subtrair(a, b));
        System.out.println("Multiplicação: " + calc.multiplicar(a, b));
        System.out.println("Divisão: " + calc.dividir(a, b));
    }

    @Override
    public String toString() {
        return "Principal []";
    }
}
