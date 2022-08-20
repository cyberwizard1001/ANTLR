// Generated from C:/Users/nirma/IdeaProjects/antlr_parser/src\Parse.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParseParser}.
 */
public interface ParseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParseParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(ParseParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParseParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(ParseParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParseParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(ParseParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParseParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(ParseParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParseParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ParseParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParseParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ParseParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParseParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(ParseParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParseParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(ParseParser.FactorContext ctx);
}