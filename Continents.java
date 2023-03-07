/*
* Program that will print out a continent and the largest city of that continent
*/
public class Continents
{
  int continent;
  public Continents(int selection)
  {
    continent = selection;
  }
  public static void main(String[] args)
  {
    Continents cont = new Continents(4);
    cont.checkContinent();
  }
  public void checkContinent()
  {
    switch(continent)
    {
      case 1:
      System.out.println("North America: Mexico City, Mexico.");
      break;
      case 2:
      System.out.println("South America: Sao Paulo, Brazil.");
      break;
      case 3:
      System.out.println("Europe: Moscow, Russia.");
      break;
      case 4:
      System.out.println("Africa: Lagos, Nigeria.");
      break;
      case 5:
      System.out.println("Asia: Shangai, China.");
      break;
      case 6:
      System.out.println("Australia: Sydney, Australia.");
      break;
      case 7:
      System.out.println("Antartica: McMurdo Station, US");
      break;
      default:
      System.out.println("Undefined continent!");
      break;
    }
  }
}