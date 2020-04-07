import java.util.Optional;

public class LispParenChecker {

  private static final char OPEN_PAREN = '(';
  private static final char CLOSE_PAREN = ')';

  public static void main(String[] args) {
    String lispCode = Optional.ofNullable(args[0]).orElse("");

    int counter = 0;

    for (char c: lispCode.toCharArray()) {
      if (c == OPEN_PAREN) {
        counter++;
      } else if (c == CLOSE_PAREN) {
        counter--;
      } else {
        // Do nothing for other characters
      }
    }

    System.out.println(counter == 0);
  }
}
