package problemSet;

public class MoveZero {

	public void moveZeroes(int[] nums) {
		//˼·������0���Ƶ�ǰ�����������ֵ����Ϊ0

		int p = 0;//���ڱ���
		int q = 0;//���ڼ�¼0��ʼ��λ��

		while(p < nums.length){
			if(nums[p] != 0){
				nums[q] = nums[p];
				q += 1;//0��ʼ��λ��������
			}
			p += 1;
		}

		for(int i = q;i < nums.length;i++){
			nums[i] = 0;
		}
	}

}
