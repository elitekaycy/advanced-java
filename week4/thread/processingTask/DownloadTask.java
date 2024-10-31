
package week4.thread.processingTask;

import java.util.concurrent.Callable;

public class DownloadTask implements Callable<String> {
  private final String url;

  public DownloadTask(String url, String filePath) {
    this.url = url;
  }
 
  @Override
  public String call() throws Exception {
    System.out.println("Downloading from " + url);
    Thread.sleep(1000);
    return "Downloaded -" + url;
  }
 
}
