public class OneEndContainer<T> implements DataContainer<T>{

  protected DLNode<T> front;
  protected int numberOfElements;

  public OneEndContainer(){
    this.front = null;
    numberOfElements = 0;
  }

  public void add(T newElement){
    DLNode<T> newDLNode = new DLNode<T>(newElement);

    if (front == null){
      front = newDLNode;
    }
    else{
      DLNode<T> currentNode = front;
      front = newDLNode;
      front.setNext(currentNode);
      currentNode.setPrev(front);

    }
    numberOfElements++;
  }

  public T remove() throws EmptyContainerException{
    T frontElement;
    if(front == null){
      throw new EmptyContainerException();
    }
    else{
      frontElement = front.getData();
      front = front.getNext();
      numberOfElements--;
    }
    return frontElement;
  }

  public boolean remove(T element) throws EmptyContainerException{
    boolean flag = false;
    for (int i =0; i < numberOfElements;i++){
      if(front.getData().equals(element)){
        front = front.getNext();
        numberOfElements--;
        flag = true;
      }
    }
    if (!flag){
      throw new EmptyContainerException();
    }
    return flag;
  }

  public void clear()throws EmptyContainerException{
    if(front == null){
      throw new EmptyContainerException();
    }
    else{
      front = null;
      numberOfElements = 0;
    }
  }

  public T getFirst()throws EmptyContainerException{
    return front.getData();}

  public T getLast()throws EmptyContainerException{
    if(front == null){
      throw new EmptyContainerException();
    }
    else{
      while((front!= null) && (front.getNext()!= null)){
        front = front.getNext();

      }
    }
    return front.getData();
  }

  public boolean isEmpty(){
    if (front == null){
      return true;
    }
    return false;
  }

  public boolean isFull(){return false;}

  public int size(){return numberOfElements;}

  public boolean search(T key){
    boolean flag = false;
    DLNode<T> current = front;
    for(int i = 0; i < numberOfElements; i++){
      if(current.getData().equals(key)){
        flag = true;
      }
    current = current.getNext();
    }

    return flag;
  }

  public boolean search(T key,  DLNode<T> node){
    DLNode<T> currentNode = node;
    if(currentNode == null){
    return false;
    }
    else if (currentNode.getData().equals(key)){
      return true;
    }
    else{
      return search(key,currentNode.getNext());
    }
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
