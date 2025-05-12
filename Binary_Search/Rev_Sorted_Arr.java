import java.util.*;
import java.io.*;
import java.lang.*;
class Rev_Sorted_Arr{
    public static Search(int arr[], int target)
    {
        int low = 0;
        int high = arr.length -1;
        while(low<=high)
        {
            int mid = low+(high-low) / 2;
            if(arr[mid]==target)
            {
                return mid;
            }
          if (target>arr[mid])
          {
            low = mid+1; 
          }
          else {
            high = mid-1;
          }
        }
        return -1;
    }
     public static void main(String[] args)
    {
        int arr[] = { 5, 4, 3, 2, 1 };
        int target = 5;
        System.out.println(
            Search(arr,target));
    }
}

