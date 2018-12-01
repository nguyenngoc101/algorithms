package interview.hashtable;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
  private Map<Integer, BigInteger> memoizeHashMap = new HashMap<>();

  {
    memoizeHashMap.put(0, BigInteger.ZERO);
    memoizeHashMap.put(1, BigInteger.ONE);
    memoizeHashMap.put(2, BigInteger.ONE);
  }

  private BigInteger fibonacci_java6(int n) {
    if (memoizeHashMap.containsKey(n)) {
      return memoizeHashMap.get(n);
    } else {
      BigInteger result = fibonacci(n - 1).add(fibonacci(n - 2));
      memoizeHashMap.put(n, result);
      return result;
    }
  }

  /**
   * Same as fibonacci_java6
   * @param n
   * @return
   */
  private BigInteger fibonacci(int n) {
    return memoizeHashMap.computeIfAbsent(n,
        (key) -> fibonacci(n - 1).add(fibonacci(n - 2)));
  }

  public static void main(String[] args) {
    Fibonacci fibonacci = new Fibonacci();
    for (int i = 0; i < 100; i++) {
      System.out.println(fibonacci.fibonacci(i));
    }
  }
}
