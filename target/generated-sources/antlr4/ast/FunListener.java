// Generated from Fun.g4 by ANTLR 4.4

package ast;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunParser}.
 */
public interface FunListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code assn}
	 * labeled alternative in {@link FunParser#com}.
	 * @param ctx the parse tree
	 */
	void enterAssn(@NotNull FunParser.AssnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assn}
	 * labeled alternative in {@link FunParser#com}.
	 * @param ctx the parse tree
	 */
	void exitAssn(@NotNull FunParser.AssnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code proccall}
	 * labeled alternative in {@link FunParser#com}.
	 * @param ctx the parse tree
	 */
	void enterProccall(@NotNull FunParser.ProccallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code proccall}
	 * labeled alternative in {@link FunParser#com}.
	 * @param ctx the parse tree
	 */
	void exitProccall(@NotNull FunParser.ProccallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunParser#actual}.
	 * @param ctx the parse tree
	 */
	void enterActual(@NotNull FunParser.ActualContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunParser#actual}.
	 * @param ctx the parse tree
	 */
	void exitActual(@NotNull FunParser.ActualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code proc}
	 * labeled alternative in {@link FunParser#proc_decl}.
	 * @param ctx the parse tree
	 */
	void enterProc(@NotNull FunParser.ProcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code proc}
	 * labeled alternative in {@link FunParser#proc_decl}.
	 * @param ctx the parse tree
	 */
	void exitProc(@NotNull FunParser.ProcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link FunParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(@NotNull FunParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link FunParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(@NotNull FunParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link FunParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBool(@NotNull FunParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link FunParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBool(@NotNull FunParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funccall}
	 * labeled alternative in {@link FunParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void enterFunccall(@NotNull FunParser.FunccallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funccall}
	 * labeled alternative in {@link FunParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void exitFunccall(@NotNull FunParser.FunccallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var}
	 * labeled alternative in {@link FunParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull FunParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var}
	 * labeled alternative in {@link FunParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull FunParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link FunParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void enterNum(@NotNull FunParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link FunParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void exitNum(@NotNull FunParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link FunParser#com}.
	 * @param ctx the parse tree
	 */
	void enterFor(@NotNull FunParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link FunParser#com}.
	 * @param ctx the parse tree
	 */
	void exitFor(@NotNull FunParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code false}
	 * labeled alternative in {@link FunParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void enterFalse(@NotNull FunParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code false}
	 * labeled alternative in {@link FunParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void exitFalse(@NotNull FunParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link FunParser#com}.
	 * @param ctx the parse tree
	 */
	void enterWhile(@NotNull FunParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link FunParser#com}.
	 * @param ctx the parse tree
	 */
	void exitWhile(@NotNull FunParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prog}
	 * labeled alternative in {@link FunParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull FunParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prog}
	 * labeled alternative in {@link FunParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull FunParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link FunParser#type}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull FunParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link FunParser#type}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull FunParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formal}
	 * labeled alternative in {@link FunParser#formal_decl}.
	 * @param ctx the parse tree
	 */
	void enterFormal(@NotNull FunParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formal}
	 * labeled alternative in {@link FunParser#formal_decl}.
	 * @param ctx the parse tree
	 */
	void exitFormal(@NotNull FunParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link FunParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(@NotNull FunParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link FunParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(@NotNull FunParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code func}
	 * labeled alternative in {@link FunParser#proc_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunc(@NotNull FunParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code func}
	 * labeled alternative in {@link FunParser#proc_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunc(@NotNull FunParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunParser#sec_expr}.
	 * @param ctx the parse tree
	 */
	void enterSec_expr(@NotNull FunParser.Sec_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunParser#sec_expr}.
	 * @param ctx the parse tree
	 */
	void exitSec_expr(@NotNull FunParser.Sec_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code true}
	 * labeled alternative in {@link FunParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void enterTrue(@NotNull FunParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code true}
	 * labeled alternative in {@link FunParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void exitTrue(@NotNull FunParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull FunParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull FunParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link FunParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull FunParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link FunParser#prim_expr}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull FunParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link FunParser#com}.
	 * @param ctx the parse tree
	 */
	void enterIf(@NotNull FunParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link FunParser#com}.
	 * @param ctx the parse tree
	 */
	void exitIf(@NotNull FunParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code seq}
	 * labeled alternative in {@link FunParser#seq_com}.
	 * @param ctx the parse tree
	 */
	void enterSeq(@NotNull FunParser.SeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code seq}
	 * labeled alternative in {@link FunParser#seq_com}.
	 * @param ctx the parse tree
	 */
	void exitSeq(@NotNull FunParser.SeqContext ctx);
}