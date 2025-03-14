package sessions.interfaces;

public class MyList<T> implements MyListMethods<T> {

    T [] data;

    @Override
    public int size() {
        return data.length;
    }

    @Override
    public void add(T data) {

    }

    @Override
    public void printAllDataItems() {

    }
}
