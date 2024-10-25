import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length of rectangle 1: ");
    double length1 = sc.nextDouble();
    System.out.println("Enter length of rectangle 2: ");
    double length2 = sc.nextDouble();
    System.out.println("Enter width of rectangle 1: ");
    double width1 = sc.nextDouble();
    System.out.println("Enter width of rectangle 2: ");
    double width2 = sc.nextDouble();

    Rectangle rec1 = new Rectangle(length1, width1);
    Rectangle rec2 = new Rectangle(length2, width2);

    boolean isRotated = (rec1.getLength() == rec2.getWidth() && rec1.getWidth() == rec2.getLength());
    boolean isCongruent = isRotated || rec1.equals(rec2);
    boolean isSimilar = isCongruent || ((rec1.getLength()/rec2.getLength()) == (rec1.getWidth()/rec2.getWidth()));

    System.out.println(isRotated);
    System.out.println(isCongruent);
    System.out.println(isSimilar);
  }
}
