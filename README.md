# class15-02
## katatask1
[Task link](https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097)    
My solution
```java
public class Solution {
    public static int century(int number) {
        if ((number % 100) == 0) {
            return number / 100;
        }
        return 1 + number / 100;
    }
}
```
My fav solution
```java
public class Solution {
  public static int century(int number) {
    return (number + 99) / 100;
  }
}
```

## katatask2
[Task link](https://www.codewars.com/kata/59a8570b570190d313000037/)    
My solution
```java
public class Solution {
    public static long sumCubes(long n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i * i * i;
        }
        return sum;
    }
}
```
My fav solution
```java
interface Solution {
  static long sumCubes(long n) {
    return (n + n * n) * (n + n * n) / 4;
  }
}
```
