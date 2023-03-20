package communications;

public class CommunicationsRunner {

  public static void main(String[] args) {
    Pager testPager = new Pager();
    testPager.sendMessage("test message", "somebody");
  }
}
