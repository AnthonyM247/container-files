public class OrderedContainer<T extends Comparable<T>> extends TwoEndsContainer<T>{

    public void add(T newElement){
    DLNode<T> newDLNode = new DLNode<T>(newElement);
    if (back == null){
      back = newDLNode;
      front = newDLNode;
    }
    else{
      DLNode<T> currentNode = back;
      back = newDLNode;
      back.setPrev(currentNode);
      currentNode.setNext(back);

    }
    numberOfElements++;
  }

  public void clear()throws EmptyContainerException{
    if(front == null && back == null){
      throw new EmptyContainerException();
    }
    else{
      front = null;
      back = null;
      numberOfElements = 0;
    }
  }
}
