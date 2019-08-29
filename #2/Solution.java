import java.util.List;
import java.util.ArrayList;

public class Solution{
    public static void main(String[] args) {
        //declare input/output variables
        Integer[] input = {1, 2, 3, 4, 5};
        List<Integer> output = new ArrayList<Integer>();

        //loop over all the integers in the array and calculate the product of each except the one corresponding to the number on the current index.
        for (Integer x = 0; x < input.length; x++){
            Integer total = 1, index = 0;
            for (Integer n : input){
                if (x != index) {
                    //add the product to the total variable
                    total = total * n;
                }
                index++;
            }
            //create the final output list with the product values
            output.add(total);
        }
        //print the output list to the user
        System.out.println(output.toString());
    }
}