public class trappingrainwater
{
 
    
        // arr: input array
        // n: size of array
        // Function to find the trapped water between the blocks.
        static long trappingWater(int arr[], int n) { 
            // Your code here
            // Base case: if there are less than 3 bars, no water can be trapped.
            if (n <= 2) {
                return 0;
            }
    
            long water = 0;
    
            // `left` array stores the maximum height of a bar to the left of the current bar
            int[] left = new int[n];
            left[0] = arr[0];
    
            // Process bars from left to right
            for (int i = 1; i < n; i++) {
                left[i] = Math.max(left[i - 1], arr[i]);
            }
    
            // `right` array stores the maximum height of a bar to the right of the current bar
            int[] right = new int[n];
            right[n - 1] = arr[n - 1];
    
            // Process bars from right to left
            for (int i = n - 2; i >= 0; i--) {
                right[i] = Math.max(right[i + 1], arr[i]);
            }
    
            // Calculate the trapped water
            for (int i = 0; i < n; i++) {
                // Find the minimum of maximum heights on left and right
                long minHeight = Math.min(left[i], right[i]);
    
                // Calculate trapped water only if the current bar can trap water
                if (minHeight > arr[i]) {
                    water += minHeight - arr[i];
                }
            }
    
            return water;
        }
        public static void main(String args[]) {
            int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
            int n = arr.length;
            System.out.println(trappingWater(arr,n));
        }
    }
    
        
    
