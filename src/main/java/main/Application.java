package main;

public class Application {
    public static void main(String[] args) {
        System.out.print(multiply(10, 200));
    }

    @SuppressWarnings("WeakerAccess")
    public static String multiply(int startNumber, int endNumber) {
        if (!judgeParameterIsValid(startNumber, endNumber)) {
            throw new IllegalArgumentException();
        }
        return getMultiplyTableResult(startNumber, endNumber);
    }

    private static String getMultiplyTableResult(int startNumber, int endNumber) {
        StringBuilder result = new StringBuilder();
        final int padding = 6;
        final int extraPadding = 5;
        final String templet = "%s * %s = %s";
        int endNumberLength = String.valueOf(endNumber).length() * 2 + String.valueOf(endNumber * endNumber).length() + padding + extraPadding;
        for (int multiplier = startNumber; multiplier <= endNumber; multiplier++) {
            String innerResult;
            for (int anotherMultiplier = 1; anotherMultiplier <= multiplier; anotherMultiplier++) {
                innerResult = String.format(templet, anotherMultiplier, multiplier, anotherMultiplier * multiplier);
                int gap = endNumberLength - innerResult.length();
                if (anotherMultiplier < multiplier) {
                    for (int i = 0; i < gap; i++) {
                        innerResult += " ";
                    }
                }
                result.append(innerResult);
            }
            result.append("\n");
        }
        return result.toString();
    }

    private static boolean judgeParameterIsValid(int startNumber, int endNumber) {
        return startNumber < endNumber && startNumber > 0;
    }
}
