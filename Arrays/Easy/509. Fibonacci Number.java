// simply use the formula

/*
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).
*/

class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        int temp;
        if (n==0) return a;
        if (n==1) return b;
        for (int i=2; i<=n; i++){
            temp=a+b;
            a=b;
            b=temp;
        }
        return b;
    }
}
