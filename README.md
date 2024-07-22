# USACO

Some solutions for USACO problems.

## Compilation in Java

In Java, class names correspond to file names. So if you are working on a project
with a class `Main` that looks like this:

```java
public class Main {
    public static void main (String[] args) {
        ...
    }
}
```

You will compile like this:

```sh
javac Main.java
```

To run the program, you run:

```sh
java Main
```

## Example with `BufferedReader`, `PrintWriter`, and `StringTokenizer`

### BufferedReader

```java
public class Example {
    public static void main (String[] args) {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    }
}
```

In the example above, `BufferedReader` is used to read text from the input 
stream *efficiently*, while `InputStreamReader` accepts bytes from `System.in` 
and turns them to text characters that `BufferedReader` can read.


### StringTokenizer

```java
import java.util.StringTokenizer

public class Example {
    public static void main (String[] args) {
        String str = "This is a test string.";
        StringTokenizer st = new StringTokenizer(str, " ");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}

```