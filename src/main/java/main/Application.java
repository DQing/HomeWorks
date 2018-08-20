package main;

public class Application {
    public String Multiplication(int startNumber, int endNumber) {
        if (!judgeParameterIsNotIllegal(startNumber, endNumber)) {
            throw new IllegalArgumentException("IllegalArgumentException");
        }
        StringBuilder result = new StringBuilder();
        for (int multiplier = startNumber; multiplier <= endNumber; multiplier++) {
            for (int anotherMultiplier = 1; anotherMultiplier <= multiplier; anotherMultiplier++) {
                result.append(anotherMultiplier + " * " + multiplier + " = " + anotherMultiplier * multiplier);
                if (anotherMultiplier < multiplier) {
                    result.append("   ");
                }
            }
            result.append("\n");
        }
        return result.toString();
    }

    public Boolean judgeParameterIsNotIllegal(int startNumber, int endNumber) {
        Boolean result = true;
        Boolean case1 = startNumber > endNumber;
        Boolean case2 = startNumber == endNumber;
        Boolean case3 = startNumber < 0 || endNumber < 0;

        if (case1 || case2 || case3)
            result = false;
        return result;
    }
}
