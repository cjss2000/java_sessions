package sessions.unit_testing;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    List<Integer> list = new ArrayList<>();

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public boolean checkIfEven(int number){
        return number % 2 == 0;
    }

    public void addToList(int number){
        list.add(number);
    }

    public List<Integer> getList() {
        return list;
    }
}
