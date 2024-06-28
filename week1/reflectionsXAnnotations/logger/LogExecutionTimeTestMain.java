package week1.reflectionsXAnnotations.logger;

public class LogExecutionTimeTestMain {

  public static void main(String[] args) throws InterruptedException {
    LogInterface logInterfaceClass = new LogInterfaceClass();

    // creating the proxy for the close to add logger invocations
    LogInterface proxy = ProxyFactory.createProxy(logInterfaceClass,
        LogInterface.class);

    proxy.tryLogger();
    System.out.println("test");
  }

}
