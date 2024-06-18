package Test0618;

public class StorageImpl<T> implements Storage<T> {
  private T[] array;

  public StorageImpl(int capacity) {
    this.array = (T[]) (new Object[capacity]);
  }

  public void add(T item, int index) {
    array[index] = item;
  }

  public T get(int index) {
    return array[index];
  }
}
