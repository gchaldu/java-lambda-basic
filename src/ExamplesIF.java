import java.util.function.*;

public class ExamplesIF {
    public static void main(String[] args) {

        // Consumer: acepta un valor y no devuelve nada
        Consumer<String> consumer = message -> System.out.println("Mensaje recibido: " + message);
        consumer.accept("Hola, Gabriel!");

        // BiConsumer: acepta dos valores y no devuelve nada
        BiConsumer<String, Integer> biConsumer = (name, age) ->
                System.out.println(name + " tiene " + age + " años.");
        biConsumer.accept("Juan", 30);

        // Predicate: acepta un valor y devuelve un booleano
        Predicate<Integer> predicate = number -> number > 10;
        System.out.println("¿15 es mayor que 10? " + predicate.test(15));

        // BiPredicate: acepta dos valores y devuelve un booleano
        BiPredicate<String, Integer> biPredicate = (word, length) -> word.length() == length;
        System.out.println("¿'Java' tiene 4 letras? " + biPredicate.test("Java", 4));

        // Supplier: no recibe argumentos y devuelve un valor
        Supplier<Double> supplier = () -> Math.random();
        System.out.println("Número aleatorio: " + supplier.get());

        // Function: acepta un argumento y devuelve un valor transformado
        Function<String, Integer> function = text -> text.length();
        System.out.println("Longitud de 'Programación': " + function.apply("Programación"));

        // BiFunction: acepta dos argumentos y devuelve un resultado
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a * b;
        System.out.println("Multiplicación de 6 * 7: " + biFunction.apply(6, 7));
    }
}




