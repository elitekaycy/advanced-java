package week1.reflectionsXAnnotations.logger;

public interface LogInterface {
  @LogExecutionTime
  void tryLogger() throws InterruptedException;
}
