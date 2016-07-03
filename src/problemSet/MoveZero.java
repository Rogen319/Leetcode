package problemSet;

public class MoveZero {

	public void moveZeroes(int[] nums) {
		//思路：将非0的移到前方，后面的数值都赋为0

		int p = 0;//用于遍历
		int q = 0;//用于记录0开始的位置

		while(p < nums.length){
			if(nums[p] != 0){
				nums[q] = nums[p];
				q += 1;//0开始的位置往后移
			}
			p += 1;
		}

		for(int i = q;i < nums.length;i++){
			nums[i] = 0;
		}
	}

}
