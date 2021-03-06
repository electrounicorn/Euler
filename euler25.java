/* Problem 25

The Fibonacci sequence is defined by the recurrence relation:

Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
Hence the first 12 terms will be:

F1 = 1
F2 = 1
F3 = 2
F4 = 3
F5 = 5
F6 = 8
F7 = 13
F8 = 21
F9 = 34
F10 = 55
F11 = 89
F12 = 144
The 12th term, F12, is the first term to contain three digits.

What is the first term in the Fibonacci sequence to contain 1000 digits?

*/

import java.util.*;
import java.math.*;

public class euler25 {
	
	public static BigInteger fib(int n){
	BigInteger fibnum0 = BigInteger.ZERO;
	BigInteger fibnum1 = BigInteger.ONE;
	BigInteger accfib = BigInteger.ZERO;
	int j = 0;
	do  {
		accfib = fibnum0.add(fibnum1);
		fibnum0 = fibnum1;
		fibnum1 = accfib;
        j++;
		} 
		while(j < n);
	return accfib;
	}
	
	public static void main(String[] args) {
		String num = "";
		int term = 0;
		while(num.length() < 1000){
			num = fib(term).toString();
			System.out.println(num);
			term++;
		}
		System.out.println(term);
	}
}
