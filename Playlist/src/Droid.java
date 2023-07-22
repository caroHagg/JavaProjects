public class Droid {
  String name;
  int batteryLevel;

  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }

  public void performTask(String task){
    System.out.println(name+" is performing task: "+task);
    batteryLevel -= 10;
  }
  public int energyReport(){
    return batteryLevel;
  }

  public void energyTransfer(int newBattery){
    batteryLevel = newBattery;
  }
  public String toString(){
    return "Hello, I’m the droid: " + name;
  }
  public static void main(String[] args){
    Droid newDroid = new Droid("Codey");
    Droid secondDroid = new Droid("Pera");
    System.out.println(newDroid);
    newDroid.performTask("running");
    System.out.println(newDroid.energyReport());
    System.out.println(secondDroid);
    secondDroid.performTask("jumping");
    secondDroid.performTask("dancing");
    System.out.println(secondDroid.energyReport());
    secondDroid.energyTransfer(newDroid.energyReport());
    System.out.println(secondDroid);
    System.out.println(secondDroid.energyReport());
    System.out.println(newDroid.energyReport());



  }
}