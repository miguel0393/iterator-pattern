package applications.itearator_pattern;

import java.util.Iterator;

public interface MyIterator<T> extends Iterable<T> {

    Iterator<T> iterator();
}
