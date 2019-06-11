/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyakorlas;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Gyakorlas {

   
    //bubblesort
    
    public static int[] bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
        return arr;    
    }
 

    //MinSort:
    public static int[] minSort(int tomb[]) 
    {
        int csere;
        int min;
        for( int i = 0; i < tomb.length-1; i++ )
        {   min = i;
        for( int j = i+1; j < tomb.length; j++ )
           {
           if( tomb[j] < tomb[min] )
           {   min = j;  }
           }
        if( min != i )
          {csere = tomb[i];
           tomb[i] = tomb[min];
           tomb[min] = csere;
          }
        }
        return tomb;
    }

        //minsort/bubblesort main-je
     /* public static void main(String[] args) {
        
       int[] szamok = new int [10];
       for( int i = 0; i < 10; i++)
        {
            szamok[i] = (int)(Math.random()*31);
            System.out.print(szamok[i]+ " ");
        }
        System.out.println();   System.out.println();
        //bubbleSort(szamok);
        minSort(szamok);
       for( int i = 0; i < 10; i++)
        {
            System.out.print(szamok[i]+ " ");
        }    
    }
   */
    



    public static int binarisKereses(int kulcs, int[] a) {
        int E = 0;
        int U = a.length - 1;
        while (E <= U) {
            int K = E + (U - E) / 2;
            if (kulcs < a[K]) U = K - 1;
            else if (kulcs > a[K]) E = K + 1;
            else return K;
        }
        return -1;
    }
    
    
    
    
    public static int linearisKereses(int kulcs, int[] a) {
    for (int K = 0; K < a.length; K++) {
        if (a[K] == kulcs) return K;
    }
    return -1;
    }
    
    
   
 
    public static void sortedMerge(int a[], int b[], int res[], int n, int m){
		
		//Concatinate 2 arrays
		
		int i=0, j=0, k=0;
		//adding the value of 1st array to res[k] array
		while (i < n){
			res[k] = a[i];
			i++;
			k++;
		}
		//adding the value of 2ndst array to res[k] array
		 while (j < m) {
	            res[k] = b[j];
	            j++;
	            k++;
	        }
		 // Sorting the new array with Array.sort function
		 Arrays.sort(res);	
    }
    
  
        
     
        
    public static int removeDuplicates(int res[], int a){
		
		if(a == 0 || a ==1 ){
			return a;
		}
		// to store the index of next unique element
		int j= 0 ;
		for(int i= 0; i <a-1; i++ )
			// if the current element is not equal to next element
			// then store the next element
			if(res[i] !=res [i+1])
				res[j++]= res [i];
		
		res[j++] = res [a-1];
		return j;	
    }

        
                 
    

   public static void main (String[] args) {
       
       //FESULES
      int[] arr1 = {11, 34, 66, 75};
      
      int n1 = arr1.length;
      
      int[] arr2 = {1, 5, 19, 50, 89, 100};
      
      int n2 = arr2.length;
      
      int[] merge = new int[n1 + n2];
      
      int i = 0, j = 0, k = 0, x;
      
      System.out.print("Array 1: ");
      
      for (x = 0; x < n1; x++)
         System.out.print(arr1[x] + " ");
      System.out.print("\nArray 2: ");
      
      for (x = 0; x < n2; x++)
         System.out.print(arr2[x] + " ");
      
      while (i < n1 && j < n2) {
         if (arr1[i] < arr2[j])
            merge[k++] = arr1[i++];
         else
            merge[k++] = arr2[j++];
      }
      
      while (i < n1)
         merge[k++] = arr1[i++];
      
      while (j < n2)
         merge[k++] = arr2[j++];
      System.out.print("\nArray after merging: ");
      
      for (x = 0; x < n1 + n2; x++)
         System.out.print(merge[x] + " ");
      
      
      //
      	 int a[] = {9,9,10,10,1};
		 int b[] = {81,71,1,4};
		 // length of a[]
		 int n = a.length;
		 // length of b[]
		 int m = b.length;
		 
		 //Final Merging of the array
		 
		 int res[] = new int[ n + m];
		 sortedMerge(a, b, res, n, m);
		    
                 System.out.println();
                 
		 //Printing sorted merge list
		 System.out.print("Sorted merged list");
		 
		 for (int l= 0 ; l < n+ m ;l++){
			 System.out.print( " "+ res[l]);
		 }
		 // Calling remove duplicate function
		 int h = res.length;
		 h =removeDuplicates(res, h);
		     
                 System.out.println();
                 
		// Print updated array
		 System.out.print("Printing element after removing duplicates");
	        for (int g=0; g<h; g++){
	           System.out.print (res[g]+" ");
	    }
      
    }
   
}






