package Visitor;

import AST.*;
import ErrorCheck.SemanticCheck;
import Grammar.ReactParser;
import Grammar.ReactParserBaseVisitor;
import SymbolTable.Scope;
import SymbolTable.Symbol;

import java.util.Objects;


public class BaseVisitor extends ReactParserBaseVisitor<Node> {

    @Override
    public Node visitProgram(ReactParser.ProgramContext ctx) {
        System.out.println("\n");
        System.out.println("--------Scope & Symbol -------------");
        Scope.createScope("Program Scope");
        program p=new program();
        if(ctx.statement()!=null) {
            for (int i = 0; i < ctx.statement().size(); i++) {
                p.addStatement((Statement) visit(ctx.statement(i)));
            }
        }
        if(ctx.list()!=null)
        {
           p.setList((list) visit(ctx.list()));
           if(ctx.arrowcomponent()!=null) {
               for (int i = 0; i < ctx.arrowcomponent().size(); i++) {
                   p.addArrowComponent((ArrowComponent) visit(ctx.arrowcomponent(i)));
               }
           }
        }
        if(ctx.withHooks()!=null)
            p.setWithUseState((WithHooks) visit(ctx.withHooks()));

         if(ctx.singlecomponent()!=null){
                p.setComponent((SingleComponent) visit(ctx.singlecomponent()));
        }
         if(ctx.hooks()!=null){
             p.setHooks((Hooks) visit(ctx.hooks()) );
         }
        Scope.removeScope("Program Scope");
        System.out.println("-----------------------------");
        System.out.println("\n");
        System.out.println("---------Program From Visitor--------------");
     return  p;
      //  return  super.visitProgram(ctx);

    }

    @Override
    public Node visitStatement(ReactParser.StatementContext ctx) {
        Statement statement=new Statement();
        if(ctx.declaration()!=null){
            for(int i=0;i<ctx.declaration().size();i++)
             statement.addDeclaration((Declaration)visit(ctx.declaration(i)) );
        }
        if(ctx.forloop()!=null){
            statement.setF((forloop) visit(ctx.forloop()));
        }
        if(ctx.if_()!=null){
            statement.setIfc((IF_Condition) visit(ctx.if_()));
        }
        if(ctx.call()!=null)
        {
            statement.setCall((call) visit(ctx.call()));
        }
        return statement;
    }

    @Override
    public Node visitWithHooks(ReactParser.WithHooksContext ctx) {
        Scope.createScope("Component Scope");
        WithHooks withHooks =new WithHooks(
                (ArrowComponent) visit(ctx.arrowcomponent()),
                (ComponentBody) visit(ctx.componentBody())
        );
        if( ctx.export()!=null)
            withHooks.setExported(ctx.export()!=null);

        Scope.removeScope("Component Scope");
        return withHooks;
    }

    @Override
    public Node visitHooks(ReactParser.HooksContext ctx) {
        Hooks hooks=new Hooks();
        if(ctx.usestate()!=null){
            hooks.setUsestate((Usestate) visit(ctx.usestate()));
        }
        if(ctx.useRef()!=null)
            hooks.setUseRef((UseRef) visit(ctx.useRef()));
        if(ctx.useEffect()!=null)
            hooks.setUseEffect((UseEffect) visit(ctx.useEffect()));
        return hooks;
    }

    @Override
    public Node visitUseRef(ReactParser.UseRefContext ctx) {
        Symbol symbol=  Symbol.createSymbol(Objects.requireNonNull(Scope.getCurrentScope()).getId(), "Hooks", "UseRef",ctx.IDENTIFIERNAME().toString(),ctx.start.getLine());
        SemanticCheck.checkHooksUsage(symbol,ctx.start.getLine(), Scope.getCurrentScope().getId());

        return new UseRef(ctx.IDENTIFIERNAME().toString(),(Openpraces) visit(ctx.openbraces()));
    }

