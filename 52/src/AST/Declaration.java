package AST;



import java.util.ArrayList;

public class Declaration extends Node {
    private type type;
    private ArrayList<String> IDs;
    private ArrayList<IAssignment> assignments;

    private String baseClassID, objetID,deffinationClassID;
    public Declaration() {
        this.IDs = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public String getObjetID() {
        return objetID;
    }

    public ArrayList<String> getIDs() {
        return IDs;
    }

    public ArrayList<IAssignment> getAssignments() {
        return assignments;
    }

    public void setObjetID(String objetID) {
        this.objetID = objetID;
    }

    public void setType(type type) {
        this.type = type;
        this.addNodeChild(type);
    }

    public type getType() {
        return this.type;
    }


    public void addID(String ID){
        this.IDs.add(ID);
    }

    public void addAssignment(IAssignment assignment){
        this.assignments.add(assignment);
        this.addNodeChild((Node) assignment);
    }

    public String getBaseClassID() {
        return baseClassID;
    }

    public void setBaseClassID(String baseClassID) {
        this.baseClassID = baseClassID;
    }

    public String getDeffinationClassID() {
        return deffinationClassID;
    }

    public void setDeffinationClassID(String deffinationClassID) {
        this.deffinationClassID = deffinationClassID;
    }

    @Override
    public String generate() {
        String s = "";

        for(int i = 0; i<IDs.size(); i++){
            s += IDs.get(i);
            if(i < IDs.size() -1) s += ",";
        }
        if(assignments.size() > 0 && IDs.size()>0) s += ",";
        for(int i = 0; i<assignments.size(); i++){
            s += assignments.get(i).generate();
            if(i < assignments.size() -1) s += ",";
        }
        return s;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (type!=null){
            stringBuilder.append("type ="+type);
        }
        if(assignments.size() > 0) stringBuilder.append(", " + assignments);
        if(IDs.size() > 0) stringBuilder.append(", IDs=" + IDs);
        return stringBuilder.toString();
    }
}
