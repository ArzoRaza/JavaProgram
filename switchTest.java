import java.util.Scanner;

public class switchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String result;

        if (x < 1 || x > 10) {
            System.out.println("Invalid Input");
        } else {
            switch (x) {
                case 1:
                    result = "I";
                    break;
                case 2:
                    result = "II";
                    break;
                case 3:
                    result = "III";
                    break;
                case 4:
                    result = "IV";
                    break;
                case 5:
                    result = "V";
                    break;
                case 6:
                    result = "VI";
                    break;
                case 7:
                    result = "VII";
                    break;
                case 8:
                    result = "VIII";
                    break;
                case 9:
                    result = "IX";
                    break;
                case 10:
                    result = "X";
                    break;
                default:
                    result = "INVALID NUMBER";
                    break;
            }

            System.out.println("Result of " + x + " is = " + result);
        }
        scanner.close();
    }
}
