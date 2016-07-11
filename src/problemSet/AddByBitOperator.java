package problemSet;

public class AddByBitOperator {

	//����λ����ʵ�ּӷ�����
	public int addByBitOperator(int a, int b){
		int ans;
		while(b != 0){
			ans = a ^ b;//�޽�λ����
			b = (a & b)<<1;//��λ����
			a = ans;
		}
		return a;
	}
	
	//����λ����ʵ�ֳ˷�
	public int multiply(int a, int b){
		int ans = 0;
		/*����˼·���������ֽ�Ϊ������д��(2^0)*k0 + (2^1)*k1 + (2 ^2)*k2 + ... + (2^31)*k31��
		 * ����kiΪ0��1��Ȼ������λ����ͼӷ��Ϳ�����
		 * ���ԣ�����i=1��һλλ���ƣ�ͬʱ��aҲ���ƣ��������������b�ϵ�λ�Ƿ�Ϊ1��Ϊ1������ʱ��a��Ҫ���ϡ�
		 */
		for(int i = 1; i > 0; i<<=1){			
			if((b&i) != 0){
				ans = addByBitOperator(ans, a);
			}
			a<<=1;//Ҫ���Ƶ�ԭ����Ϊ�����ֺ���ÿ��λ��Ӱ������Խ������a�����ӱ���Խ��
		}
		return ans;
	}
}
