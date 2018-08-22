package main;

public class Application {
    private static final int PADDING = 6;
    private static final int EXTRA_PADDING = 5;
    public static void main(String[] args) {
        System.out.print(multiply(100000, 100001));
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

        String templete = "%s * %s = %s";
        int endNumberLength = String.valueOf(endNumber).length() * 2 + String.valueOf((long) endNumber * endNumber).length() + PADDING + EXTRA_PADDING;
        for (int multiplier = startNumber; multiplier <= endNumber; multiplier++) {
            String inlineResult;
            for (int anotherMultiplier = startNumber; anotherMultiplier <= multiplier; anotherMultiplier++) {
                inlineResult = String.format(templete, anotherMultiplier, multiplier, (long) anotherMultiplier * multiplier);
                int gap = endNumberLength - inlineResult.length();
                if (anotherMultiplier < multiplier) {
                    for (int i = 0; i < gap; i++) {
                        inlineResult += " ";
                    }
                }
                result.append(inlineResult);
            }
            result.append("\n");
        }
        return result.toString();
    }

    private static boolean judgeParameterIsValid(int startNumber, int endNumber) {
        return startNumber < endNumber && startNumber > 0;
    }
}
