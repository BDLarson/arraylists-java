/**
 * A test class for exercising our new UhArrayList.
 */
import uhCollection.UhArrayList;
import uhLogger.Jog;
import uhLogger.ConsoleLogger;
import uhLogger.Level;


/**
 * @author Mark Nelson
 *
 */
final class Assignment03 {

  /**
   * Private constructor for a utility class.
   */
  private Assignment03() {
  }
  
  
  /**
   * Executable entry point.
   * 
   * @param args Unused.
   */
  public static void main(final String[] args) {
    Jog.setLogger(new ConsoleLogger());
    Jog.enableLevel(Level.INFO);
    Jog.enableLevel(Level.DEBUG);
    Jog.enableLevel(Level.ERROR);
    
    Jog.info("Begin Assignment03");
    
    UhArrayList myArrayList = new UhArrayList();
    
   // Jog.info("Capacity of myArrayList = [" + myArrayList.capacity() + "]");
    Jog.info("Size of myArrayList = [" + myArrayList.size() + "]");
    
    myArrayList.add("Alpha");
    myArrayList.add("Charlie");
    myArrayList.add("Echo");
    myArrayList.add("Golf");

    myArrayList.toArray();
    
    myArrayList.add(-1, "Fail");
    myArrayList.add(-10, "Epic fail");
    myArrayList.add(-100, "Epic fail on a grand scale");
    
    myArrayList.add(100, "Can't put stuff here either");
    
    // The array capacity should increase at this point
    myArrayList.add("India");
  
    myArrayList.add(1, "Bravo");
    myArrayList.add(5, "Hotel");
    myArrayList.add(3, "Delta");
    myArrayList.add(5, "Foxtrot");

    for (int i = 0; i < myArrayList.size(); i++) {
      System.out.println(myArrayList.get(i));
    }
    myArrayList.get(100);
    myArrayList.get(-100);

    myArrayList.remove(100);
    myArrayList.remove(-100);
   

    //System.out.println("Removing Items");
    myArrayList.remove(0);
    myArrayList.remove(2);
    myArrayList.remove(4);
    myArrayList.remove(5);

    for (int i = 0; i < myArrayList.size(); i++) {
      System.out.println(myArrayList.get(i));
    }

    myArrayList.remove(0);
    myArrayList.remove(0);
    myArrayList.remove(0);

    // Do some bounds checks on the the get() method as well
    for (int i = -1; i < myArrayList.size()+1; i++) {
      System.out.println(myArrayList.get(i));
    }

    myArrayList.remove(0);
    myArrayList.remove(0);

    myArrayList.remove(0);  // Should print that the list is empty
    
    Jog.info("Exit Assignment03 normally");
  }

}
