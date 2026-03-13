package Validator;

public class PasswordValidator {

    public static boolean isValid(String password) {

        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {

            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }

    public static int passwordStrength(String password) {

        if (!isValid(password)) {
            return 0;
        }

        int score = 0;

        if (password.length() >= 12) {
            score += 2;
        } else {
            score += 1;
        }

        if (password.matches(".*[!@#$%^&*()].*")) {
            score += 2;
        }

        if (password.chars().distinct().count() > password.length() / 2) {
            score += 1;
        }

        return score;
    }
}