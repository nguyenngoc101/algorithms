import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

  public static void main1(String args[]) throws IOException {
    String str = "Helloword ";
    File yourFile = new File("/Users/apple/Downloads/test.txt");
    yourFile.createNewFile();
    FileOutputStream outputStream = new FileOutputStream(yourFile);
    byte[] strToBytes = str.getBytes();
    long fileSize = strToBytes.length;
    long mb50 = 5 * 1024 * 1024;
    int count = 0;
    System.out.println("Start write file");
    while (count <= mb50) {
      outputStream.write(strToBytes);
      count++;
    }
//    while(fileSize <= mb50) {
//      fileSize += strToBytes.length;
////      System.out.println("Current Length(MB): "+fileSize/(1024 * 1024));
//    }

    System.out.println("Total Length(MB): "+fileSize/(1024 * 1024));
    System.out.println("End write file");

    outputStream.close();
  }
}
