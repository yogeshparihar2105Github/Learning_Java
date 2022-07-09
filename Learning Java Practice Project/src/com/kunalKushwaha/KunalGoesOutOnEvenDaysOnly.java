package com.kunalKushwaha;

public class KunalGoesOutOnEvenDaysOnly {
    public static void main(String[] args) {
        //the month is august which has 30 days 
        //since kunal goes out on even days only 2,4,6...30
        //count how many such number are there
        //which will gives how many days kunal go outside

        int count = 0;
        for(int i = 1; i<=30; i++)
        {
            if(i%2 == 0)
            {
                count++;
            }
        }
        System.out.println("The number of days Kunal will go outside is : "+count);
    }
}
