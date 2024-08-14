//package AST;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Declaration extends Node {
//    type type ;
//    List<String> IDs=new ArrayList<>();
//    List <Assignment> assignments =new ArrayList<>();
//
//    public Declaration(AST.type type) {
//        this.type = type;
//
//    }
//
//    public void addAssignment(Assignment assignment){
//        this.assignments.add(assignment);
//    }
//
//    public void addID(String ID){
//        IDs.add(ID);
//    }
//
//    public AST.type getType() {
//        return type;
//    }
//
//    public void setType(AST.type type) {
//        this.type = type;
//    }
//
//    @Override
//    public String toString() {
//        return "Declaration { " +
//                "type=" + type +" , "+
//                "assignments=" + assignments +
//                '}';
//    }
//}

package AST;



import java.util.ArrayList;

public class Declaration extends Node {
    private type type;
    private ArrayList<String> IDs;
    private ArrayList<Assignment> assignments;

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

    public ArrayList<Assignment> getAssignments() {
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

    public void addAssignment(Assignment assignment){
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
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Declaration{" + type);
        if(assignments.size() > 0) stringBuilder.append(", " + assignments);
        if(IDs.size() > 0) stringBuilder.append(", IDs=" + IDs);
        return stringBuilder.toString();
    }
}
