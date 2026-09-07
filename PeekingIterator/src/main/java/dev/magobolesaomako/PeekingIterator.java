package dev.magobolesaomako;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

@Component
public class PeekingIterator<T> implements Iterator<T>{
    private Iterator<T> iterator;
    private T nextElement;

    // Setter method for injecting the Iterator after PeekingIterator is autowired
    public void setIterator(Iterator<T> iterator){
        this.iterator = iterator;
        if (iterator.hasNext()) {
            nextElement = iterator.next();
        }
    }

    public T peek() {
        return nextElement;
    }

    //Override next method to advance the iterator
    @Override
    public T next() {
        T current = nextElement;
        nextElement = iterator.hasNext() ? iterator.next() : null;
        return current;
    }

    @Override
    public boolean hasNext(){
        return nextElement != null;
    }
}
