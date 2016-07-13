package problemSet;

import java.util.ArrayList;
import java.util.List;

/*
 * 思路是将数组排序，然后分别从第一个开始，第二个开始……，统计寻找最大可除尽子集
 * 错误点：从一个位置开始，会有存在多条路径的情况，而这个想法只能考虑最开始的一条路径
 */
public class LargestDivisibleSubset_Version1 {
	public List<Integer> largestDivisibleSubset(int[] nums) {

		List<Integer> result = new ArrayList<Integer>();

		if(nums.length > 0){
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

			//找最大可除尽子集
			int[] counts = new int[nums.length];
			for(int m = 0; m < nums.length; m++){
				int little = nums[m];
				for(int n = m + 1; n < nums.length;n++){
					if(nums[n] % little == 0){
						counts[m]++;
						little = nums[n];
					}
				}
			}

			//找具有最大可除尽子集的下标
			int index = 0;
			int max = 0;
			for(int m = 0; m < counts.length; m++){
				if(counts[m] > max){
					index = m;
					max = counts[m];
				}
			}

			//返回最大可除尽子集
			int little = nums[index]; 
			for(int n = index;n < nums.length;n++){
				if(nums[n] % little == 0){
					result.add(nums[n]);
					little = nums[n];
				}
			}
		}

		return result;
	}
}
