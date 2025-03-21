// Functional interface
interface Operation {
    int operate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        // Implementación tradicional de una clase anónima
        Operation addition = new Operation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        Operation multiplication = new Operation() {
            @Override
            public int operate(int a, int b) {
                return a * b;
            }
        };

        Operation difference = (a, b) -> a - b;


        // Lambda expression implementation
        Operation division = (a, b) -> {
            if(b==0){
                throw new IllegalArgumentException("No es posible una división por cero");
            }
            return a / b;
        };

        // Displaying results in Spanish
        System.out.println("Suma: " + addition.operate(10, 5)); // Salida: Suma: 15
        System.out.println("Multiplicación: " + multiplication.operate(10, 5)); // Salida: Multiplicación: 50
        try {
            System.out.println("División: " + division.operate(10, 5)); // Salida: División: 2
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Resta: " + difference.operate(10, 5)); // Salida: Resta: 5

    }
}

