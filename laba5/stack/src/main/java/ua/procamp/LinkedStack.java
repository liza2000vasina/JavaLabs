package ua.procamp;


import ua.procamp.exception.EmptyStackException;

public class LinkedStack<T> implements Stack<T> {

	private Node<T> head;
	private int size = 0;

	@Override
	public void push(T element) { //Adds an element to the begining of the stack.

		Node<T> newNode = Node.getElement(element);

		if (head != null) {
			newNode.next = head;
		}
		head = newNode;
		size++;
	}

	@Override
	public T pop() { //Retrieves and removes stack head.
		if (head != null) {
			size--;
			return findHeadElement();
		} else {
			throw new EmptyStackException();
		}
	}

	private T findHeadElement() { // return head element
		T element = head.element;
		this.head = head.next;
		return element;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	private static class Node<T> {

		T element;
		Node<T> next;

		static <T> Node<T> getElement(T element) {
			return new Node<>(element);
		}

		Node(T element) {
			this.element = element;
		}
	}
}