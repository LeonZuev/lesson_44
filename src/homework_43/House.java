package homework_43;
/*
Создайте абстрактный класс "Дом".
+В качестве аргумента конструктора принимайте адрес.
+Напишите для адреса сеттер и геттер.
 */

public abstract class House {
  private String address; // строка(удалил 'private')
  public House(String address) { // конструктор
    this.address = address;
  }
  public void setAddress(String address) { // сеттер принимает аргумент адрес
    this.address = address;
  }
  public String getAddress() { // геттер
    return address;
  }

  @Override
  public String toString() {
    return "Дом по адресу " + address;
  }
  // добавить виртуальный метод "снести"
  public abstract void destroy();
}
