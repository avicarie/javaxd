package main.classes;

import java.time.Clock;
import java.time.LocalDateTime;

public class Mathematics {
    Clock clock = Clock.systemDefaultZone();
    public Mathematics() {
    }

    public Mathematics(Clock clock) {
        this.clock = clock;
    }

    public LocalDateTime getCurrentDate(){
        return LocalDateTime.now(clock);
    }

    public static Integer sum(Integer a, Integer b){
        return a + b;
    }
}
