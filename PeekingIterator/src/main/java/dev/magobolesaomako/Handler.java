package dev.magobolesaomako;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;

@Component
public class Handler {

    @Autowired
    private PeekingIterator<Integer> peekingIterator;

    @Autowired
    private InputService inputService;

    public void handleInputAndOutput() {
        List<Integer> userList = inputService.collectInput();
        Iterator<Integer> iterator = userList.iterator();

        peekingIterator.setIterator(iterator);

        System.out.println("Peeking Iteraor functionality");

        while (peekingIterator.hasNext()){
            System.out.println("Peek: " + peekingIterator.peek());
            System.out.println("Next: " + peekingIterator.next());
        }
    }

}
