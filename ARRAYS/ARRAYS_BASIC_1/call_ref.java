import java.util.*;
public class call_ref
{
    public static void update(int marks[])
    {
        for(int i=0;i<marks.length;i++)
        {
              marks[i] = marks[i]+1;
        }
    }
    public static void main(String args[])
    {
        int marks[] = {10,20,30,40,50};
        update(marks);
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }    
    }

}