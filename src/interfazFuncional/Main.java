package interfazFuncional;

public class Main {
    public static void main(String[] args) {
        Operation addition = new Operation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        Operation addition2 = (a, b) -> a + b;

        System.out.println("La suma de: " + addition.operate(2,2));
        System.out.println("La suma de: " + addition2.operate(4,2));

        System.out.println(addition2.show());

        Operation addition3 = Operation.getAddition();
        System.out.println("La suma con getAddition es: " + addition3.operate(3, 5));
    }
}

