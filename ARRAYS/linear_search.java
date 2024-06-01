//import java.utils.*;
public class linear_search
{
    public static int linearsearch(int numbers[],int key)
    {
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==key){
             return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int numbers[] = {2,4,6,6,9,12,30,70};
        int key = 20;
        int result = linearsearch(numbers,key);
        if(result == -1)
        {
            System.out.println("Not Found");
        }else{
            System.out.println("Found at index "+result);
        }
    }
}

