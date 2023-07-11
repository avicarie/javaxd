package main.generics;

import java.time.LocalDate;
import java.util.UUID;

public class VisitEntity extends BaseEntity<UUID> {
    LocalDate visitDate;

    public VisitEntity(LocalDate visitDate) {
        this.visitDate = visitDate;
    }
}
