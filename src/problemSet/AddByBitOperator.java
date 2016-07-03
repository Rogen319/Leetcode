package problemSet;

public class AddByBitOperator {

	//利用位运算实现加法运算
	public int addByBitOperator(int a, int b){
		int ans;
		while(b != 0){
			ans = a ^ b;//无进位运算
			b = (a & b)<<1;//进位运算
			a = ans;
		}
		return a;
	}
}
