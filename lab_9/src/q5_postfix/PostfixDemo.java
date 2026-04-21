package q5_postfix;

import java.util.Scanner;
import java.util.Stack;

class ConvertThread extends Thread {
    String postfix;
    String result = "";

    ConvertThread(String postfix) {
        this.postfix = postfix;
    }

    public void run() {
        Stack<String> stack = new Stack<>();

        for (char ch : postfix.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch + "");
            } else {
                String b = stack.pop();
                String a = stack.pop();
                String exp = "(" + a + ch + b + ")";
                stack.push(exp);
            }
        }

        result = stack.pop();
    }

    public String getResult() {
        return result;
    }
}

class PrintThread extends Thread {
    ConvertThread ct;

    PrintThread(ConvertThread ct) {
        this.ct = ct;
    }

    public void run() {
        try {
            ct.join(); 
        } catch (InterruptedException e) {}

        System.out.println("Infix Expression: " + ct.getResult());
    }
}

public class PostfixDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter postfix expression: ");
        String postfix = sc.next();

        ConvertThread t1 = new ConvertThread(postfix);
        PrintThread t2 = new PrintThread(t1);

        t1.start();
        t2.start();
    }
}