    @Override
    public Node visitUseEffect(ReactParser.UseEffectContext ctx) {
        UseEffect useEffect=new UseEffect();
        useEffect.setFunction((Function) visit(ctx.function()));
        Symbol symbol=  Symbol.createSymbol(Objects.requireNonNull(Scope.getCurrentScope()).getId(), "Hooks", "UseEffect", "statement",ctx.start.getLine());

        if(ctx.statement()!=null){
            for (int i=0;i<ctx.statement().size();i++)
                useEffect.addStat((Statement) visit(ctx.statement(i)));
        }
        SemanticCheck.checkHooksUsage(symbol,ctx.start.getLine(), Scope.getCurrentScope().getId());


        return  useEffect;
    }

    @Override
    public Node visitUsestate(ReactParser.UsestateContext ctx) {
        Usestate usestate=new Usestate();
        usestate.setId(ctx.IDENTIFIERNAME(0).toString());
        usestate.setFunid(ctx.IDENTIFIERNAME(1).toString());
        usestate.setUsestate( visit(ctx.STRING_LITERAL()).toString());
        usestate.setConstFunction((ConstFunction)visit(ctx.constfunction()) );
        Symbol symbol=  Symbol.createSymbol(Objects.requireNonNull(Scope.getCurrentScope()).getId(), "Hooks", "UseState", ctx.IDENTIFIERNAME().toString(),ctx.start.getLine());
        SemanticCheck.checkHooksUsage(symbol,ctx.start.getLine(), Scope.getCurrentScope().getId());


        return  usestate;

    }

    @Override
    public Node visitExport(ReactParser.ExportContext ctx) {

        return new Export(ctx.IDENTIFIERNAME().toString());
    }

    @Override
    public Node visitList(ReactParser.ListContext ctx) {
        Scope.createScope("List Scope");
        list es= new list(ctx.IDENTIFIERNAME().getText(),visit(ctx.elements()));

        Symbol.createSymbol(Objects.requireNonNull(Scope.getCurrentScope()).getId(), "List", "Const", ctx.IDENTIFIERNAME().getText(),ctx.start.getLine());
        Scope.removeScope("List Scope");
        return es;
    }

    @Override
    public Node visitElements(ReactParser.ElementsContext ctx) {
        Elements es= new Elements();
        for(int i=0 ; i<ctx.children.size();i++){
            es.addElement(visit(ctx.getChild(i)));
        }
        return es;
    }

    @Override
    public Node visitLitral(ReactParser.LitralContext ctx) {

        return new Litral(ctx.getChild(0).getText());
    }

    @Override
    public Node visitElement(ReactParser.ElementContext ctx) {
       Element e= new Element();
       for(int i=0 ; i<ctx.IDENTIFIERNAME().size();i++){
           IElement ie=new IElement(ctx.IDENTIFIERNAME().get(i).toString(),ctx.IDENTIFIERNAME().get(i).toString());
            e.addElement(ie);
       }
         return e;
    }

    @Override
    public Node visitSinglecomponent(ReactParser.SinglecomponentContext ctx) {
           SingleComponent singleComponent=new SingleComponent();

           if(ctx.functionalcomponent()!=null)
               singleComponent.setFunctionalComponent((FunctionalComponent) visit(ctx.functionalcomponent()));
           if (ctx.arrowcomponent()!=null)
               singleComponent.setArrowComponent((ArrowComponent) visit(ctx.arrowcomponent()));
           singleComponent.setComponentBody((ComponentBody) visit(ctx.componentBody()));
           return  singleComponent;

    }

    @Override
    public Node visitFunctionalcomponent(ReactParser.FunctionalcomponentContext ctx) {
        Scope.createScope("Component Scope");
        FunctionalComponent fc=new FunctionalComponent(
                ctx.IDENTIFIERNAME().toString(),
                (Openpraces) visit(ctx.openbraces())
        );
        Symbol.createSymbol(Objects.requireNonNull(Scope.getCurrentScope()).getId(), "Component", "FunctionalComponent",ctx.IDENTIFIERNAME().toString(),ctx.start.getLine());
        Scope.removeScope("Component Scope");
        return fc;
    }

