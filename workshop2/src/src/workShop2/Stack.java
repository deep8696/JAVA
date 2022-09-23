/*
 * 	Student name: Deepkumar Rajendrakumar Patel
	Student Email: drpatel33@myseneca.ca
	Student number: 153693189
	Section: ZAA
 * */
package workShop2;

public class Stack {
	private int top;
	char[] array;
	
	// size of array
	public Stack(int size) {
		array = new char[size];
	}
	
	// 	push into array
	public void push(char c) {
		array[top++] = c;
	}
	
	// remove from array	
	public char pop() {
		return array[--top];
	}
}
