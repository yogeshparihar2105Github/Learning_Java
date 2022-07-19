package com.kunalKushwaha.BinarySearchQuestions;

//You have to find the biggest element
public class FindThePeakElementInMountainArray {

    public static void main(String[] args) {
        int [] arr = {1,2,4,3,2,1};

        // System.out.println(usingLinearSearch(arr)); // This will take long time when array size increases take O of N time complexity
        System.out.println(usingBinarySearch(arr));

    }
    
    public static int usingBinarySearch(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start != end)
        {
            //find middle element
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid + 1])
            {
                //because you are in the decreasing part of the array 
                //hence the answer will lie in the left of the array
                //and you dont need to check for mid + 1 because we already checked it 
                //It is less than the mid
                end = mid;
            }
            else
            {
                //arr[mid] < arr[mid + 1]
                //you are in the increasing part of the array
                //hence the answer will lie in the right of the array
                //here start will set to the mid + 1 because we checked the mid is lesser than the mid + 1 
                //hence start will be like this
                start = mid + 1;
            }
            
        }
        //in the end while loop breaks when start and end will be equal and 
        //point the peak element 
        return start; //or end since both will be equal at the end
    }



    public static int usingLinearSearch(int[] arr)
    {
        int ans = arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>ans)
            {
                ans = arr[i];
            }
        }
        return ans;
    }




}
