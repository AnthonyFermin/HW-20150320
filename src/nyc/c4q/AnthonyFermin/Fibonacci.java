package nyc.c4q.AnthonyFermin;

import java.util.Scanner;

/**Anthony Fermin
 * Created by c4q-anthonyf on 3/17/15.
 */
public class Fibonacci {

    public static double getFib(int numOfFib){
        double fibNum = 1;
        double previousFib = 0;
        double nextFib;

        if(numOfFib == 0){
            return previousFib;
        }else if(numOfFib > 1){
            for(int i = 1; i < numOfFib; i++){
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

        System.out.print("Enter the iteration of the fibonacci sequence you would like to compute: ");
        fibIteration = in.nextInt();
        System.out.println("F(" + fibIteration + ") = " + getFib(fibIteration));


    }

}
