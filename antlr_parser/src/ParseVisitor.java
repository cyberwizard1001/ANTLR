// Generated from C:/Users/nirma/IdeaProjects/antlr_parser/src\Parse.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParseParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParseVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParseParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(ParseParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParseParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(ParseParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParseParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(ParseParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParseParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(ParseParser.FactorContext ctx);
}