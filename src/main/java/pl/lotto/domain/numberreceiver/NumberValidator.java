package pl.lotto.domain.numberreceiver;

import java.util.Set;

class NumberValidator {

    public static final int MAX_NUMBERS_FROM_USER = 6;
    public static final int MAXIMAL_NUMBERS_FROM_USER = 99;
    public static final int MINIMAL_NUMBERS_FROM_USER = 1;

    boolean areAllNumbersInRange(Set<Integer> numbersFromUser) {
        return numbersFromUser.stream()
                .filter(number -> number >= MINIMAL_NUMBERS_FROM_USER)
                .filter(number -> number <= MAXIMAL_NUMBERS_FROM_USER)
                .count() == MAX_NUMBERS_FROM_USER;
    }
}
