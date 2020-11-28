import java.util.Arrays;

public class Example {

	public Example() {
		
	}
static int[] sortArray(int a[])
{
	int []b;
	Arrays.sort(a); 
	  
	return a;
	}
	public static void main(String[] args) {
		int []a= {4,2,3,1,5};
sortArray(a);
System.out.println(sortArray(a));
	}

}
