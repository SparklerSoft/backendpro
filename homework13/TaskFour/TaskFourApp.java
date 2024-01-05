package com.proftelran.org.homework13.TaskFour;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskFourApp {

    public static void main(String[] args) {
        List<Auto> autos = new ArrayList<>();

        autos.add(new Auto("WD3457FA2", "RED", "TOYOTA", 32450, 42300));
        autos.add(new Auto("56RT-DS", "WHITE", "FIAT", 19333, 12350));
        autos.add(new Auto("3485 DA91", "BLACK", "FORD", 0, 19992));
        autos.add(new Auto("JDJNX4", "BLUE", "SEAT", 54334, 10832));
        autos.add(new Auto("SGEUDH", "BLACK", "BUICK", 0, 18021));
        autos.add(new Auto("KFIR89", "GREY", "OPEL", 23400, 16943));
        autos.add(new Auto("KEFIR", "BLACK", "MERCEDES", 4995432, 34050));
        autos.add(new Auto("MILK93", "CIAN", "DATSUN", 5843, 18422));
        autos.add(new Auto("KILLER", "YELLOW", "CHEVROLET", 34521, 33211));
        autos.add(new Auto("JJYE", "PINK", "OPEL", 45222, 49000));

        System.out.println("List of the black cars with mileage = 0 " + autos.stream().filter(auto -> auto.getColor().
                equalsIgnoreCase("black") && auto.getMileage()
                == 0).collect(Collectors.toList()));

        System.out.println("Unique brands car with price from 30'000 to 50'000 - " + autos.stream().filter(auto -> auto.
                getPrice() >= 30000 && auto.getPrice() <= 50000).map(Auto::getBrand).distinct().count());
    }
}
