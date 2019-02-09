/*
 *	Stack : is a type of Data Structure that uses LIFO (Last-In-First-Out) approach.
 *	Operation of Stacks
 *		1. PUSH
 *		2. POP
 *		3. SEEK
 */

class ArrayStack
{
	static int[] a = new int[5];
	static int i = 0;
	
	//	PUSH-operation
	void push(int data)
	{
		if(i>4)
			System.out.println("\tStack Overflow!!!");
		else	{
			a[i++] = data;
			System.out.println("\tData inserted...");
		}
	}
	
	//	PRINT-operation
	public void print(int[] a)
	{
		System.out.println("\t Printing Stack Elements");
			for(int x=i-1;x>-1;x--)
				System.out.println(a[x]);
	}
	
	//	POP-operation
	void pop()
	{
		if(i<0)
			System.out.println("\t Stack underflow!!!");
		else	{
			
			System.out.println("\tData deleted..."+a[--i]);
		}
	}
	
	//	SEEK-operation
	void seek(int[] a)
	{
		
		System.out.println("Seek value	: "+a[i-1]);
	}
	
	public static void main(String... args)
	{
		ArrayStack stack = new ArrayStack();
			
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.push(40);
			stack.push(70);
			
			stack.print(a);
			stack.seek(a);
			
			stack.pop();
			stack.pop();
			stack.pop();
			
			stack.print(a);
			stack.seek(a);
	}
}