    @Override
    public Node visitArrowcomponent(ReactParser.ArrowcomponentContext ctx) {
        Scope.createScope("Component Scope");
        ArrowComponent arrowComponent=new ArrowComponent(
                ctx.IDENTIFIERNAME().toString(),
                (Openpraces) visit(ctx.openbraces())
        );
        Symbol.createSymbol(Objects.requireNonNull(Scope.getCurrentScope()).getId(), "Component", "ArrowComponent",ctx.IDENTIFIERNAME().toString(),ctx.start.getLine() );
        Scope.removeScope("Component Scope");
        return arrowComponent;
    }

    @Override
    public Node visitComponentBody(ReactParser.ComponentBodyContext ctx) {
        ComponentBody componentBody=new ComponentBody((JSXElements) visit(ctx.jsxElements()));
        if(ctx.hooks()!=null)
            componentBody.setHooks((Hooks) visit(ctx.hooks()));
        return componentBody;
    }

    @Override
    public Node visitOpenbraces(ReactParser.OpenbracesContext ctx) {
        Openpraces op=new Openpraces();
        if(ctx.STRING_LITERAL()!=null)
            op.setS(ctx.STRING_LITERAL().toString());
        for(int i=0;i<ctx.children.size();i++){
            op.addAttributes(visit(ctx.getChild(i)));
        }
        return  op;
    }

    @Override   public Node visitJsxElements(ReactParser.JsxElementsContext ctx) {
        JSXElements js =new JSXElements();
        if(ctx.openTag()!=null){
            js.setOpenTag((OpenTag) visit(ctx.openTag()));
            js.setTagContent((TagContent) visit(ctx.tagContent()));
            js.setCloseTag((CloseTag) visit(ctx.closeTag()));
        }
        else {
            js.setSelfClosing((SelfClosingTag) visit(ctx.selfclosing()));
        }
        return js;
    }

    @Override
    public Node visitComponentcall(ReactParser.ComponentcallContext ctx) {
        ComponentCall cc=new ComponentCall();
        cc.setName(ctx.IDENTIFIERNAME(0).getText());
             cc.addId(ctx.IDENTIFIERNAME(1).getText());
             cc.addobject(ctx.IDENTIFIERNAME(2).getText());
     return  cc;
    }

    @Override
    public Node visitOpenTag(ReactParser.OpenTagContext ctx) {

        OpenTag ot=new OpenTag();
        ot.setTagName(ctx.IDENTIFIERNAME().toString());
        for ( int i=0;i<ctx.children.size();i++){
            ot.addtagcontent(visit(ctx.getChild(i)));
        }
        return ot;
    }

    @Override
    public Node visitCloseTag(ReactParser.CloseTagContext ctx) {

        return new CloseTag(ctx.IDENTIFIERNAME().toString());
    }

    @Override
    public Node visitSelfclosing(ReactParser.SelfclosingContext ctx) {
        SelfClosingTag st=new SelfClosingTag(ctx.IDENTIFIERNAME().toString());
        for ( int i=0;i<ctx.children.size();i++){
            st.addattribute(visit(ctx.getChild(i)));
        }
        return st;
    }

    @Override
    public Node visitText(ReactParser.TextContext ctx) {
        return new Text(ctx.IDENTIFIERNAME().toString());
    }

    @Override
    public Node visitMultiattribute(ReactParser.MultiattributeContext ctx) {
        Multiattribute m=new Multiattribute();
        for (int i=0;i<ctx.IDENTIFIERNAME().size();i++){
            String s=" ";
            s+=ctx.IDENTIFIERNAME(i).toString();
            m.addAttributeName(s);
        }
        return m;
    }

    @Override
    public Node visitDotattribute(ReactParser.DotattributeContext ctx) {
        return new Dotattribute(ctx.IDENTIFIERNAME().toString(),visit(ctx.getChild(0)));

    }

    @Override
    public Node visitEqualttribute(ReactParser.EqualttributeContext ctx) {
        return  new Equalattribute(ctx.IDENTIFIERNAME().toString(),ctx.IDENTIFIERNAME().toString(),ctx.IDENTIFIERNAME().toString());
    }

