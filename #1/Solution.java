public class Solution {
    public static void main(String[] args) {
        //declare input variables
        Integer[] input = {10, 15, 3, 7};
        Integer k = 17;
        //declare variable to keep the final answer
        boolean has_answer = false;

        //loop over the list to compare all possible combinations and see if their sums = k
        for(Integer x = 0; x < input.length; x++) {
            for (Integer n : input) {
                if (n != input[x]){
                    if ((input[x] + n) == k) {
                        //if the sum = k set the final answer variable to true and break to stop further execution of the loop
                        has_answer = true;
                        break;
                    }
                }
            }
        }
        //display the outcome to the user
        System.out.println("Was the combination to make " + k + " found? " + has_answer);
    }
}