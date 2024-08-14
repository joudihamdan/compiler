package AST;

public class Identifier extends Node {
	private String ID;
	private String dotID;
	
	public void setID(String ID) {
		this.ID = ID;
	}
	public String getID() {
		return ID;
	}

	public String getDotID() {
		return dotID;
	}

	public void setDotID(String dotID) {
		this.dotID = dotID;
	}

	@Override
	public String generate() {
		String s = "";
		s+=ID;
		if(dotID != null){
			s+="."+dotID;
		}
		return s;
	}

	@Override
	public String toString() {
		return "Identifier{" +
				"ID='" + ID + '\'' +
				", dotID='" + dotID + '\'' +
				'}';
	}
}
