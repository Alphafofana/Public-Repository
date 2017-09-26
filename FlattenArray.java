package Public;
import java.util.*;

public class FlattenArray {
    public static List<Object> Flatten(List<?> list) {
        List<Object> flattenList = new ArrayList<>();           //Create a list to store elements as a flatten List.
        LinkedList<Object> stack = new LinkedList<>(list);      //Create a stack to extract elements from a given list.
        while (!stack.isEmpty()) {                              //As lon as the stack is empty...
            Object element = stack.pop();                       // pick an element from the stack.
            if (element instanceof List<?>)                     // If the element is a list.
                stack.addAll(0,(List<?>)element);         // Add all the elements from the list in the stack again.
            else
                flattenList.add(element);                      // Else add the element in the flatten List.
        }
        return flattenList;                                    //Return the flatten List.
    }
    public static void main(String[] args) {
        Random random = new Random ();
        ArrayList array = new ArrayList();

        for(int i=0; i< 5 || random.nextInt(10)==0; i++){   //Create a randomized array to test the solution.
            ArrayList randomArray1 = new ArrayList();
            for(int j=0; j< 3 || random.nextInt(10)==0; j++){
                randomArray1.add(random.nextInt(10));
                ArrayList randomArray2 = new ArrayList();
                for(int k=0; k< 2 || random.nextInt(10)==0; k++){
                    randomArray2.add(random.nextInt(10));
                }
                array.add(random.nextInt(10));
                randomArray1.add(randomArray2);
            }
            array.add(random.nextInt(10));
            array.add(randomArray1);
        }
        System.out.println("En slumpmässig array av ett arbiträrt djup:");
        System.out.println(array);
        System.out.println("En sammanförd array:");
        System.out.println(Flatten(array));
    }
}
