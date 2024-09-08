//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class
CWH_29_Practice_Set {
    public static void main(String[] args) {
        //Question 1
    /*    float sum= 0;
        float [] marks = {45.5f,88.5f,77.5f,99.5f,78.5f};
        for(int i=0; i<marks.length; i++){
      //      System.out.println(marks[i]);  // no need to print the marks as we need the sum
            sum = sum + marks[i];
        }
        System.out.println("The value of the sum is:" + sum);
        */

      //  Question 2
        /*
       int [] marks = {10,20,30,40,50};
       int num=40;
       boolean search_num = false;
       for(int element:marks){
           if(num==element){
               search_num = true;
               break;
           }
       }
       if(search_num){
           System.out.println("The value is present in array");
       }
       else{
           System.out.println("The value is not present in array");
       }

         */


        // Question 3
        /*
        float [] marks = {10.5f,20.5f,30.5f,40,50.5f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element/marks.length;
        }
        System.out.println("The value of average marks is:" + sum);

         */

        // Question 4
       int rows = 2;
        int columns = 3;
        int [][] M1 = {{1,2,3},
                      {7,8,9}};
        int [][] M2 = {{4,5,6},
                      {1,2,4}};
        int [][] sum = new int[rows][columns];

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                sum[i][j] = M1[i][j] + M2[i][j];
            }
        }
        System.out.println("The sum of two matrices is");

       for(int i=0; i<rows; i++){
           for(int j=0; j<columns; j++){
               System.out.print(sum[i][j] + " ");
           }
           System.out.println();
       }



        //Question 5
    /*    int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int swap;

        for(int i=0; i<n; i++){
            //Swap a[i] and a[l-1-i]
            // a   b   swap
            // |3| |4| ||
            swap = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = swap;
        }
        for(int element: arr){
            System.out.print(element + " ");
        }
     */


        //Question 6
     /*         int [] arr = {1,56,33,6,88,9,600};
              int max = Integer.MIN_VALUE;
              for(int element: arr){
                  if(element>max){
                      max = element;
                  }
              }
        System.out.println("the value of maximum element in this array is :" + max);

      */


     //   Question 8

        int [] arr = {1,2100,3,455,5,34,67};
        boolean issorted = true;
        for(int i=0; i<arr.length-1; i++){
           if(arr[i]>arr[i+1]){
               issorted = false;
           }
        }
        if(issorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }

        //Question 7
        int [] array = {10,20,30,40,5};
        int min = Integer.MAX_VALUE;
        for(int element: array){
            if(element<min){
                min = element;
            }

        }
        System.out.print("The minimum element in the array is: " + min);

    }
}