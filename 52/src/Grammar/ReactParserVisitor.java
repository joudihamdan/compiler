// Generated from C:/Users/USER/Desktop/New folder/52/code/52/src/Grammar/ReactParser.g4 by ANTLR 4.13.1
package Grammar;


import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReactParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReactParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ReactParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#withHooks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithHooks(ReactParser.WithHooksContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#hooks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHooks(ReactParser.HooksContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#usestate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsestate(ReactParser.UsestateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#useRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseRef(ReactParser.UseRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#useEffect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseEffect(ReactParser.UseEffectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport(ReactParser.ExportContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(ReactParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link ReactParser#litral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(ReactParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link ReactParser#litral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(ReactParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements(ReactParser.ElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(ReactParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#singlecomponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglecomponent(ReactParser.SinglecomponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionalcomponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionalcomponent(ReactParser.FunctionalcomponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrowcomponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowcomponent(ReactParser.ArrowcomponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentBody(ReactParser.ComponentBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#openbraces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenbraces(ReactParser.OpenbracesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxElements(ReactParser.JsxElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#componentcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentcall(ReactParser.ComponentcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#openTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenTag(ReactParser.OpenTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#closeTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseTag(ReactParser.CloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#selfclosing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfclosing(ReactParser.SelfclosingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code text}
	 * labeled alternative in {@link ReactParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(ReactParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiattribute}
	 * labeled alternative in {@link ReactParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiattribute(ReactParser.MultiattributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dotattribute}
	 * labeled alternative in {@link ReactParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotattribute(ReactParser.DotattributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalttribute}
	 * labeled alternative in {@link ReactParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualttribute(ReactParser.EqualttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectatrribute}
	 * labeled alternative in {@link ReactParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectatrribute(ReactParser.SelectatrributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionattribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionattribute(ReactParser.FunctionattributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(ReactParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(ReactParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#tagContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagContent(ReactParser.TagContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(ReactParser.StyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#styleAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleAttributes(ReactParser.StyleAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ReactParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#constfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstfunction(ReactParser.ConstfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(ReactParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(ReactParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForloop(ReactParser.ForloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#elseIf_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIf_condition(ReactParser.ElseIf_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#else_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_condition(ReactParser.Else_conditionContext ctx);
	/**
	 * Visit a parse tree produced by .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(ReactParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ReactParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalAssignment}
	 * labeled alternative in {@link ReactParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralAssignment(ReactParser.LiteralAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAssignment}
	 * labeled alternative in {@link ReactParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAssignment(ReactParser.ExpressionAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ReactParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ReactParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ReactParser.StatementContext ctx);
}