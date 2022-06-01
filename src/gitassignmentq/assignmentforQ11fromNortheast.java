package gitassignmentq;

public class assignmentforQ11fromNortheast {

	public static void main(String[] args) {
		
		//11. Write a program to print out duplicate elements from an Array of Strings.

		//				  0        1           2         3     4        5         6       7     8        9         10	  11     12
	String[] elements= {"The","solutions","assessment","The","are","solutions","taken","repl","are","initiated","given.","is","given."}; //13 elements
	
	for(int i=0; i<elements.length; i++) {
		for(int j=i+1; j<elements.length; j++) {
			if (elements[i]==elements[j])
				System.out.print(elements[i]+" ");}
		}
	}
}
