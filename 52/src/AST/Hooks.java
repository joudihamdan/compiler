package AST;

public class Hooks extends Node{
    Usestate usestate;

    UseRef useRef;
    UseEffect useEffect;

    public void setUsestate(Usestate usestate) {
        this.usestate = usestate;
    }


    public void setUseRef(UseRef useRef) {
        this.useRef = useRef;
    }

    public void setUseEffect(UseEffect useEffect) {
        this.useEffect = useEffect;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Hooks {");
        stringBuilder.append("\n");
        if(usestate !=null){
            stringBuilder.append(usestate);
        }
        if(useRef!=null)
            stringBuilder.append(useRef);
        if (useEffect!=null)
            stringBuilder.append(useEffect);
        stringBuilder.append(" } ");

        return stringBuilder.toString();
    }
}
