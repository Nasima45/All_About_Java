package org.example.ArraySamples;

public class BasicMathCode {
    public static void main(String[] args) {
        int num = 1234;
        printDigit(num);
        int ans = countDigit(num);
        int sum = sumOfDigit(num);
        System.out.println("sum of the digit : " + sum);
        System.out.println("count of the digit is :" + ans);
        reverseOfDigit(num);
        System.out.println(isPrime(num) ? "yes prime" : "not prime");
        System.out.println("GCD of a and b :" + getGCD(18, 12));
        System.out.println("LCM of a and b: " + getLCM(3, 4));
        System.out.println("factorial of 6 is " + factorial(6));
        System.out.println("Are a is armstrong: " + armstrong(153));
        System.out.println("Are a is armstrong: " + generalArmstrong(1634));
        System.out.println("Is a is a perfect number: " + isPerfectNum(9));
        for(int i=1;i<=13;i++){
            primeNumberList(i);
        }


    }

    public static void printDigit(int num) {
        int rem, count = 0;
        while (num > 0) {
            rem = num % 10;
            System.out.println(rem);
            num = num / 10;
        }
    }

    public static int countDigit(int num) {
        int rem, count = 0;
        while (num > 0) {
            rem = num % 10;
            count++;
            num = num / 10;
        }
        return count;
    }

    public static int sumOfDigit(int num) {
        int rem, sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return sum;
    }

    public static void reverseOfDigit(int num) {
        int rem, sum = 0;
        while (num > 0) {
            rem = num % 10;
            System.out.print(rem);
            num = num / 10;
        }
    }

    public static boolean isPrime(int num) {
        System.out.println();
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getGCD(int a, int b) {
        //gcd(a,b)->(b,a%b)
        //gcd(18,12)->(12,18%12=6)
        //gecd(12,6)->(6,12%6=0)
        //gcd(6,0)->6
        //loop will continuw until b's value is not zero
        while (b != 0) {
            int oldValueOfB = b;
            b = a % b;
            a = oldValueOfB;
        }
        //the moment b value will be 0 we will return the a
        int ans = a;
        return ans;
    }

    public static int getLCM(int a, int b) {
        int gcd = getGCD(a, b);
        int product = a * b;
        int lcm = product / gcd;
        return lcm;
    }

    public static int factorial(int num) {
        int fact = 1;
        //6*6-1
        //fact
        while (num > 0) {
            fact = fact * num;
            num--;
        }
        return fact;
    }

    public static boolean armstrong(int num) {
        int rem = 0;
        int result = 0;
        int temp = num;
        while (num != 0) {
            rem = num % 10;
            result = rem * rem * rem + result;
            num = num / 10;
        }
        return temp == result;
    }

    public static boolean generalArmstrong(int num) {
        int temp = num;
        int original = num;
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        double result = 0;
        int rem;
        while (temp != 0) {
            rem = temp % 10;
            result = result + Math.pow(rem, count);
            temp = temp / 10;
        }
        return result == original;

    }

    public static boolean isPerfectNum(int num) {
        int sum = 0;
        int temp = num;
        for (int i = 1; i <= num / 2; i++) {

            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return temp == sum;
    }
    public static void primeNumberList(int num){
        if(num<=1){
            return;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                System.out.println(num+ ":go back and come with a prime num");
                return;
            }
        }
        System.out.println(num +" is a prime ");
    }
}
