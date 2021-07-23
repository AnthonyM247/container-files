public class TwoEndsContainer<T> implements DataContainer<T>{

  protected DLNode<T> front;
  protected DLNode<T> back;
  protected int numberOfElements;

  public TwoEndsContainer(){
    this.front = null;
    this.back = null;
    numberOfElements = 0;
  }


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

  public T remove()throws EmptyContainerException{
    T frontElement;
    if(front == null && back == null){
      throw new EmptyContainerException();
    }
    else{
      frontElement = front.getData();
      front = front.getNext();
      numberOfElements--;
    }
    return frontElement;}

  public boolean remove(T element)throws EmptyContainerException{return false;}

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

  public T getFirst()throws EmptyContainerException{
    return front.getData();
  }

  public T getLast()throws EmptyContainerException{
    while(!isEmpty() &&  front.getNext() != null){
      front = front.getNext();
    }

    return front.getData();
 }

  public boolean isEmpty(){
    if(front == null && back == null){
      return true;
    }
    return false;
  }

  public boolean isFull(){return false;}

  public int size(){return numberOfElements;}

  public boolean search(T key){
    DLNode<T>  currentNode = front;
    boolean flag = false;
    for (int i = 0; i < numberOfElements; i++){
      if( currentNode.getData().equals(key)){
        flag = true;
      }
      currentNode = currentNode.getNext();
    }
    return flag;
  }

  public boolean search(T key,  DLNode<T> node){
    if(node.getNext().equals(null)){
      return false;
    }
    else if(node.getData().equals(key)){
      return true;
    }
    else
     return search(key,node.getNext());

    }

  public String toString(){
      String myString ="[";

    for(int i =0; i < numberOfElements; i++){
      if(i == numberOfElements -1 ){
      myString += front.getData();
      break;
      }
      else{
      myString += front.getData()+ ", ";
      front = front.getNext();
    }


    }
    myString +="]";

    return myString;
  }

}
