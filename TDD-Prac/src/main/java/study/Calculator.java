package study;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

    private static final String DEFAULT_SEPARATOR = ",|:";
    private static final String CUSTOM_SEPARATOR = "//(.)\n(.*)";

    private static final Pattern CUSTOM_DELIMITER_PATTER = Pattern.compile(CUSTOM_SEPARATOR);

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static int splitSum(String str) {
        validationNullOrEmpty(str);

        if (isSingleNum(str))
            return Integer.valueOf(str);

        return customSum(str);

    }

    static void validationNullOrEmpty(String str) {
        if (str == null || str.isBlank())
            throw new RuntimeException("Null And Empty");
    }

    static void validationNegativeNumber(int num) {
        if (num < 0)
            throw new RuntimeException("NegativeNumer -1");
    }

    static boolean isSingleNum(String str) {
        return str.matches("\\d");
    }

    static int customSum(String str) {
        Matcher matcher = CUSTOM_DELIMITER_PATTER.matcher(str);
        if (matcher.find())
            return Arrays.stream(matcher.group(2).split(matcher.group(1)))
                    .mapToInt(Integer::valueOf)
                    .map(i -> {
                        validationNegativeNumber(i);
                        return i;
                    })
                    .sum();

        String[] splits = str.split(DEFAULT_SEPARATOR);
        return Arrays.stream(splits)
                .mapToInt(Integer::valueOf)
                .map(i -> {
                    validationNegativeNumber(i);
                    return i;
                })
                .sum();
    }
}
