// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) 
  {
    System.out.println("Podaj 3 liczby a,b oraz c");
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    System.out.println("Podales liczby: " + a + ", " + b + ", " + c);
    System.out.println("Największa z podanych liczb to: " + max(a,b,c));
  }
  public static int max(int a,int b,int c)
  {
    return Math.max(Math.max(a,b),c);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}