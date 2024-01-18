package postFixPD;

import java.util.EmptyStackException;

public class LinkedStack<E> implements StackUsed<E> {

	private SinglyLinkedList<E> SinglyLinkedList;
	public LinkedStack() {
		SinglyLinkedList = new SinglyLinkedList<E>();
	}
	public int size() {
		return SinglyLinkedList.size(); 
	}
	public boolean isEmpty() {
		return SinglyLinkedList.isEmpty();
	}

	public void push(E element) {
		SinglyLinkedList.addFirst (element);
	}

	public E top() {
		if(isEmpty()) {
			throw new EmptyStackException();
		
		}
		return SinglyLinkedList.first();
	}

	public E pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		
		}
		return SinglyLinkedList.removeFirst();
	}

}
