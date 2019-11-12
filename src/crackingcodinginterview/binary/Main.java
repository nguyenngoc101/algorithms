package crackingcodinginterview.binary;

public class Main {

  public static void main(String[] args) {
    System.out.println(getBit(4, 2));
    System.out.println(setBit(4, 3));
    System.out.println(clearBit(12, 3));
    System.out.println(updateBit(12, 3, true));
  }

  // This method shifts 1 over by i bits, creating a value that looks like 00010000.
  // By performing an AND with num, we clear all bits other than the bit at bit i.
  // Finally, we compare that to 0. If that new value is not zero, then bit i must have a 1.
  // Otherwise, biti is a 0.
  public static boolean getBit(int num, int i) {
    return (num & (1 << i)) != 0;
  }

  // Set Bit shifts 1 over byi bits, creating a value like 00010000.
  // By performing an OR with num, only the value at bit i will change.
  // All other bits of the mask are zero and will not affect num
  public static int setBit(int num, int i) {
    return (num | (1 << i));
  }

  // This method operates in almost the reverse of setBit.
  // First, we create a number like 11101111 by creating the reverse of it (00010000) and negating it.
  // Then, we perform an AND with num.
  // This will clear the ith bit and leave the remainder unchanged.
  public static int clearBit(int num, int i) {
    int mask = (1 << i);
    return num & mask;
  }

  //To set the ith bit to a valuev, we first clear the bit at position i by using a mask that looks like 11101111.
  // Then, we shift the intended value,v, left by i bits.
  // This will create a number with bit i equal tov and all other bits equal to 0.
  // Finally, we OR these two numbers, updating the ith bit ifv is 1 and leaving it as 0 otherwise.
  public static int updateBit(int num, int i, boolean bitIs1) {
    int value = bitIs1 ? 1 : 0;
    int mask = ~(1 << i);
    return (num & mask) | (value << i);
  }

}
