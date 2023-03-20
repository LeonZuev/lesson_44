package quest;

// что-то,что умеет волшебство
public interface Wizard {

  public abstract int getMana();
  public abstract void tryCharm(String charmName);// попытка юзать заклинание
  public abstract void levelUp(); // поднять уровень волшебной силы
}
