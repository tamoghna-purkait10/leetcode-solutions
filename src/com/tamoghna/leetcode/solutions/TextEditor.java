package com.tamoghna.leetcode.solutions;

public class TextEditor {

	ListNodeDLL cursor;
	int leftLength;
	int rightLength;

	public TextEditor() {
		cursor = new ListNodeDLL("|");
	}

	public void addText(String text) {
		char[] chars = text.toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			
			ListNodeDLL newChar = new ListNodeDLL(String.valueOf(chars[i]));
			
			//insert at mid
			if (cursor != null &&  cursor.next != null) {
				newChar.next = cursor.next;
				cursor.next.prev = newChar;
				cursor.next = newChar;
				newChar.prev = cursor;
				cursor = cursor.next;
			}
			//insert at the end
			else {
				if (cursor != null){
                    cursor.next = newChar;
				    newChar.prev = cursor;
				    cursor = cursor.next;
                }
			}
			leftLength++;
		}
	}

	public int deleteText(int k) {
		int i = 0;
		while (cursor != null && Math.min(leftLength, k) > 0) {

			ListNodeDLL temp = cursor;

			// delete from end
			if (cursor != null && cursor.prev != null && cursor.next == null) {
				cursor = cursor.prev;
				cursor.next = null;
				temp.prev = null;
			}
			// delete from mid
			else if (cursor != null && cursor.prev != null && cursor.next != null) {
				cursor = cursor.prev;
				cursor.next = cursor.next.next;
				cursor.next.prev = cursor;
				temp.prev = null;
				temp.next = null;
			}

			k--;
			i++;
			leftLength--;
		}
		return i;
	}

	public String cursorLeft(int k) {
		StringBuilder sb = new StringBuilder();
		int min = 0;

		if (leftLength > 0 || k < leftLength) {
			int shiftMin = Math.min(k, leftLength);
			while (cursor != null && shiftMin > 0) {
				cursor = cursor.prev;
				leftLength--;
				rightLength++;
				shiftMin--;
			}
		}

		ListNodeDLL temp = cursor;
		min = Math.min(10, leftLength);
		while (temp != null && min > 0) {
			sb.append(temp.val);
			temp = temp.prev;
			min--;
		}

		return sb.reverse().toString();

	}

	public String cursorRight(int k) {
		StringBuilder sb = new StringBuilder();
		int min = 0;

		if (rightLength > 0 || k < rightLength) {
			int shiftMin = Math.min(k, rightLength);
			while (cursor != null && shiftMin > 0) {
				cursor = cursor.next;
				leftLength++;
				rightLength--;
				shiftMin--;
			}
		}

		ListNodeDLL temp = cursor;
		min = Math.min(10, leftLength);
		while (temp != null && min > 0) {
			sb.append(temp.val);
			temp = temp.prev;
			min--;
		}

		return sb.reverse().toString();

	}

	public static void main(String[] args) {

		TextEditor textEditor = new TextEditor();
		textEditor.addText("leetcode");
		System.out.println(textEditor.deleteText(4));
		textEditor.addText("practice");
		System.out.println(textEditor.cursorRight(3));
		System.out.println(textEditor.cursorLeft(8));
		System.out.println(textEditor.deleteText(10));
		System.out.println(textEditor.cursorLeft(2));
		System.out.println(textEditor.cursorRight(6));
		
		System.out.println("==================================================================");

		TextEditor textEditor1 = new TextEditor();
		textEditor1.addText("cyberworks");
		System.out.println(textEditor1.deleteText(21));
		System.out.println(textEditor1.cursorLeft(2));
		System.out.println(textEditor1.cursorRight(6));
		textEditor1.addText("aaaa");
		System.out.println(textEditor1.cursorLeft(1));
		
		System.out.println("==================================================================");

		TextEditor textEditor2 = new TextEditor();
		textEditor2.addText("jxarid");
		System.out.println(textEditor2.cursorLeft(5));
		System.out.println(textEditor2.cursorLeft(10));
		textEditor2.addText("du");
		System.out.println(textEditor2.deleteText(20));
		
		System.out.println("==================================================================");

		TextEditor textEditor3 = new TextEditor();
		textEditor3.addText("bxyackuncqzcqo");
		System.out.println(textEditor3.cursorLeft(12));
		System.out.println(textEditor3.deleteText(3));
		System.out.println(textEditor3.cursorLeft(5));
		textEditor3.addText("osdhyvqxf");
		System.out.println(textEditor3.cursorRight(20));
		
		System.out.println("==================================================================");

		TextEditor textEditor4 = new TextEditor();
		System.out.println(textEditor4.deleteText(9));
		System.out.println(textEditor4.cursorLeft(14));
		textEditor4.addText("mjzxkemqyvfrg");
		System.out.println(textEditor4.cursorLeft(5));
		textEditor4.addText("svvyobqebssp");
		textEditor4.addText("xkoznsq");
		System.out.println(textEditor4.cursorRight(3));
		System.out.println(textEditor4.cursorLeft(15));
		

	}

}
