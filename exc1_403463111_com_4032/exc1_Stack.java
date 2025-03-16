package ap_practice.exc1_403463111_com_4032;

import java.util.Scanner;
import java.util.Stack;

public class exc1_Stack {
    public static void main(String[] args) {
        System.out.println("Please input your string:");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        if (isMirrored(inputString)) {
            System.out.println("Parentheses are Correctly mirrored!");
        } else {
            System.out.println("Parentheses are Not mirrored!");
        }
    }

    public static boolean isMirrored(String instr) {
        char[] units = instr.toCharArray();
        Stack<Character> storage = new Stack<>();
        for (char each : units) {
            if (each == '(') {
                storage.push('(');
            } else if (each == ')') {
                if (storage.empty()) {
                    return false;
                } else {
                    storage.pop();
                }
            }
        }
        return storage.empty();
    }
}
