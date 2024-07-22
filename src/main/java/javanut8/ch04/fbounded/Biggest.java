package javanut8.ch04.fbounded;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Biggest {

    public static <E extends Comparable<? super E>> E biggest(Collection<E> elements) {
        if (elements.isEmpty())
            throw new NoSuchElementException("collection is empty");
        Iterator<E> it = elements.iterator();
        E biggestSoFar = it.next(); // cannot fail
        while (it.hasNext()) {
            E current = it.next();
            if (current.compareTo(biggestSoFar) > 0)
                biggestSoFar = current;
        }
        return biggestSoFar;
    }
}
