package problemSet;

import java.util.ArrayList;
import java.util.List;

/*
 * ˼·�ǽ���������Ȼ��ֱ�ӵ�һ����ʼ���ڶ�����ʼ������ͳ��Ѱ�����ɳ����Ӽ�
 * ����㣺��һ��λ�ÿ�ʼ�����д��ڶ���·���������������뷨ֻ�ܿ����ʼ��һ��·��
 */
public class LargestDivisibleSubset_Version1 {
	public List<Integer> largestDivisibleSubset(int[] nums) {

		List<Integer> result = new ArrayList<Integer>();

		if(nums.length > 0){
			//����
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

			//�����ɳ����Ӽ�
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

			//�Ҿ������ɳ����Ӽ����±�
			int index = 0;
			int max = 0;
			for(int m = 0; m < counts.length; m++){
				if(counts[m] > max){
					index = m;
					max = counts[m];
				}
			}

			//�������ɳ����Ӽ�
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
