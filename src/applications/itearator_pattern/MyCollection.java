package applications.itearator_pattern;

import java.util.Iterator;

public interface MyCollection<T> extends Iterable<T> {

    Iterator<T> iterator();
}
