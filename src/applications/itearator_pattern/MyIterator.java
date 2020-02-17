package applications.itearator_pattern;

import java.util.Collection;
import java.util.Iterator;

public interface MyIterator<T> extends Collection<T> {

    Iterator<T> iterator();
}
