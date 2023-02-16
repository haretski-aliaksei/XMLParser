package collections;

import exceptions.EmptyQueueException;
import org.testng.annotations.Test;
import utilities.*;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class ExpectedExceptionTests {

    @Test(expectedExceptions = EmptyStackException.class)
    public void testExpectedExceptionsMyStackPop() {
        MyStack<String> stack = new MyStack<>();
        stack.pop();
    }

    @Test(expectedExceptions = EmptyStackException.class)
    public void testExpectedExceptionsMyStackPeek() {
        MyStack<String> stack = new MyStack<>();
        stack.peek();
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testExpectedExceptionsMyStackContains() {
        MyStack<String> stack = new MyStack<>();
        stack.contains(null);
    }

    @Test(expectedExceptions = NoSuchElementException.class)
    public void testExpectedExceptionsMyStackNext() {
        MyStack<String> stack = new MyStack<>();
        Iterator<String> iterator = stack.iterator();
        iterator.next();
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testExpectedExceptionsMyStackToArray() {
        MyStack<String> stack = new MyStack<>();
        stack.toArray(null);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testExpectedExceptionsMyStackPush() {
        MyStack<String> stack = new MyStack<>();
        stack.push(null);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testExpectedExceptionsMyQueueEnqueue() {
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue(null);
    }

    @Test(expectedExceptions = EmptyQueueException.class)
    public void testExpectedExceptionsMyQueueDequeue() {
        MyQueue<String> queue = new MyQueue<>();
        queue.dequeue();
    }

    @Test(expectedExceptions = EmptyQueueException.class)
    public void testExpectedExceptionsMyQueuePeek() {
        MyQueue<String> queue = new MyQueue<>();
        queue.peek();
    }

    @Test(expectedExceptions = NoSuchElementException.class)
    public void testExpectedExceptionsMyQueueNext() {
        MyQueue<String> queue = new MyQueue<>();
        Iterator<String> iterator = queue.iterator();
        iterator.next();
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testExpectedExceptionsMyQueueToArray() {
        MyQueue<String> queue = new MyQueue<>();
        queue.toArray(null);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testExpectedExceptionsMyDLLToArray() {
        MyDLL<String> dll = new MyDLL<>();
        dll.toArray(null);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testExpectedExceptionsMyDLLContains() {
        MyDLL<String> dll = new MyDLL<>();
        dll.contains(null);
    }

    @Test(expectedExceptions = NoSuchElementException.class)
    public void testExpectedExceptionsMyDLLNext() {
        MyDLL<String> dll = new MyDLL<>();
        Iterator<String> iterator = dll.iterator();
        iterator.next();
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testExpectedExceptionsMyDLLAdd() {
        MyDLL<String> dll = new MyDLL<>();
        dll.add(null);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testExpectedExceptionsMyDLLAddAll() {
        MyDLL<String> dll = new MyDLL<>();
        dll.addAll(null);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testExpectedExceptionsMyDLLRemove() {
        MyDLL<String> dll = new MyDLL<>();
        dll.remove(null);
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testExpectedExceptionsMyDLLAdd2() {
        MyDLL<String> dll = new MyDLL<>();
        dll.add(1, "");
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testExpectedExceptionsMyDLLGet() {
        MyDLL<String> dll = new MyDLL<>();
        dll.get(-1);
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testExpectedExceptionsMyDLLSet() {
        MyDLL<String> dll = new MyDLL<>();
        dll.set(-1, "");
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testExpectedExceptionsMyDLLSet2() {
        MyDLL<String> dll = new MyDLL<>();
        dll.set(1, null);
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testExpectedExceptionsMyArrayListAdd() {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1, null);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testExpectedExceptionsMyArrayListAddAll() {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.addAll(null);
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testExpectedExceptionsMyArrayListGet() {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.get(-1);
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testExpectedExceptionsMyArrayListRemove() {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.remove(-1);
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testExpectedExceptionsMyArrayListSet() {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.set(-1, null);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testExpectedExceptionsMyArrayListToArray() {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.toArray(null);
    }

    @Test(expectedExceptions = NoSuchElementException.class)
    public void testExpectedExceptionsMyArrayListNext() {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        Iterator<Integer> iterator = arrayList.iterator();
        iterator.next();
    }
}
