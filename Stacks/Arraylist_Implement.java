import java.util.*;
public class Arraylist_Implement{
    static class stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty()
        {
            return list.size()==0;
        
        }
        //push
        public static void push(int data)
        {
        list.add(data);
        }
        //pop
        public static int pop()
        {
         if(isEmpty())
        return -1;
        return list.remove(list.size()-1);
        }
        //top
        public static int top()
        {
         if(isEmpty())
        return -1;
        return list.get(list.size()-1);
        }
    //size
    public static int size()
    {
        return list.size();
        }
        //display
        public static void display()
        {
            for(int i=0;i<list.size();i++)
            System.out.print(list.get(i)+" ");
            System.out.println();
            }
        }
            public static void main(String[] args)
            {
                stack s = new stack();
                s.push(10);
                s.push(20);
                s.push(30);
                s.push(40);
                s.push(50);
                s.display();
                System.out.println("poped element is "+s.pop());
                s.display();

             }

}