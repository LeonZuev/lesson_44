package homework_43;
/*
"Многоквартирный дом" - наследники класса "Дом".
При создании многоквартирного дома дополнительно принимайте в конструкторе целое число - количество подъездов.
В методе toString() выводите в удобном виде всю известную информацию о доме.
В основном файле программы создайте список домов, в который поместите два частных дома и один многоквартирный.
Выведите информацию о домах в списке с использованием цикла for-each.

 */

public class Apartments extends House {
  private int entrances;

  public Apartments(String address, int entrances) {
    super(address);
    this.entrances = entrances;
  }

  public int getEntrances() {
    return entrances;
  }
}
