
import java.util.Scanner;

/**
 * Purpose: code practice
 *Date created: 13/09/2024
 * @author BinhAn
 */
public class ExchangeRate {
    public static void main(String[] args) {
        final float VND_USD = 23500;
        String stringInput;
        float usdInput,
              vndOutput;

        System.out.print("Enter USD: ");
        Scanner sc = new Scanner(System.in);
        stringInput = sc.nextLine();
        while (true) {
            try {
                usdInput = Integer.parseInt(stringInput);
                break;
            } catch (Exception e) {
                System.err.println("Incorrect format\nPlease re-enter:");
            }
        }
        vndOutput = usdInput *VND_USD;
        System.out.println("Exchange rate " + String.format("%,.0f", usdInput) + " USD to " + String.format("%,.0f",vndOutput) + " VND");
        sc.close();
    }
}
