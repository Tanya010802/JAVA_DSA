//You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

//Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

//You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

//CODE 
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
   
     int l=0;
     int h=n;
        while(l<h){
             int mid = l+(h-l)/2;
            if(isBadVersion(mid)){
                h = mid;     
            }else{
                l=mid+1;
            } 
        }
        return h;
}
}

//Intution 
//Easy binary search problem , so here we need to find first bad code , so if we observe we can apply binary search here 
//there are n number of number of versions so first we will find the mid and check it is a bad version if its yes , then we will move our last pointer to mid and gaain check do we 
//any before also if not mid is the ans 
// if mid is not a bad version thn then we will move our low pointer to right and search in right side 
//Time complexity O(log n) , space complexity O(1)
