package main;

public class Application {
    public String Multiplication(int startNumber, int endNumber) {
        StringBuilder result = new StringBuilder();
        for (int multiplier = startNumber; multiplier <= endNumber; multiplier++) {
            for (int anotherMultiplier = startNumber; anotherMultiplier <= multiplier; anotherMultiplier++) {
                result.append(anotherMultiplier + " * " + multiplier + " = " + anotherMultiplier * multiplier);
                if (anotherMultiplier < multiplier) {
                    result.append("   ");
                }
            }
            result.append("\n");
        }
        return result.toString();
    }
}
