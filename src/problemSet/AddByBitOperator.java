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
}
