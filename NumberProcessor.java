
public class NumberProcessor {
 /**
     *
     *  This method returns true if its integer argument is "special", otherwise it returns false
     *  A number is defined to be special if where sum of its positive divisors equals to the number itself.
     *  For example, 6 and 28 are "special whereas 4 and 18 are not.
     *
   */
          public static boolean isSpecial(int input) {

            if (input < 1){return false;}// check if the input is 0

            int mySum = 0;

            int myCounter = input - 1;

            int isaDivisor;

            for(int i = 0; i < input; i++){// run a loop to check the inputs divisors
              // exclude the integer itself

              isaDivisor = input % myCounter;

              if(isaDivisor == 0){

                mySum += myCounter;

              }

              myCounter--;

              if(myCounter == 0){

              break;

              }
            }
            if(mySum == input){

              //System.out.print("true");

              return true;

            }
            else{

              //System.out.print("false");

              return false;

            }
     }
   /**
     *
     * This method returns true if a number is "UniquePrime", false otherwise.
     * A number is called "UniquePrime", if the number is a prime number and if
     *  we repeatedly move the first digit of the number  to the end, the number still remains prime.
     *  For example, 197 is a prime number, if we move the first digit to the end,
     *  we will have a number 971, which is a prime number, if we again move the first digit to the end, we get 719, which is a prime number.
     *
     */
          public static boolean isUniquePrime(int num) {
             // DELETE THE LINE BELOW ONCE YOU IMPLEMENT THE CALL!
         //throw new RuntimeException("not implemented!");
            boolean myAnswer = true;
         if (num < 1){
         myAnswer = false;
         }
         for(int i = 2 ; i < num; i++){

           if (num % i == 0){
           myAnswer = false;
           }
         }

         return myAnswer;
          }



      /**
      *
      * This method accepts an  integer and returns true if the number is SquareAdditive, false otherwise.
      * onsider a k-digit number n. Square it and add the right k digits to the left k or k-1 digits. If the resultant sum is n, then n is called a SquareAdditive number.
      * For example, 9 is a SquareAdditive number
      *
      */

          public static boolean isSquareAdditive(int num) {
      // DELETE THE LINE BELOW ONCE YOU IMPLEMENT THE CALL!
         //throw new RuntimeException(" is Square Additive not implemented!");

         int squared = num * num;
         int sum = 0;
         int digit;



         if (sum == squared){

           return true;}

         return false;
 }
//
      /**
      *
      * Considering the sequence
         *            1, 3, 6, 10, 15, 21, 28, 36, ...

         * The method returns the nth sequence number. If n is <= 0, it returns 0
      *
      */

          public static int masonSequence(int num){
      // DELETE THE LINE BELOW ONCE YOU IMPLEMENT THE CALL!
         //throw new RuntimeException("not implemented!");

             //int total = 0;
             int mySequence = 0;

             for (int i = 1; i <= num ; i++){

               mySequence += i;

             }
             if (num <= 0){
             mySequence = 0;
             }
             return mySequence;
          }
   /**
     *
     * A composite integer is called ReversibleSum if it fulfills the following two conditions:
     *
     * 1. The sum of its digits is the same as the sum of the digits of its prime factors. For example, 121 has two prime factors 11 * 11.
     *        The sum of the digits of the two prime factors is 1 + 1 + 1 + 1 = 4 and the sum of the digits of 121 is 1 + 2 + 1 = 4.
     * 2. The reverse of the number equals to the number itself. For example, 121 has a reverse 121.
     *
     *   The method returns true if the number is ReversibleSum
     */

      public static boolean isReversibleSum(int num) {
      // DELETE THE LINE BELOW ONCE YOU IMPLEMENT THE CALL!
         //throw new RuntimeException("not implemented!");
        int totalSum = 0;
        boolean myResult = false;
        int numTotal = 0;
        int numChecking = num;
        int factor = 2;

        //adding up input sum
        while (numChecking > 0){
          numTotal += (numChecking % 10);
          numChecking /= 10;
        }
          //System.out.println("numTotal is " + numTotal);
        //adding up input sum



         return myResult;
      }



      /**
      *
      * This method returns true if the array is Incremental false otherwise.
      * An array is called Incremental if it has the following properties:
         *        - The value of the first element equals the sum of the next two elements, which is equals to the next three elements, equals to the sum of the next four elements, etc.
         *        - It has a size of x*(x+1)/2 for some positive integer x .
         *
         *  For example {6, 2, 4, 2, 2, 2, 1, 5, 0, 0} isIncremental, whereas {2, 1, 2, 3, 5, 6} is not
      */

