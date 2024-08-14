package AST;


public class StringLiteral extends Node implements ILiteral{
	String value;

	Identifier identifier;

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public Identifier getIdentifier() {
		return identifier;
	}

	public void setIdentifier(Identifier identifier) {
		this.identifier = identifier;
	}

	@Override
	public String generate() {
		String s ="";
		if (value!=null)
			s+=getValue();
		else if (identifier!=null)
			s+=identifier.generate();
		s+="";
		return s;
	}
	@Override
	public String toString() {
		return "value='" + value;
	}
}
