


// exercise 1b
public class Main{
  public static void main(String[] args) {
    int row = 0;
    int SIZE = 5;
    while (row < SIZE) {
      int col = 0;
      while (col <= row) {
        System.out.print('*');
        col = col + 1;
      }
      System.out.println();  // Move to the next line after printing all * for a row
      row = row + 1;
    }
  }
}



// exercise 1b
public class TriangleDrawer {

   // This method draws a triangle with height N
   public static void drawTriangle(int N) {
       // Loop to iterate through each row of the triangle, starting from 0 up to N-1
       for (int row = 0; row < N; row++) {

           // Inner loop for printing asterisks '*' in each row
           // It will print (row+1) asterisks for each row
           for (int col = 0; col <= row; col++) {
               System.out.print('*');
           }

           // After printing asterisks for a row, move to the next line
           System.out.println();
       }
   }

   // The main method is the entry point for a Java program
   // "args" parameter contains command-line arguments
   public static void main(String[] args) {
       // Call the drawTriangle method to print a triangle of height 10
       drawTriangle(10);
   }
}


// exercise 2, while loop
public class ClassNameHere {

    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int maximumValue = m[0]; // Start with the first value of the array
        int index = 1; // Initialize index to start from the second value

        // Traverse the array using a while loop
        while (index < m.length) {
            if (m[index] > maximumValue) {
                maximumValue = m[index]; // Update maximumValue if current value is greater
            }
            index++; // Move to the next index
        }
        return maximumValue;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers)); // This will print the maximum value in the numbers array, i.e., 22
    }
}

public class ClassNameHere {
  /** return the maximum value from m */
  public static int max(int[] m) {
    if (m == null || m.length == 0) {
      throw new IlleglArgumentException("Array is empty or null");
    }

    int maximumValue = m[0];
    for (int i=1; i<m.lenght;i++){
      if (m[i] > maximumValue){
        maximumValue = m[i];
      }
      
    }
    return maximumValue;
  }

  public static void main(String[] args) {
    int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
    int max = max(numbers);
    System.out.println("The maximum value is: " + max);
  }
}


// exercise 3, for loop
public class ClassNameHere {

    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int maximumValue = m[0]; // Start with the first value of the array

        // Traverse the array starting from the second value
        for (int i = 1; i < m.length; i++) {
            if (m[i] > maximumValue) {
                maximumValue = m[i]; // Update maximumValue if current value is greater
            }
        }
        return maximumValue;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers)); // This will print the maximum value in the numbers array, i.e., 22
    }
}

// exercise 3.1, enhanced for loop
public class ClassNameHere {

    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int maximumValue = m[0]; // Start with the first value of the array

        // Traverse the array using a foreach loop
        // the String s takes on the identity of each String in a exactly once,
        for (int value : m) {
            if (value > maximumValue) {
                maximumValue = value; // Update maximumValue if current value is greater
            }
        }
        return maximumValue;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers)); // This will print the maximum value in the numbers array, i.e., 22
    }
}

// exercise 4
public class BreakContinue {
  public static void windowPosSum(int[] a, int n){
    for (int i=0; i< a.length; i++) {
      if (a[i] < 0){
        continue;
      }
    for (int j=1; j <= n; j++){
      if (i+j >= a.length) {
        break;
      }
      a[i] += a[i+j];
    }
    }
  }
}

public class BreakContinue {

  public static void windowPosSum(int[] a, int n) {
    for (int i = 0; i < a.length; i++) {
      // If the current value is negative, continue to the next iteration
      if (a[i] < 0) {
        continue;
      }

      // Loop to sum the subsequent n values
      for (int j = 1; j <= n; j++) {
        // If we reach the end of the array, break out of the inner loop
        if (i + j >= a.length) {
          break;
        }
        a[i] += a[i + j];
      }
    }
  }


  public static void main(String[] args) {
    int[] a = {1, 2, -3, 4, 5, 4};
    int n = 3;
    windowPosSum(a, n);

    // Should print [4, 8, -3, 13, 9, 4]
    System.out.println(java.util.Arrays.toString(a));
  }
}
