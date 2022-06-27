package yogesh;

import java.util.Random;
import java.util.Scanner;

import org.w3c.dom.ranges.Range;

public class MiniGame {
    public static void main(String[] args) {
        System.out.println("What is your NAME : ");
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.next();

            Random rand = new Random();

      short n =  Range.START_TO_END;

      System.out.println(n);
      System.out.println(rand);
      System.out.println(name);
        }
    }
}
