package communications;
// pager реализует интерфейс "отправитель сообщений"

public class Pager implements Messenger {
  private String address;

  @Override
  public void sendMessage(String message,String address) {
    // аргумент метода address "закрыл" собой атрибут this.address
    System.out.println("Pager: u sent message '" + message + "' to address" + address);
  }
}
