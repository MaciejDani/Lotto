package pl.lotto.domain.numberreceiver.dto;

import java.time.LocalDateTime;
import java.util.Set;
import lombok.Builder;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

@Builder
public record TicketDto(
        String hash,
        Set<Integer> numbers,
        LocalDateTime drawDate,
        String message,
        Integer age) {
}
