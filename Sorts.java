public class Sorts {
  /**Selection sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data the elements to be sorted.
  */
  public static void selectionSort(int [] ary){
    for (int i = 0; i < ary.length-1; i++){
      int min = i; // index of smallest value left
      for (int x = i + 1; x < ary.length; x++){
        if (ary[x] < ary[min]){
          min = x; // index of new min
        }
      }
      if (min != i) {
        int temp = ary[i];
        ary[i] = ary[min];
        ary[min] = temp;
      }
    }
  }

  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    for (int i = 0; i < data.length - 1; i++){
      boolean switched = true;
      while (switched == true){
        for (int x = 0; x < data.length - 1 - i; x++){
          if (data[x] > data [x+1]) {
            int temp = data[x];
            data[x] = data[x+1];
            data[x+1] = temp;
          }
          else {
            switched = false;
          }
        }
      }
    }
  }

  /**Insertion sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data the elements to be sorted.
  */
  public static void insertionSort(int[] ary){
    int sortedIndex, currentVal;
    for (int i = 1; i < ary.length-1; i++){
      currentVal = ary[i];
      int x = i-1;
      while (x > 0 && ary[x] > currentVal){
        ary[x+1] = ary[x];
        x -= 1;
      }
      ary[x+1] = currentVal;
    }
  }


  // ------------------------------
  //Timothy So's driver
  public static String printArray(int[] ary) {
    String output = "[";
    for(int i=0; i<ary.length-1; i++) {
      output += ary[i] + ", ";
    }
    return output += ary[ary.length-1] + "]";
  }

  public static void main(String[] args) {

    // Google random int generator

    String sorted = "";

    // 8 nums, [0:10]
    int[] test_a = { 3, 4, 7, 1, 6, 2, 8, 6 };
    System.out.println(printArray(test_a));               // [3, 4, 7, 1, 6, 2, 8, 6]

    //selectionSort(test_a);
    //bubbleSort(test_a);

    sorted = printArray(test_a);
    System.out.println(sorted);               // [1, 2, 3, 4, 6, 6, 7, 8]

    if(sorted.equals("[1, 2, 3, 4, 6, 6, 7, 8]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }

    // 12 nums, [0:20]
    int[] test_b = { 17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17 };
    System.out.println(printArray(test_b));   // [17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17]

    //selectionSort(test_b);
    //bubbleSort(test_b);

    sorted = printArray(test_b);
    System.out.println(sorted);               // [1, 1, 2, 5, 11, 13, 17, 17, 18, 18, 19, 20]

    if(sorted.equals("[1, 1, 2, 5, 11, 13, 17, 17, 18, 18, 19, 20]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }

    // 20 nums, [0:100]
    int[] test_c = { 14, 32, 19, 66, 61, 96, 33, 48, 30, 100, 65, 37, 15, 85, 1, 35, 9, 57, 50, 52 };
    System.out.println(printArray(test_c));   // [14, 32, 19, 66, 61, 96, 33, 48, 30, 100, 65, 37, 15, 85, 1, 35, 9, 57, 50, 52]

    //selectionSort(test_c);
    //bubbleSort(test_c);

    sorted = printArray(test_c);
    System.out.println(sorted);               // [1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]

    if(sorted.equals("[1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }
  }
}
