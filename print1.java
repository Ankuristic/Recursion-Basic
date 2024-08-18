package RecursionBasic;

public class print1 {
	
	static void print (int count) {
//	int count = 0 ;
		
		if (count == 4)  return ;
		
		
		System.out.println(count);
		 count = count+1;
		
		
		print(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//   this is a stack overflow coondition so we provide base condition till now 
		System.out.println(1);
		
		print(0);

	}

}

//Recursion in 3 steps

// what is a recursion 
// Base condition 
// Stack overfloww / stack  space

// Recusion tree


