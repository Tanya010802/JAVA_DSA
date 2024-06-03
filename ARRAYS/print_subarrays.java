public class print_subarrays
{
    public static void printSubarrays(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int numbers[] = {1, 2, 3, 4, 5};
        printSubarrays(numbers);
    }
}