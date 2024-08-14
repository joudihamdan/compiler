package AST;

public class Attribute {
  Text text;
  Multiattribute multiattribute;
  Dotattribute dotattribute;
  Equalattribute equalattribute;
  Selectattribute selectattribute;

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public Multiattribute getMultiattribute() {
        return multiattribute;
    }

    public void setMultiattribute(Multiattribute multiattribute) {
        this.multiattribute = multiattribute;
    }

    public Dotattribute getDotattribute() {
        return dotattribute;
    }

    public void setDotattribute(Dotattribute dotattribute) {
        this.dotattribute = dotattribute;
    }

    public Equalattribute getEqualattribute() {
        return equalattribute;
    }

    public void setEqualattribute(Equalattribute equalattribute) {
        this.equalattribute = equalattribute;
    }

    public Selectattribute getSelectattribute() {
        return selectattribute;
    }

    public void setSelectattribute(Selectattribute selectattribute) {
        this.selectattribute = selectattribute;
    }

    @Override
    public String toString() {
        return "Attribute{" +
                "text=" + text +
                ", multiattribute=" + multiattribute +
                ", dotattribute=" + dotattribute +
                ", equalattribute=" + equalattribute +
                ", selectattribute=" + selectattribute +
                '}';
    }
}
