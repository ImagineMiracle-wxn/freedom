// Generated from /home/imaginemiracle/Downloads/freedom/rocket-chip/firrtl/src/main/antlr4/FIRRTL.g4 by ANTLR 4.7.1
package firrtl.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FIRRTLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FIRRTLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#circuit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCircuit(FIRRTLParser.CircuitContext ctx);
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(FIRRTLParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(FIRRTLParser.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#dir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDir(FIRRTLParser.DirContext ctx);
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(FIRRTLParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(FIRRTLParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#defname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefname(FIRRTLParser.DefnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(FIRRTLParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#moduleBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleBlock(FIRRTLParser.ModuleBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#simple_reset0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_reset0(FIRRTLParser.Simple_reset0Context ctx);
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#simple_reset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_reset(FIRRTLParser.Simple_resetContext ctx);
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#reset_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReset_block(FIRRTLParser.Reset_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(FIRRTLParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#memField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemField(FIRRTLParser.MemFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(FIRRTLParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(FIRRTLParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#when}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen(FIRRTLParser.WhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfo(FIRRTLParser.InfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#mdir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMdir(FIRRTLParser.MdirContext ctx);
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#ruw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuw(FIRRTLParser.RuwContext ctx);
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(FIRRTLParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(FIRRTLParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#fieldId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldId(FIRRTLParser.FieldIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#intLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLit(FIRRTLParser.IntLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#keywordAsId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordAsId(FIRRTLParser.KeywordAsIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FIRRTLParser#primop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimop(FIRRTLParser.PrimopContext ctx);
}