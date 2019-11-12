package crackingcodinginterview.binary;

public class Main {

  public static void main(String[] args) {
    System.out.println(getBit(4, 2));
    System.out.println(setBit(4, 3));
    System.out.println(clearBit(12, 3));
    System.out.println(updateBit(12, 3, true));
  }

  public static boolean getBit(int num, int i) {
    return (num & (1 << i)) != 0;
  }

  public static int setBit(int num, int i) {
    return (num | (1 << i));
  }

  public static int clearBit(int num, int i) {
    int mask = (1 << i);
    return num & mask;
  }

  public static int updateBit(int num, int i, boolean bitIs1) {
    int value = bitIs1 ? 1 : 0;
    int mask = ~(1 << i);
    return (num & mask) | (value << i);
  }

}
