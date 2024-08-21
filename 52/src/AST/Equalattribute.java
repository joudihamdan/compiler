package AST;

public class Equalattribute extends Node implements IAttribute {
    private String attributeName;
    private String mapIdentifier;
    private String mapKey;

    public Equalattribute(String attributeName, String mapIdentifier, String mapKey) {
        this.attributeName = attributeName;
        this.mapIdentifier = mapIdentifier;
        this.mapKey = mapKey;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getMapIdentifier() {
        return mapIdentifier;
    }

    public void setMapIdentifier(String mapIdentifier) {
        this.mapIdentifier = mapIdentifier;
    }

    public String getMapKey() {
        return mapKey;
    }

    public void setMapKey(String mapKey) {
        this.mapKey = mapKey;
    }

    @Override
    public String toString() {
        return "Equalattribute{" +
                "attributeName='" + attributeName + '\'' +
                ", mapIdentifier='" + mapIdentifier + '\'' +
                ", mapKey='" + mapKey + '\'' +
                '}';
    }
}
