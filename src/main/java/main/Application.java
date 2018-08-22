package main;

public class Application {
    private static final int PADDING = 6;
    private static final int EXTRA_PADDING = 5;

    public static void main(String[] args) {
        System.out.print(getMultiplicationTable(100000, 100001));
    }
    @SuppressWarnings("WeakerAccess")
    public static String getMultiplicationTable(int startNumber, int endNumber) {
        judgeParameterIsValid(startNumber, endNumber);
        return getMultiplyTableResult(startNumber, endNumber);
    }

    private static String getMultiplyTableResult(int startNumber, int endNumber) {
        StringBuilder result = new StringBuilder();
        String templete = "%s * %s = %s";
        int endNumberLength = String.valueOf(endNumber).length() * 2 + String.valueOf((long) endNumber * endNumber).length() + PADDING + EXTRA_PADDING;
        for (int multiplier = startNumber; multiplier <= endNumber; multiplier++) {
            String inlineResult;
            for (int anotherMultiplier = startNumber; anotherMultiplier <= multiplier; anotherMultiplier++) {
                inlineResult = String.format(templete, anotherMultiplier, multiplier, (long) anotherMultiplier * multiplier);
                inlineResult = getAddPaddingString(endNumberLength, multiplier, inlineResult, anotherMultiplier);
                result.append(inlineResult);
            }
            result.append("\n");
        }
        return result.toString();
    }

    private static String getAddPaddingString(int endNumberLength, int multiplier, String inlineResult, int anotherMultiplier) {
        StringBuilder result = new StringBuilder(inlineResult);
        int gap = endNumberLength - result.length();
        if (anotherMultiplier < multiplier) {
            for (int i = 0; i < gap; i++) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    private static void judgeParameterIsValid(int startNumber, int endNumber) {
        boolean parameterIsValid = startNumber < endNumber && startNumber > 0;
        if (!parameterIsValid) {
            throw new IllegalArgumentException();
        }
    }
}
