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
	
	//利用位运算实现乘法
	public int multiply(int a, int b){
		int ans = 0;
		/*基本思路：将乘数分解为将乘数写成(2^0)*k0 + (2^1)*k1 + (2 ^2)*k2 + ... + (2^31)*k31，
		 * 其中ki为0或1，然后利用位运算和加法就可以了
		 * 所以，利用i=1，一位位左移（同时，a也左移，代表倍数），检测b上的位是否为1，为1则代表此时的a需要加上。
		 */
		for(int i = 1; i > 0; i<<=1){			
			if((b&i) != 0){
				ans = addByBitOperator(ans, a);
			}
			a<<=1;//要右移的原因是为了体现后面每个位的影响力，越到后面a的增加倍数越大
		}
		return ans;
	}
}
