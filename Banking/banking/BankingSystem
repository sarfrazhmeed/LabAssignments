package banking;

import util.PinValidator;

public class BankingSystem {
    private static final String account_no = "PKSAR3390";
    private static final String pin = "2901";

    public static boolean authenticate(String account, String pin) {
        if (!account.equals(account_no)) {
            System.out.println("Incorrect Account Number.");
            return false;
        }

        PinValidator validator = new PinValidator();
        PinValidator.Rules ruleChecker = validator.new Rules();

        if (!ruleChecker.isValid(pin)) {
            System.out.println("Invalid PIN format. Must be exactly 4 digits.");
            return false;
        }

        return pin.equals(pin);
    }
}
