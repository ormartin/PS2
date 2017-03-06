package base;

public class MyInteger {
	private int iValue;
	//constructor
	public MyInteger(int iValue2){
		super();
		iValue = iValue2;
	}
	//getter
	public int getiValue(){
		return iValue;
	}
	//test iValue if even, odd, or prime
	public boolean isEven(){
		if ((getiValue() % 2) == 0){
			return true;
		}
		return false;
	}
	public boolean isOdd(){
		if ((getiValue() % 2) != 0){
			return true;
		}
		return false;
	}
	public boolean isPrime(){
		for (int num = 2; num < getiValue(); num++) {
			if(getiValue() % num == 0){
				return false;
			}
		}
		return true;
	}
	//Test specific integer values 
	public boolean isEven(int value){
		if ((value % 2) == 0){
			return true;
		}
		return false;
	}
	public boolean isOdd(int value){
		if ((value % 2) != 0){
			return true;
		}
		return false;
	}
	public boolean isPrime(int value){
		for (int num = 2; num < value; num++) {
			if((value % num) == 0){
				return false;
			}
		}
		return true;
	}
	//Test MyInteger values
	public boolean isEven(MyInteger v){
		if ((v.getiValue() % 2) == 0){
			return true;
		}
		return false;
	}
	public boolean isOdd(MyInteger v){
		if ((v.getiValue() % 2) != 0){
			return true;
		}
		return false;
	}
	public boolean isPrime(MyInteger v){
		for (int num = 2; num < v.getiValue(); num++) {
			if((v.getiValue() % num) == 0){
				return false;
			}
		}
		return true;
	}
	//equal tests
	public boolean equal(int obj){
		if (obj == iValue){
			return true;
		}
		return false;
	}
	
	public boolean equal(MyInteger obj){
		if (obj.getiValue() == iValue){
			return true;
		}
		return false;
	}
}
