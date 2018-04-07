package conversions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BinaryToHexa {
    public static void main(String[] args) {
        System.out.println(binaryToHexa("111111"));
    }

    public static String binaryToHexa(String binary) {
      List<String> lists = split(binary, 4);
      return lists.stream()
              .map(e -> String.valueOf(BinaryToDecimal.binaryToDecimal(e)))
              .map(e -> {
                  if (e.equals("10")) return "A";
                  else if (e.equals("11")) return "B";
                  else if (e.equals("12")) return "C";
                  else if (e.equals("13")) return "D";
                  else if (e.equals("14")) return "E";
                  else if (e.equals("15")) return "F";
                  else return e;
              }).collect(Collectors.joining(""));
    };

    public static List<String> split(String origin, int sizeEle) {
        List lists = new ArrayList();
        int length = origin.length();
        int end = length;
        int start = length;
        while(start > 0) {
            start = (end - sizeEle) > 0 ? end - sizeEle : 0;
            lists.add(0, origin.substring(start, end));
            end = start;
        }

        return lists;
    }
 }
