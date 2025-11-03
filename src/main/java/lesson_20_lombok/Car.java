package lesson_20_lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@ToString
@Getter
@Setter
public class Car {

    public double zapovnenistBaka;

    public double vytrataNa100km;
    public LocalDate rikTuv;


    public Car(double zapovnenistBaka, double vytrataNa100km, LocalDate rikTuv) {
        this.zapovnenistBaka = zapovnenistBaka;
        this.vytrataNa100km = vytrataNa100km;
        this.rikTuv = rikTuv;
    }

    public boolean canDrive() {
        return vytrataNa100km > 0;
    }

    public boolean isAllowedToDrive() {
        return LocalDate.now().isBefore(rikTuv) || LocalDate.now().isEqual(rikTuv);

    }

    public double maxDistance() {
        return (vytrataNa100km / zapovnenistBaka) * 100;
    }
}


