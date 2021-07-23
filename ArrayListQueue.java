
import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 A class of queue  whose entries are stored in a ArrayList.
 @author
 @version
 */
public final class ArrayListQueue<T> implements QueueInterface<T>
{
   private ArrayList<T> queue;   // Last element is the top entry in stack

   private static final int DEFAULT_CAPACITY = 50;


   public ArrayListQueue()
   {
      this(DEFAULT_CAPACITY);
   } // end default constructor

   public ArrayListQueue(int initialCapacity)
   {

      queue = new ArrayList<>(initialCapacity); // Size doubles as needed

   } // end constructor


   public void enqueue(T newEntry)
   {

	   queue.add(newEntry);
   } // end enqueue


   public T getFirst()
   {

      if (isEmpty())
         throw new EmptyStackException();
      else
         return queue.get(0);
   } // end getFirst

   public T getLast()
   {

      if (isEmpty())
         throw new EmptyStackException();
      else
         return queue.get(queue.size()-1);
   } // end getFirst


   public T dequeue()
   {

      if (isEmpty())
         throw new EmptyStackException();
      else
         return queue.remove(0);
   } // end pop


   public boolean isEmpty()
   {

      return queue.isEmpty();
   } // end isEmpty


   public void clear()
   {

	   queue.clear();
   } // end clear


} // end ArrayListQueue
