import java.util.HashMap;

public class missingNumber {
    public static void main(String[] args){
        int[] numbers = {0,1,2};
        System.out.println(solution(numbers));
    }

    public static int solution(int[] nums){        
        HashMap<Integer, Integer> set = new HashMap<>();
        int value = 0;

        for(int i = 0; i < nums.length; i++){
            set.put(i, nums[i]);
        }

        for(int i = 0; i < nums.length; i++){            
            if(!set.containsValue(i)){
                System.out.println("¡FALSE! NO CONTIENE " + i);
                value = i;
                break;
            }
            else value++;
        }        

        return value;
    }
}