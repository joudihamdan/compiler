// Generated from C:/Users/USER/Desktop/New folder/52/code/52/src/Grammar/ReactParser.g4 by ANTLR 4.13.1
package Grammar;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReactParser}.
 */
public interface ReactParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ReactParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ReactParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#withHooks}.
	 * @param ctx the parse tree
	 */
	void enterWithHooks(ReactParser.WithHooksContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#withHooks}.
	 * @param ctx the parse tree
	 */
	void exitWithHooks(ReactParser.WithHooksContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#hooks}.
	 * @param ctx the parse tree
	 */
	void enterHooks(ReactParser.HooksContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#hooks}.
	 * @param ctx the parse tree
	 */
	void exitHooks(ReactParser.HooksContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#usestate}.
	 * @param ctx the parse tree
	 */
	void enterUsestate(ReactParser.UsestateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#usestate}.
	 * @param ctx the parse tree
	 */
	void exitUsestate(ReactParser.UsestateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#useRef}.
	 * @param ctx the parse tree
	 */
	void enterUseRef(ReactParser.UseRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#useRef}.
	 * @param ctx the parse tree
	 */
	void exitUseRef(ReactParser.UseRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#useEffect}.
	 * @param ctx the parse tree
	 */
	void enterUseEffect(ReactParser.UseEffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#useEffect}.
	 * @param ctx the parse tree
	 */
	void exitUseEffect(ReactParser.UseEffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#export}.
	 * @param ctx the parse tree
	 */
	void enterExport(ReactParser.ExportContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#export}.
	 * @param ctx the parse tree
	 */
	void exitExport(ReactParser.ExportContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(ReactParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(ReactParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link ReactParser#litral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(ReactParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link ReactParser#litral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(ReactParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link ReactParser#litral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(ReactParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link ReactParser#litral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(ReactParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(ReactParser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(ReactParser.ElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(ReactParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(ReactParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#singlecomponent}.
	 * @param ctx the parse tree
	 */
	void enterSinglecomponent(ReactParser.SinglecomponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#singlecomponent}.
	 * @param ctx the parse tree
	 */
	void exitSinglecomponent(ReactParser.SinglecomponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#functionalcomponent}.
	 * @param ctx the parse tree
	 */
	void enterFunctionalcomponent(ReactParser.FunctionalcomponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#functionalcomponent}.
	 * @param ctx the parse tree
	 */
	void exitFunctionalcomponent(ReactParser.FunctionalcomponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arrowcomponent}.
	 * @param ctx the parse tree
	 */
	void enterArrowcomponent(ReactParser.ArrowcomponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arrowcomponent}.
	 * @param ctx the parse tree
	 */
	void exitArrowcomponent(ReactParser.ArrowcomponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterComponentBody(ReactParser.ComponentBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitComponentBody(ReactParser.ComponentBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#openbraces}.
	 * @param ctx the parse tree
	 */
	void enterOpenbraces(ReactParser.OpenbracesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#openbraces}.
	 * @param ctx the parse tree
	 */
	void exitOpenbraces(ReactParser.OpenbracesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxElements}.
	 * @param ctx the parse tree
	 */
	void enterJsxElements(ReactParser.JsxElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxElements}.
	 * @param ctx the parse tree
	 */
	void exitJsxElements(ReactParser.JsxElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#componentcall}.
	 * @param ctx the parse tree
	 */
	void enterComponentcall(ReactParser.ComponentcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#componentcall}.
	 * @param ctx the parse tree
	 */
	void exitComponentcall(ReactParser.ComponentcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#openTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenTag(ReactParser.OpenTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#openTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenTag(ReactParser.OpenTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseTag(ReactParser.CloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseTag(ReactParser.CloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#selfclosing}.
	 * @param ctx the parse tree
	 */
	void enterSelfclosing(ReactParser.SelfclosingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#selfclosing}.
	 * @param ctx the parse tree
	 */
	void exitSelfclosing(ReactParser.SelfclosingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code text}
	 * labeled alternative in {@link ReactParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterText(ReactParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code text}
	 * labeled alternative in {@link ReactParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitText(ReactParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiattribute}
	 * labeled alternative in {@link ReactParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterMultiattribute(ReactParser.MultiattributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiattribute}
	 * labeled alternative in {@link ReactParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitMultiattribute(ReactParser.MultiattributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dotattribute}
	 * labeled alternative in {@link ReactParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterDotattribute(ReactParser.DotattributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dotattribute}
	 * labeled alternative in {@link ReactParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitDotattribute(ReactParser.DotattributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalttribute}
	 * labeled alternative in {@link ReactParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterEqualttribute(ReactParser.EqualttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalttribute}
	 * labeled alternative in {@link ReactParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitEqualttribute(ReactParser.EqualttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectatrribute}
	 * labeled alternative in {@link ReactParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterSelectatrribute(ReactParser.SelectatrributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectatrribute}
	 * labeled alternative in {@link ReactParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitSelectatrribute(ReactParser.SelectatrributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#functionattribute}.
	 * @param ctx the parse tree
	 */
	void enterFunctionattribute(ReactParser.FunctionattributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#functionattribute}.
	 * @param ctx the parse tree
	 */
	void exitFunctionattribute(ReactParser.FunctionattributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(ReactParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(ReactParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(ReactParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(ReactParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#tagContent}.
	 * @param ctx the parse tree
	 */
	void enterTagContent(ReactParser.TagContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#tagContent}.
	 * @param ctx the parse tree
	 */
	void exitTagContent(ReactParser.TagContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(ReactParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(ReactParser.StyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#styleAttributes}.
	 * @param ctx the parse tree
	 */
	void enterStyleAttributes(ReactParser.StyleAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#styleAttributes}.
	 * @param ctx the parse tree
	 */
	void exitStyleAttributes(ReactParser.StyleAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ReactParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ReactParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#constfunction}.
	 * @param ctx the parse tree
	 */
	void enterConstfunction(ReactParser.ConstfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#constfunction}.
	 * @param ctx the parse tree
	 */
	void exitConstfunction(ReactParser.ConstfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(ReactParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(ReactParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(ReactParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(ReactParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#forloop}.
	 * @param ctx the parse tree
	 */
	void enterForloop(ReactParser.ForloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#forloop}.
	 * @param ctx the parse tree
	 */
	void exitForloop(ReactParser.ForloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#elseIf_condition}.
	 * @param ctx the parse tree
	 */
	void enterElseIf_condition(ReactParser.ElseIf_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#elseIf_condition}.
	 * @param ctx the parse tree
	 */
	void exitElseIf_condition(ReactParser.ElseIf_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#else_condition}.
	 * @param ctx the parse tree
	 */
	void enterElse_condition(ReactParser.Else_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#else_condition}.
	 * @param ctx the parse tree
	 */
	void exitElse_condition(ReactParser.Else_conditionContext ctx);
	/**
	 * Enter a parse tree produced by .
	 * @param ctx the parse tree
	 */
	void enterIf(ReactParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by .
	 * @param ctx the parse tree
	 */
	void exitIf(ReactParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ReactParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ReactParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalAssignment}
	 * labeled alternative in {@link ReactParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterLiteralAssignment(ReactParser.LiteralAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalAssignment}
	 * labeled alternative in {@link ReactParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitLiteralAssignment(ReactParser.LiteralAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAssignment}
	 * labeled alternative in {@link ReactParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAssignment(ReactParser.ExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAssignment}
	 * labeled alternative in {@link ReactParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAssignment(ReactParser.ExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ReactParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ReactParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ReactParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ReactParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ReactParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ReactParser.StatementContext ctx);
}