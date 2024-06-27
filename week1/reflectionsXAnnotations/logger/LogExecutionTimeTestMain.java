package week1.reflectionsXAnnotations.logger;

public class LogExecutionTimeTestMain {

  public static void main(String[] args) throws InterruptedException {
    LogInterfaceClass logInterfaceClass = new LogInterfaceClass();

    // creating the proxy for the close to add logger invocations
    LogInterfaceClass proxy = ProxyFactory.createProxy(logInterfaceClass, LogInterfaceClass.class);

    proxy.tryLogger();
  }

}