      public static  boolean isIncremental(int array[]) {
      // DELETE THE LINE BELOW ONCE YOU IMPLEMENT THE CALL!
         //throw new RuntimeException("not implemented!");
         int compareTo = array[0];
         boolean myAnswer = false;
         int addUpTo = 2;
         int sum = 0;
         int myIndex = 1;
         for (int i = 1; i <= array.length; i++){

           for (int y = myIndex; y <= addUpTo; y++){
             sum += array[y];
             System.out.println("my current Sum is "+ sum);

           }

           addUpTo += 1;
           myIndex = myIndex + addUpTo;
//           i += addUpTo;
           sum = 0;
//           if(sum == compareTo){
//             myAnswer = true;
//
//           }
//           if((addUpTo+i)> array.length){
//             break;
//           }
//
         }
         return myAnswer;
     }

   /**
     *
     * TThis method accepts array of integers and sort the array
     */
      public static void descendingSort (int [ ] data){
      // DELETE THE LINE BELOW ONCE YOU IMPLEMENT THE CALL!
         //throw new RuntimeException("not implemented!");
        int storeOld;
        int y;
        for (int i = 0; i < data.length ; i++){

          //System.out.println("cuurrent iteration "+ i + " current value " + data[i]);

          for (y = i + 1; y < data.length; y++){
            //System.out.println(" current old val in position "+i+ " is "+ data[i]);

            if(data[i] < data[y]){
              storeOld = data[i];
              data[i] = data[y];
              data[y] = storeOld;
              //System.out.println("new location " + i +" is "+ data[i]);
              //System.out.println("new location " + y +" is "+ data[y]);

            }
          }
        }
     }

      /**
      *
      * This method returns true if the array is PairArray, false otherwise.
      * An array is called PairArray if exactly one pair of its elements sum to 18.
      * For example, {4,16,14, 13} is PairArray as only 4 and 14 sum to 18
      * The array {18,3,0,15,5} is not PairArray as more than one pair (18,0) and (3,15) sum to 18.
      * {4,1,11} is not also PairArray as no pair sums to 18
      *
      *
      */
      public static boolean isPairArray(int array[]) {
      // DELETE THE LINE BELOW ONCE YOU IMPLEMENT THE CALL!
//         throw new RuntimeException("not implemented!");
        boolean myAnswer = false;
        int numMatch = 18;
        int total;
        for (int i = 0; i < array.length ; i++){

          for(int y = 0; y < array.length; y++){
            //System.out.println("Current i: " + i + " current y: "+y);
            total = array[i]+array[y];
            //System.out.println("current total is: " + total);
            if (y == i){
              //System.out.println("Current i: " + i + " current y: "+y);
              //System.out.println("Skip this iteration ");
              continue;
            }

            if(total == numMatch){
              if ((array[i] == 0) || (array[y] == 0)){
              myAnswer = false;
              }
              else{  //System.out.println("Current i: " + i + " current y: "+y);

              myAnswer = true;
              }    //System.out.println("Current answer is: " + myAnswer);
            }

          }
        }
        //System.out.println("Current answer is: " + myAnswer);
        return myAnswer;
     }

  /**
      *
      *  this method accepts positive integer and returns an array of size n2 with elements in a specific pattern.
      *  For example, for n = 2, the method returns an array with elements {0,1,2,1}.
      */
      public static int [ ] arrayPattern(int n) {
      // DELETE THE LINE BELOW ONCE YOU IMPLEMENT THE CALL!
         //throw new RuntimeException("not implemented!");
        int arraySize = n*n;
        int[] myArray = new int[arraySize];
        int defaultNum = 0;

        for (int i = arraySize; i < 0 ; i--){
            myArray[i] = 1;
         }
        //System.out.println("my array is: " + myArray);
        return myArray;
     }




   /**
     *
     * This method returns true if the array is Summative, false otherwise.
     * An array is called Summative if the nth element (n >0) of the array is the sum of the first n elements.
     *
     * For example, {2, 2, 4, 8, 16, 32, 64} is Summative, whereas {1, 1, 2, 4, 9, 17} is not.
     *
     */


      public static boolean isSummative(int array[]) {
      // DELETE THE LINE BELOW ONCE YOU IMPLEMENT THE CALL!
         //throw new RuntimeException("not implemented!");
        int mySum = 0;
        boolean answer = true;
        int compareTo = array[array.length-1];
        for(int i = 0; i < array.length-1 ; i++){
          mySum += array[i];
        }
        if(array.length == 1){
            mySum = array[0];
        }
        if(mySum != compareTo){

          answer = false;

        }
        //System.out.println("my last num is : "+ compareTo);
        //System.out.println("my  Sum is : "+ mySum);
        return answer;
     }



}
