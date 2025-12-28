import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class findDisappearedNumbers {
    public static void main(String[] args){
        int[] numbers = {4,3,2,7,8,2,3,1};
        System.out.println(solution(numbers));
    }

    public static List<Integer> solution(int[] nums) {
        List<Integer> falseNumbers = new ArrayList();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        for(int i = 1; i <= nums.length; i++){            
            if(!(set.contains(i))){            
                falseNumbers.add(i);
            }
        }   

        return falseNumbers;
    }


}
