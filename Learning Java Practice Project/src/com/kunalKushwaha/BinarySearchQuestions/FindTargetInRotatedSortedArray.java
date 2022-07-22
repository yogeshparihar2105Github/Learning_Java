package com.kunalKushwaha.BinarySearchQuestions;
//This will not work for the duplicate values

//we have the method for duplicate values as well in the end on line 80

//the array is sorted but rotated from the pivot(i.e. pivot element or highest element)
//Find pivot element first
//then apply binary search from start = 0 to pivot
//and start = pivot + 1 to end 
//You will get the answer

public class FindTargetInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {7,8,1,2,3,4,5,6};
        int target = 2;

        System.out.println(search(arr, target));

    }

    public static int search(int[] arr, int target) {

        //Find pivot
        int pivot = findpivotElement_Index(arr);
        int end = arr.length - 1;

        //if pivot element is not found that means the array is not rotated
        if(pivot == -1)
        {
            //just do normal binary search
            return SearchInRangeUsingBinarySearch(arr, target, 0, end);
        }
        else //if pivot is found then you have to ascending array bs for both of them
        {
            if(arr[pivot] == target)
            {
                return pivot;
            }
            if(target >= arr[0])
            {
                return SearchInRangeUsingBinarySearch(arr, target, 0, pivot - 1);
            }
            return SearchInRangeUsingBinarySearch(arr, target, pivot + 1, end);
        }
    }    

    public static int findpivotElement_Index(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        //checking from start to end and in the end only 1 element will be left therefore start = end 
        while(start <= end)
        {
            int mid = start + (end - start)/2; //more optimized
            //here 4 cases will be there

            //case 1 :
            if(mid < end && arr[mid] > arr[mid + 1])
            {
                return mid;
            }
            //case 2 :
            if(mid > start && arr[mid] < arr[mid - 1])
            {
                return mid - 1;
            }
            //case 3 :
            if(arr[mid] <= arr[start])
            {
                end = mid - 1;
            }
            // case 4 : 
            else //arr[mid] > arr[start]
            {
                start = mid + 1;
            }
        }    
        return -1;
    }

    public static int findpivotElement_IndexWithDuplicates(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        //checking from start to end and in the end only 1 element will be left therefore start = end 
        while(start <= end)
        {
            int mid = start + (end - start)/2; //more optimized
            //here 4 cases will be there

            //case 1 :
            if(mid < end && arr[mid] > arr[mid + 1])
            {
                return mid;
            }
            //case 2 :
            if(mid > start && arr[mid] < arr[mid - 1])
            {
                return mid - 1;
            }
            //case 3 : 
            if(arr[mid] == arr[start] && arr[mid] == arr[end])
            {
                //first we will check is start is pivot
                if(arr[start] > arr[start + 1])
                {
                    return start;
                }
                start++;
                //now we will check is end is pivot
                if(arr[end] < arr[end - 1])
                {
                    return end - 1;
                }
                end--;
            }
            //left side is sorted so pivot should be in the right side of the array
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end]))
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }    
        return -1;
    }

    public static int SearchInRangeUsingBinarySearch(int[] arr, int target, int start, int end)
    {
        while(start<=end)
        {
            int mid = start + (end - start)/2;      // More Optimized 
            
            if(arr[mid] < target)
            {
                start = mid + 1;
                
            }
            else if(arr[mid] > target)
            {
                end = mid - 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
