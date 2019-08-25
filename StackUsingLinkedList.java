import java.util.Scanner;
class Node {
	Integer data;
	Node next;
	Node(Integer data) {
		this.data=data;
	}	
}
class Stack {
	Node head;
	void push(Integer data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		} else {
			newNode.next=head;
			head=newNode;
		}
	}
	Integer pop() {
		if(head==null) {
			return null;
		} else {
			Integer a=head.data;
			head=head.next;
			return a;
		}
	}
	Integer peek() {
		if(head==null) {
			return null;
		} else {
			return head.data;
		}
	}
	boolean contains(Integer data) {
		boolean flag=false;
		Node temp=head;
		while(temp!=null) {
			if(temp.data.equals(data)) {
				flag=true;
				break;
			}
			temp=temp.next;
		}
		return flag;
	}
	void display() {
		if(head==null) {
			System.out.println("Stack is Empty");	
		} else {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	int size() {
		int count=0;
		Node temp=head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
}
class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack stack=new Stack();
		System.out.println("© 2019 Gautam Bharadwaj");
		while(true) {
			System.out.println("\nStack Using Linked List Menu: \n1. Push an Element\n2. Pop an Element\n3. Peek an Element\n4. The Element is present or not\n5. Display the Stack\n6. Size of Stack\n7. Exit\n");
			System.out.print("Enter your choice: ");
			int option=sc.nextInt();
			switch(option) {
				case 1: System.out.print("Enter the element: ");
					stack.push(sc.nextInt());
					break;
				case 2: System.out.println(stack.pop());
					break;
				case 3: System.out.println(stack.peek());
					break;
				case 4: System.out.print("Enter the element: ");
					System.out.println(stack.contains(sc.nextInt()));
					break;
				case 5: stack.display();
					break;
				case 6: System.out.println(stack.size());
					break;
				case 7: System.exit(0);
				default : System.out.println("Please enter correct choice!");
			}
		}
	}	
}
