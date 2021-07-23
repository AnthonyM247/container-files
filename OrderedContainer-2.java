/*
 * OrderedContainer child class of twoEndsContainer with ordered nodes.
 * @author Anthony Martinez
 */


public class OrderedContainer<T extends Comparable<T>> extends TwoEndsContainer<T>{

  public void add(T newElement){
    DLNode<T> newDLNode = new DLNode<T>(newElement);
    if (front == null){
      back = newDLNode;
      front = newDLNode;
    }
    else if(newDLNode.getData().compareTo(front.getData()) <= 0){
      newDLNode.setNext(front);
      front = newDLNode;
      front.setPrev(null);
    }
    else{
      DLNode<T> currentNode = front;
      while ((currentNode.getNext() != null) && (newDLNode.getData().compareTo(currentNode.getNext().getData()) > 0)) {
        currentNode = currentNode.getNext();
      }
      newDLNode.setNext(currentNode.getNext());
      newDLNode.setPrev(currentNode);
      currentNode.setNext(newDLNode);
      currentNode = newDLNode;
      currentNode.setNext(currentNode.getNext());


      }
      numberOfElements++;
  }


}
