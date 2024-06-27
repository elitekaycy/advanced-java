package week1.reflectionsXAnnotations.logger;

public class LogInterfaceClass implements LogInterface {

  public LogInterfaceClass() {
  }

  @Override
  @LogExecutionTime
  public void tryLogger() throws InterruptedException {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
    System.out.println("Service method executed");
  }

}
