# Java解惑
## 大问题(不存在，可以正常使用)
```java
public class BigProblem {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("5000");
        BigInteger b = new BigInteger("1000");
        BigInteger c = BigInteger.ZERO;
        c = c.add(a);
        c = c.add(b);
        System.out.println(c);
    }

}
```
### 结果（6000）已经可以正常输出
### 以前说明
String、BigDecimal、Integer、Integer、Long、Short、Byte、Character、Boolean、Double都是不可变。我们不能修改它们的值，对这些类型的操作将返回新的实例
## 差是什么
```java
public class Difference {
    public static void main(String[] args) {
        int a = 012;
        int b = 10;
        System.out.println(a-b);
    }
}
```
### 分析
以0开头的整形常亮将被解释为八进制数值
### 建议
千万不要在一个整型常量前面加一个0，这会使它变成一个八进制常量
## 日期游戏
```java
public class DatingGame {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(1999,12,31);
        System.out.println(cal.get(Calendar.YEAR));
    }
}
```
### 分析
Date将一月表示为0，而Calendar延续了这个错误
### 建议
在使用Calendar或Date的时候一定要当心，千万要记得查阅API文档
## Math.abs方法
```java
public class Abs {
    public static void main(String[] args) {
        int i = Math.abs(Integer.MIN_VALUE);
        System.out.println(i);
    }
}
```
### 分析
Math.abs不一定能保证一定返回非负的结果。如果他的参数是Integer.MIN_VALUE或者Long.Min_VALUE
