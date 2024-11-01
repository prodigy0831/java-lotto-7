package lotto.validation;

import org.junit.platform.commons.util.StringUtils;

public class PurchaseAmountValidation {
    private final static int PRICE_PER_LOTTO = 1000;
    private final static String INVALID_PRICE_INPUT = "[ERROR]올바른 금액을 입력해 주시기 바랍니다.";
    private final static String NUMBER_REGEX = "\\d+";

    public static void validate(String input) {
        if (input == null || input.isBlank() || !input.matches(NUMBER_REGEX)) {
            throw new IllegalArgumentException(INVALID_PRICE_INPUT);
        }
        String trimmedInput = input.trim();

    }
}
