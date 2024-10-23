// Generated from HTWGLoxParser.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTWGLoxParser}.
 */
public interface HTWGLoxParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HTWGLoxParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HTWGLoxParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(HTWGLoxParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(HTWGLoxParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl(HTWGLoxParser.Func_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl(HTWGLoxParser.Func_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(HTWGLoxParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(HTWGLoxParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(HTWGLoxParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(HTWGLoxParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#typed_name}.
	 * @param ctx the parse tree
	 */
	void enterTyped_name(HTWGLoxParser.Typed_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#typed_name}.
	 * @param ctx the parse tree
	 */
	void exitTyped_name(HTWGLoxParser.Typed_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(HTWGLoxParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(HTWGLoxParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HTWGLoxParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HTWGLoxParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(HTWGLoxParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(HTWGLoxParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(HTWGLoxParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(HTWGLoxParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(HTWGLoxParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(HTWGLoxParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(HTWGLoxParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(HTWGLoxParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(HTWGLoxParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(HTWGLoxParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(HTWGLoxParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(HTWGLoxParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#block_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBlock_stmt(HTWGLoxParser.Block_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#block_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBlock_stmt(HTWGLoxParser.Block_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HTWGLoxParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HTWGLoxParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#bool_or_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_or_expr(HTWGLoxParser.Bool_or_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#bool_or_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_or_expr(HTWGLoxParser.Bool_or_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#bool_and_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_and_expr(HTWGLoxParser.Bool_and_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#bool_and_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_and_expr(HTWGLoxParser.Bool_and_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#equality_expr}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expr(HTWGLoxParser.Equality_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#equality_expr}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expr(HTWGLoxParser.Equality_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#comparison_expr}.
	 * @param ctx the parse tree
	 */
	void enterComparison_expr(HTWGLoxParser.Comparison_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#comparison_expr}.
	 * @param ctx the parse tree
	 */
	void exitComparison_expr(HTWGLoxParser.Comparison_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#term_expr}.
	 * @param ctx the parse tree
	 */
	void enterTerm_expr(HTWGLoxParser.Term_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#term_expr}.
	 * @param ctx the parse tree
	 */
	void exitTerm_expr(HTWGLoxParser.Term_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#factor_expr}.
	 * @param ctx the parse tree
	 */
	void enterFactor_expr(HTWGLoxParser.Factor_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#factor_expr}.
	 * @param ctx the parse tree
	 */
	void exitFactor_expr(HTWGLoxParser.Factor_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#negation_expr}.
	 * @param ctx the parse tree
	 */
	void enterNegation_expr(HTWGLoxParser.Negation_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#negation_expr}.
	 * @param ctx the parse tree
	 */
	void exitNegation_expr(HTWGLoxParser.Negation_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void enterCall_expr(HTWGLoxParser.Call_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void exitCall_expr(HTWGLoxParser.Call_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(HTWGLoxParser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(HTWGLoxParser.Arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expr(HTWGLoxParser.Primary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expr(HTWGLoxParser.Primary_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#grouping_expr}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_expr(HTWGLoxParser.Grouping_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#grouping_expr}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_expr(HTWGLoxParser.Grouping_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTWGLoxParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(HTWGLoxParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTWGLoxParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(HTWGLoxParser.LiteralContext ctx);
}