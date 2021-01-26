package Collection;

import java.util.Iterator;

public interface Collection<E>
{
    boolean add(E element);
    Iterator<E> iterator();
}