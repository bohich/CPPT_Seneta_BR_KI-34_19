package bodyanich7;

import bodyanich7.SafeInfo;

public class WeaponSafe implements SafeInfo {
	
	private  String mark;
	private  int Weight;
	private  double Volume;
	private  String Type;	
    
	public WeaponSafe(String mark, int Weight, double Volume, String Type) {
		this.mark = mark;
    	this.Weight = Weight;
    	this.Volume = Volume;
    	this.Type = Type;  
	}
	
	public String getMark() { 
		return mark;
	}
	
	public String getSafeType() {
		return Type;
	}
	
	
	@Override
	public int compareTo(SafeInfo s) {
		 Integer i = Weight;
	        return i.compareTo(s.Weight());		
	}

	@Override
	public int Weight() {
		return Weight;
	}

	@Override
	public double Volume() {
		return Volume;
	}

	@Override
	public void print() {
		System.out.println(getMark() + " is safe, it's weight is -> " + Weight() + 
				" pounds " + "this safe has volume -> " + Volume() + "sm^3. This is safe for " + getSafeType() + "." + "\n");
		
	}

}
