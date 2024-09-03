package AssertEqualTest;

public class StringManipulatorIsmet {
    public String reverse(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public String capitalize(String input) {
        return input.toUpperCase();
    }
}