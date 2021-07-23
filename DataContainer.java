public interface DataContainer<T>{

  public void add(T newElement);

  public T remove();

  public boolean remove(T element);

  public void clear();

  public T getFirst();

  public T getLast();

  public boolean isEmpty();

  public boolean isFull();

  public int size();

  public boolean search(T key);

  public boolean search(T key, DLNode<T> node);

  public String toString();
}
