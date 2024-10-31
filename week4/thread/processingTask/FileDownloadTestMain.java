package week4.thread.processingTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FileDownloadTestMain {

  public static void main(String[] args) {

  ExecutorService executorService = Executors.newFixedThreadPool(3);
  List<String> urls = Arrays.asList(
    "https://domainstart.com/file2.jpg",
    "https://domainstart.com/file1.jpg",
    "https://domainstart.com/file4.jpg"
  );
 
  List<Future<String>> downloads = new ArrayList<>();
 
  for(String uri : urls) {
    String filePath = uri.split("/")[uri.split("/").length -1];
     downloads.add(executorService.submit(new DownloadTask(uri, filePath)));
  }

  for(Future<String> download : downloads) {
    try {
        System.out.println(download.get());
    }catch(InterruptedException | ExecutionException e) {
      System.err.println("Download failed: " + e.getMessage());
    }
  }

    executorService.shutdown();

  }
}

