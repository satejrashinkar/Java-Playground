package generics;

public interface Container<T> {
    void addItem(T item);

    T getItem();
}