    @Override
    public Node visitSelectatrribute(ReactParser.SelectatrributeContext ctx) {
      return new Selectattribute((Select) visit(ctx.select()));
    }

    @Override
    public Node visitFunctionattribute(ReactParser.FunctionattributeContext ctx) {
        return new Functionattribute((Function) visit( ctx.function()));
    }

    @Override
    public Node visitMap(ReactParser.MapContext ctx) {
        return new Map((Openpraces) visit(ctx.openbraces()),(JSXElements) visit(ctx.jsxElements()));
    }

    @Override
    public Node visitSelect(ReactParser.SelectContext ctx) {
        return new Select(
                ctx.IDENTIFIERNAME().toString(),
                (JSXElements) visit(ctx.jsxElements())
        );

    }

    @Override
    public Node visitTagContent(ReactParser.TagContentContext ctx) {
        TagContent tc=new TagContent();
        if(ctx.children!=null){
        for (int i=0;i<ctx.children.size();i++){
            tc.addnode(visit(ctx.getChild(i)));
        }
        }
        return  tc;
    }

    @Override
    public Node visitStyle(ReactParser.StyleContext ctx) {
      return  new Style((StyleAttributes) visit(ctx.styleAttributes()));

      }

    @Override
    public Node visitStyleAttributes(ReactParser.StyleAttributesContext ctx) {
        StyleAttributes sa=new StyleAttributes();
        for(int i=0 ; i<ctx.IDENTIFIERNAME().size();i++) {
            String n=ctx.IDENTIFIERNAME().get(i).toString();
            String n2=ctx.STRING_LITERAL().get(i).toString();
           sa.addAttribute(n,n2);
        }
        return sa;
    }

    @Override
    public Node visitFunction(ReactParser.FunctionContext ctx) {
        Function function= new Function((Openpraces) visit(ctx.openbraces()));
        if(ctx.call()!=null)
            function.setCall((call) visit(ctx.call()));
        return function;
    }

    @Override
    public Node visitConstfunction(ReactParser.ConstfunctionContext ctx) {
        return  new ConstFunction(ctx.IDENTIFIERNAME().toString(),(Openpraces) visit(ctx.openbraces()),(call) visit(ctx.call()));

    }

    @Override
    public Node visitCall(ReactParser.CallContext ctx) {
        return new call(ctx.IDENTIFIERNAME().toString(),(Openpraces) visit(ctx.openbraces()));
    }

    @Override
    public Node visitOperation(ReactParser.OperationContext ctx) {
        return new operation(ctx.IDENTIFIERNAME().toString(),ctx.IDENTIFIERNAME().toString());
    }

    @Override
    public Node visitForloop(ReactParser.ForloopContext ctx) {
        Scope.createScope("For Scope");
        forloop loop = new forloop();
        loop.setDeclaration((Declaration) visit(ctx.declaration()));
        if(ctx.statement()!=null) {
            for (int i = 0; i < ctx.statement().size(); i++) {
                loop.addStatement((Statement) visit(ctx.statement(i)));
            }
        }
        Scope.removeScope("For Scope");
        return loop;
    }

    @Override
    public Node visitElseIf_condition(ReactParser.ElseIf_conditionContext ctx) {
        Scope.createScope("Else if Scope");
        ElseIf_Condition elseif = new ElseIf_Condition((IF_Condition) visit(ctx.if_()));
        Scope.removeScope("Else if Scope");
        return elseif;
    }

    @Override
    public Node visitElse_condition(ReactParser.Else_conditionContext ctx) {
        Scope.createScope("Else Scope");
        Else_condition el = new Else_condition();
        for(int j=0 ; j<ctx.statement().size();j++){
            el.addStatement( (Statement) visit(ctx.statement(j)));
        }
        Scope.removeScope("Else Scope");
        return el;
    }

