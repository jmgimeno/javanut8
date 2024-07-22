package javanut8.ch04.mygenerics;

import java.util.Comparator;

public class ContainerComparator<E extends Comparable<? super E>>
        implements Comparator<Container<E>> {

    @Override
    public int compare(Container<E> c1, Container<E> c2) {
        if (c1.isEmpty())
            return c2.isEmpty() ? 0 : -1;
        else if (c2.isEmpty()) // !c1.isEmpty()
            return 1;
        else
            return c1.get().compareTo(c2.get());
    }
}
