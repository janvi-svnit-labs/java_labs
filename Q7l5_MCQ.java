import java.util.Scanner;

enum Result {
    CORRECT,
    WRONG,
    UNANSWERED
}

public class Q7l5_MCQ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] correctAns = { 'C', 'A', 'B', 'D', 'B', 'C', 'C', 'A' };
        char[] submittedAns = new char[8];

        int correct = 0, wrong = 0, unanswered = 0;

        System.out.println("Enter answers (A/B/C/D or X for skip):");

        // Taking input from user
        for (int i = 0; i < 8; i++) {
            System.out.print("Question " + (i + 1) + ": ");
            submittedAns[i] = sc.next().toUpperCase().charAt(0);
        }

        System.out.println("\nQUESTION\tSUBMITTED\tCORRECT\tRESULT");

        for (int i = 0; i < 8; i++) {

            Result result; // enum variable to access enum

            if (submittedAns[i] == 'X') {
                result = Result.UNANSWERED;
                unanswered++;
            } else if (submittedAns[i] == correctAns[i]) {
                result = Result.CORRECT;
                correct++;
            } else {
                result = Result.WRONG;
                wrong++;
            }

            System.out.println(
                    (i + 1) + "\t\t" +
                            submittedAns[i] + "\t\t" +
                            correctAns[i] + "\t" +
                            result);
        }

        System.out.println("\nNo. of correct answers: " + correct);
        System.out.println("No. of wrong answers: " + wrong);
        System.out.println("No. of questions unanswered: " + unanswered);

        if (correct >= 5) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        sc.close();
    }
}
