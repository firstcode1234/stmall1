package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class StockIncrease extends AbstractEvent {

    private Long id;

    public StockIncrease(Inventory aggregate) {
        super(aggregate);
    }

    public StockIncrease() {
        super();
    }
}
//>>> DDD / Domain Event
