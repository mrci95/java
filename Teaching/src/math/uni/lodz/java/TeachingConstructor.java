package math.uni.lodz.java;

public class TeachingConstructor extends BaseConstructor implements GlobalConstructor{
	public OtherConstructor other;
	public TeachingConstructor() {
		System.out.println("Block B");
		other = new OtherConstructor();
	}
	
	public TeachingConstructor(int x){
		System.out.println("Block A");
	}
	
	{
		System.out.println("Block C");
	}
	
	static{
		System.out.println("Block D");
	}
	
	@Override
	public void CoolFunction() {
		// TODO Auto-generated method stub
		
	}
	
	 
}
