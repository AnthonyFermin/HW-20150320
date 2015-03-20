package nyc.c4q.AnthonyFermin;

import java.util.Scanner;

/**Anthony Fermin
 * Created by c4q-anthonyf on 3/17/15.
 */
public class Fibonacci {

    //takes int fibIndex parameter and returns the fibonacci number corresponding to fibIndex as a long value
    public static long getFib(int fibIndex){
        long fibNum = 1;
        long previousFib = 0;
        long nextFib;

        if(fibIndex == 0){
            return previousFib;
        }else if(fibIndex >= 2){
            for(int i = 2; i <= fibIndex; i++){
                nextFib = fibNum + previousFib;
                previousFib = fibNum;
                fibNum = nextFib;
            }
        }

        return fibNum;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int fibIteration;

        System.out.print("Enter the index of the fibonacci sequence you would like to compute: ");
        fibIteration = in.nextInt();
        System.out.println("F(" + fibIteration + ") = " + getFib(fibIteration));


    }

}
