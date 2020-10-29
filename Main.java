/*
Properties
	• Creational design pattern
	• Only one instance of the class should exist
	• Other classes should be able to get Instance of Singleton class
	• Used in Logging, cache, session and drivers


Implementation
	• Constructor should be private
	• Public method for returning instance
	• Instance Type - private static
*/

class Main {

  public static void main(String[] args) {
    // eagerInitialization();
    // lazyInitialization();
    // synchronizedInitialization();
    methodSynchronizedInitialization();
  }


  private static void eagerInitialization() {
    Eager instance = Eager.getInstance();
    System.out.println(instance);

    Eager instance1 = Eager.getInstance();
    System.out.println(instance1);
  }

  private static void lazyInitialization() {
    Lazy instance = Lazy.getInstance();
    System.out.println(instance);

    Lazy instance1 = Lazy.getInstance();
    System.out.println(instance1);
  }

  private static void synchronizedInitialization() {
    Synchronized instance = Synchronized.getInstance();
    System.out.println(instance);

    Synchronized instance1 = Synchronized.getInstance();
    System.out.println(instance1);
  }

  private static void methodSynchronizedInitialization() {
    MethodSynchronized instance = MethodSynchronized.getInstance();
    System.out.println(instance);

    MethodSynchronized instance1 = MethodSynchronized.getInstance();
    System.out.println(instance1);
  }
  
}