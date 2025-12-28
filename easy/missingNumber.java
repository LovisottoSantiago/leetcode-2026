import java.util.HashSet;

public class missingNumber {
    public static void main(String[] args){
        int[] numbers = {0,1,2};
        System.out.println(solution(numbers));
    }

    public static int solution(int[] nums){        
        HashSet<Integer> set = new HashSet<>();
        int value = 0;

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        for(int i = 0; i < nums.length; i++){            
            if(!set.contains(i)){                
                value = i;
                break;
            }
            else value++;
        }        

        return value;
    }
}