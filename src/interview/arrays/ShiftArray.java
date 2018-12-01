package interview.arrays;

public class ShiftArray {
  public static void main(String[] args) {
    int origin[] = {1, 2, 3, 4, 5};
    int deleted[] = {4, 5, 7, 9};
    int curValue = 3;
    System.out.println(getNext(curValue, origin, deleted));
  }

  public static int[] shiftArray(int[] a, int t) {
    int length = a.length;
    int[] b = new int[length];
    for (int i = 0; i < length; i++) {
      b[(i + t) % length] = a[i];
    }
    return b;
  }

  public static int getNext(int curValue, int[] origin, int[] deletedValues) {
    boolean found = false;
    int nextValue = getNextValue(curValue, origin);

    while (!found) {
      if (exists(nextValue, deletedValues)) {
        nextValue = getNextValue(nextValue, origin);
      } else {
        found = true;
      }
    }
    return nextValue;
  }

  public static int getNextValue(int curValue, int[] origin) {
    for (int i = 0; i < origin.length; i++) {
      if (curValue == origin[i]) {
        if (i == origin.length-1) return origin[0];
        else return origin[i + 1];
      }
    }
    return -999;
  }

  public static boolean exists(int value, int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == value) return true;
    }
    return false;
  }
}
