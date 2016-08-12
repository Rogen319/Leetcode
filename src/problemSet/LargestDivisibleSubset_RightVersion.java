package problemSet;

import java.util.ArrayList;
import java.util.List;

public class LargestDivisibleSubset_RightVersion {
	
	public static void main(String[] args){
		int[] nums = {1,2,3};
		List<Integer> result = largestDivisibleSubset(nums);
		for(int i:result){
			System.out.println(i);
		}
	}
    public static List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        if(nums.length < 2){
            if(nums.length == 1){
                result.add(nums[0]);
            }
            return result;
        }
        else{
            //排序
			for(int i = 1; i < nums.length; i++){
				int toInsert = nums[i];
				int j;
				for(j = i - 1; j >= 0; j--){
					if(toInsert < nums[j]){
						nums[j+1] = nums[j];
					}
					else {
						break;
					}
				}
				nums[j+1] = toInsert;
			}
			
			//找出最大可除尽子集
			int[] count = new int[nums.length];
			int[] parent = new int[nums.length];
			int max = 0,maxind = -1;
			
			for(int i = nums.length - 1; i >= 0; i--){
			    for(int j = i; j < nums.length; j++){
			        if(nums[j] % nums[i] == 0 && count[i] < 1 + count[j]){
			            count[i] = 1 + count[j];
			            parent[i] = j;
			            if(count[i] > max){
			                max = count[i];
			                maxind = i;
			            }
			        }
			    }    
			}
			
			//输出结果
			for(int i = 0; i < max; i++){
			    result.add(nums[maxind]);
			    maxind = parent[maxind];
			}
			
			return result;
        }
    }
}
