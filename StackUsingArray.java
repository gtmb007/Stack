import java.util.Scanner;
class Stack {
	int top;
	int capacity;
	Integer[] arr;
	Stack(int capacity) {
		this.top=-1;
		this.capacity=capacity;
		this.arr=new Integer[capacity];
	}
	boolean push(Integer data) {
		if(top==capacity-1) {
			return false;
		} else {
			arr[++top]=data;
			return true;
		}
	}
	Integer pop() {
		if(top==-1) {
			return null;
		} else {
			return arr[top--];
		}
	}
	Integer peek() {
                if(top==-1) {
                        return null;
                } else {
                        return arr[top];
                }
        }
	boolean contains(Integer data) {
		boolean flag=false;
                if(top>-1) {
                        for(int i=top;i>-1;i--) {
                                if(arr[i].equals(data)) {
					flag=true;
					break;
				}
                        }
                }
		return flag;
        }
	void display() {
		if(top==-1) {
			System.out.println("Stack is Empty");
		} else {
			for(int i=top;i>-1;i--) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
}
class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack stack=new Stack(10);
		System.out.println("© 2019 Gautam Bharadwaj");
		while(true) {
			System.out.println("\nStack Using Array Menu: \n1. Push an Element\n2. Pop an Element\n3. Peek an Element\n4. The Element is present or not\n5. Display the Stack\n6. Size of Stack\n7. Capacity of Stack\n8. Exit\n");
			System.out.print("Enter your choice: ");
			int option=sc.nextInt();
			switch(option) {
				case 1: System.out.print("Enter the element: ");
					System.out.println(stack.push(sc.nextInt()));
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
				case 6: System.out.println(stack.top+1);
					break;
				case 7: System.out.println(stack.capacity);
					break;
				case 8: System.exit(0);
				default : System.out.println("Please enter correct choice!");
			}
		}
	}	
}
