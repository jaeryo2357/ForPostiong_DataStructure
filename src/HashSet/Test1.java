package HashSet;

import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;


public class Test1 {

    public static void main(String[] args)
    {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Test1");
        hashSet.add("Test2");
        hashSet.add("Test3");

        System.out.println("First Output:"+Arrays.toString(hashSet.toArray()));

        hashSet.add("Test2");

        System.out.println("Second Output:");

        for (String s : hashSet) {
            System.out.print(s);
        }
    }
}
