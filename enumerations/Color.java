package enumerations;

public enum Color {
	RED("Red"), GREEN("Green"), BLUE("Blue");
    private String value;

    private Color(String value) {
            this.value = value;
    }
    public String toString(){
    	return value;
    }
}


