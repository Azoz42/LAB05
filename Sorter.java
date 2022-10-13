public class Sorter {
    public static void main(String[] args) {
<<<<<<< HEAD
        
=======
        System.out.println("null");
>>>>>>> 9294d7bd3e619087ab68043459f2b54c5392758c
    }

    
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }

    }

}
