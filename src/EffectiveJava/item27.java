package EffectiveJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class item27 {
    public static void main(String[] args) {
        Set<String> exaltation = new HashSet();
//        Set<String> exaltation= new HashSet<>();
//        System.out.println(exaltation);

        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");

        System.out.println(stringList.size());
        String[] stringArray = stringList.toArray(new String[stringList.size()]);
        System.out.println(stringArray.length);
        System.out.println(stringArray[2]);
    }

    int size = 10;
    String elements[] = {"1", "2", "3"};

    public <T> T[] toArray(T[] a) {
        if (a.length < size)
            return (T[]) Arrays.copyOf(elements, size, a.getClass());
        System.arraycopy(elements, 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }

    public <T> T[] toArray2(T[] a) {
        if (a.length < size) {
            @SuppressWarnings("unchecked")
            T[] result = (T[]) Arrays.copyOf(elements, size, a.getClass());
            return result;
        }
        System.arraycopy(elements, 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }
}
