package enumerations;

public enum PlugType {
	EURO("EURO"), JAPAN("JAPAN"), ENG("ENGLISH");
	
	private String value;
	
	PlugType(String type){
		value = type;
	}
	
	public String toString(){
		return value;
	}

}
