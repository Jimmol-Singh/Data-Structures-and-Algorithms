
public class main {

	public static void main(String[] args) {
		
		//this is the array we will sort
		int[] array = { 1, 4, -3, 5, -2, 7, -1, -8, -10, 3};
		
		
		System.out.print("Orginal: ");
		for(int b = 0; b < array.length; b++) {
			
			System.out.print(array[b] + " ");
		}
		
		//this is the the varible we will store each element that needs to be switched temporary.
		int temp = 0;
		
		
		
		//this for loop is what will take us through the array
		for(int i = 0; i < array.length; i++) {
			    //this for loop is what will do the comparision and switch elements if needed.
				for(int j = 1; j < array.length - 1; j++) {
					
						if(array[j-1] > array[j]) {
							temp = array[j-1];
							array[j-1]= array[j];
							array[j] = temp;
						}
					}
		     	}
		
		
		//puts the next output on next line
		System.out.println();
		
		
		System.out.print("Sorted: ");
		
		//this forloop will output the new array
		for(int a = 0; a < array.length; a++) {
			System.out.print(array[a] + " ");
		}
	     
	}
	
}
	
