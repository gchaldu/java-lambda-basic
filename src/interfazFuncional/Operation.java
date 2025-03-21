package interfazFuncional;

public interface Operation {
    int operate(int numberOne, int numberTwo);

    default String show(){
        return "Mostrando algo...";
    }

    static Operation getAddition(){
        return (a,b) -> a + b;
    }

}
