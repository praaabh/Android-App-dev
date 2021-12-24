package com.company;
import java.util.Scanner;

public class Main {
    //  Neon number
    public static void main(String[] args) {
        int sum = 0, num;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number- ");

        num = sc.nextInt();
        int squa = num * num;

        while(squa != 0)
        {
            int digit = squa%10;
            sum = sum + digit;
            squa = squa / 10;
        }
        if (num == sum)
            System.out.println(num + " is a neon number");
        else
            System.out.println(num + " is not a neon number");
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number, temp, total = 0;

        Scanner hm = new Scanner(System.in);
        System.out.println("enter a number- ");
        int n =hm.nextInt();

        number = n;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == n)
            System.out.println(n + " is an armstrong number");
        else
            System.out.println(n + " is not an armstrong number");
    }
}

    Scanner sc = new Scanner(System.in);
        try
                {
                long n=sc.nextLong();
                if(Long.toString(n).length() == 10)
                {
                int i=10;
                int sum=0;

                while(n>0)
                {
                long rem=n%10;
                n/=10;

                sum+=(i*rem);
                i--;

                }

                if(sum%11 == 0)
                System.out.println("ISBN Number");
                else
                System.out.println("Not an ISBN Number");
                }
                }
                finally
                {
                sc.close();
                }

                }
                }