    @Override
    public Node visitIf(ReactParser.IfContext ctx) {
        Scope.createScope("IF Scope");
        IF_Condition IF_Condition = new IF_Condition();
        if(ctx.statement()!=null) {
            for (int j = 0; j < ctx.statement().size(); j++) {
                IF_Condition.addNode((Statement) visit(ctx.statement(j)));
            }
        }
        if(ctx.elseIf_condition()!=null) {
            for (int j = 0; j < ctx.elseIf_condition().size(); j++) {
                IF_Condition.addElseIF((ElseIf_Condition) visit(ctx.elseIf_condition(j)));
            }
        }
        if(ctx.else_condition()!=null)
           IF_Condition.setElse_condition((Else_condition) visit(ctx.else_condition()));

        Scope.removeScope("IF Scope");
        return IF_Condition;
    }

    @Override
    public Declaration visitDeclaration(ReactParser.DeclarationContext ctx) {
        System.out.println("Declaration From Visitor");
        Declaration declaration = new Declaration();
        if (ctx.type() != null) {
            declaration.setType((type) visit(ctx.type()));
            for (int i = 0; i < ctx.assignment().size(); i++) {
                declaration.addAssignment((Assignment) visit(ctx.assignment(i)));
                Symbol symbol = Symbol.createSymbol(Objects.requireNonNull(Scope.getCurrentScope()).getId(), "Variable", declaration.getType().toString(), ctx.assignment(i).getChild(0).getText(),  ctx.start.getLine());
                SemanticCheck.sameScopeRepeat(symbol, ctx.start.getLine(), Scope.getCurrentScope().getId());
            }
            for (int i = 0; i < ctx.IDENTIFIERNAME().size(); i++) {
                declaration.addID(ctx.IDENTIFIERNAME(i).getText());
                Symbol symbol = Symbol.createSymbol(Objects.requireNonNull(Scope.getCurrentScope()).getId(), "Variable", declaration.getType().toString(), ctx.IDENTIFIERNAME(i).getText(), ctx.start.getLine());
                SemanticCheck.sameScopeRepeat(symbol, ctx.start.getLine(), Scope.getCurrentScope().getId());
            }
        }
        return declaration;
    }

    @Override
    public Node visitLiteralAssignment(ReactParser.LiteralAssignmentContext ctx) {
//        System.out.println("Literal Assignment From Visitor");
        literalAssignment assignment = new literalAssignment();
//        String nodeName = ctx.getClass().getSimpleName();
//        assignment.setAstNode(lastParent, ctx.start.getLine(), nodeName.substring(0, nodeName.length() - 7));
//        Identifier ID = new Identifier();
//        ID.setID(ctx.IDENTIFIERNAME().get(0).getText());//
//        //        assignment.setID(ctx.IDENTIFIER().get(0).getText());
//        //lastParent = assignment;
//        assignment.setLiteral((ILiteral) visit(ctx.litral()));
//        if (ctx.DOT() != null) {
//            SemanticCheck.NotDefineInCurrentScope(ctx.IDENTIFIERNAME().get(0).getText(), ctx.start.getLine(), Scope.getCurrentScope().getId());
//            ID.setDotID(ctx.IDENTIFIERNAME().get(1).getText());
//            assignment.setID(ID);
//        }
//
//        if (ctx.DOT() == null) {
//            assignment.setID(ID);
//            Scope scop = Scope.getCurrentScope().searchForSymbolInParents(assignment.getID().getID());
//            System.out.println(scop.getName());
//            Symbol sy = scop.searchForSymbol(assignment.getID().getID());
//            if (sy != null) {
//                SemanticCheck.checktypes(sy, (Node) assignment.getLiteral(), ctx.start.getLine());
//            }
//        }
        return assignment;
    }


    @Override
    public Node visitExpsionAssignment(ReactParser.ExpsionAssignmentContext ctx) {
        return new ExpressionAssignment(ctx.IDENTIFIERNAME().getText(), (Expression) visitExpression(ctx.expression()));
    }

    @Override
    public Node visitExpression(ReactParser.ExpressionContext ctx) {
        return  new Expression((operation) visit(ctx.operation()));

    }

    @Override
    public Node visitType(ReactParser.TypeContext ctx) {
      return new type(ctx.getStart().getText());
    }



}
