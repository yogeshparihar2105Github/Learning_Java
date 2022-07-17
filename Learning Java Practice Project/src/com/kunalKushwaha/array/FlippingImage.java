package com.kunalKushwaha.array;

public class FlippingImage {

    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] result = flipAndInvertImage(arr);

        for(int i=0;i<result.length;i++)
        {
            for(int j=0;j<result[i].length;j++)
            {
                System.out.print(result[i][j]+", ");
            }
            System.out.println();
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][image.length];
        
        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image[i].length;j++)
            {
                j = (image[i].length - 1) - j;
                ans[i][j] = image[i][j];
            }
        }
        
        
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[i].length;j++)
            {
                if(ans[i][j] == 0)
                {
                    ans[i][j] = 1;
                }
                else
                {
                    ans[i][j] = 0;
                }
            }
        }
        
        return ans;
        
    }
}
