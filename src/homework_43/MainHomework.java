package homework_43;

import homework_43.Apartments;
import homework_43.House;
import homework_43.Mansion;

import java.util.ArrayList;
import java.util.List;

public class MainHomework {
  public static void main(String[] args) {

    List<House> houses = new ArrayList<>();
    houses.add(new Mansion("Строителей 1"));
    houses.add(new Mansion("Строителей 2"));
    houses.add(new Apartments("Программистов 3", 2));

    for(House house : houses) { //House - тип(из абстрактного), house - название переменной
      System.out.println(house);
    }
    for(int i = 0; i<houses.size(); ++i) { // for(House house : houses)
      houses.get(i).destroy();
    }
    for (House house : houses) {
      System.out.println(house);
    }
  }
}