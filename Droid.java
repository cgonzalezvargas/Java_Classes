public class Droid
{
  String name;
  int batteryLevel;
  String task;

  public static void main(String[] args)
  {
    Droid Codey = new Droid("chupapi");
    Codey.behavior();
    System.out.println(Codey.toString());
    Codey.performTask("mojito");
    System.out.println(Codey.batteryLevel);
  }
  public Droid(String droidName)
  {
    name = droidName;
    batteryLevel = 100;
    task =" ";
    System.out.println(batteryLevel);
  }
  public void behavior()
  {
    System.out.println("Droid " + name + " is performing task " + task);
    System.out.println("Droid battery level %"+batteryLevel);
  }
  public void performTask(String task)
  {
    System.out.println(name + " is performing task: " + task);
    batteryLevel = batteryLevel - 10;
  }
  public String toString()
  {
    return "Hello, I'm the droid: " + name;
  }
}