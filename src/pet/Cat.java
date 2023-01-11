package ru.gb.pet;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Cat {

    LocalDate birthday; // дата рождения
    Порода порода;
    Sex sex; // пол
    PetOwner owner; // хозяин

    int getAge() {
        LocalDate now = LocalDate.now();
        return (int) ChronoUnit.YEARS.between(now, birthday);
    }




}
