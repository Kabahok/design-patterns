package behavioral_pattern;

import java.util.Iterator;

public class IntIterator implements Iterator<Integer> {

    protected Randoms randoms;

    public IntIterator(Randoms randoms) {
        this.randoms = randoms;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return randoms.random.nextInt(randoms.max - randoms.min + 1) + randoms.min;
    }
}
