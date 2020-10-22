class MethodSynchronized {
  private static MethodSynchronized instance;
  
  private MethodSynchronized(){}

  public static MethodSynchronized getInstance() {
    if(instance == null) {
      synchronized (MethodSynchronized.class) {
        if(instance == null) 
          instance = new MethodSynchronized();
      }
    }
    return instance;
  }
}