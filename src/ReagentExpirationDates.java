package expirationDates;

import java.util.Scanner;

public class ReagentExpirationDates {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // asks user for reagent name
        System.out.println("Enter reagent name");
        while (true) {
            // calls reagent method based on name
            String reagent = scanner.nextLine();
            switch (reagent) {
            case "THF":
                ExpiryCalculator.outputReagentExpiry("THF", 90);
                break;
            case "Acetonitrile":
                ExpiryCalculator.outputReagentExpiry("Acetonitrile", 90);
                break;
            case "Acetone":
                ExpiryCalculator.outputReagentExpiry("Acetone", 90);
                break;
            case "Mobile Phase A":
                ExpiryCalculator.outputReagentExpiry("Mobile Phase A", 30);
                break;
            case "Seal Wash":
                ExpiryCalculator.outputReagentExpiry("Seal Wash", 30);
                break;
            case "SST2":
                ExpiryCalculator.outputReagentExpiry("SST2", 14);
                break;
            default:
                System.out.println("Incorrect, retry.");
            }
        }

    }
}
