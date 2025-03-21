package interfazFuncional;

public class Main {
    public static void main(String[] args) {
        // Implementación tradicional de una clase anónima
        Operation addition = new Operation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        Operation addition2 = (a, b) -> a + b;

        System.out.println("La suma de: " + addition.operate(2,2));
        System.out.println("La suma de: " + addition2.operate(4,2));
    }
}

