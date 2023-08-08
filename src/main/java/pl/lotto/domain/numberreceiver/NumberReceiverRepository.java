package pl.lotto.domain.numberreceiver;

import pl.lotto.domain.numberreceiver.Ticket;

import java.time.LocalDateTime;
import java.util.List;

public interface NumberReceiverRepository {
    Ticket save (Ticket ticket);
    List<Ticket> findAllTicketsByDrawDate(LocalDateTime date);
}
