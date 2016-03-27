// Generated from /home/guilherme/Personal/Projects/educodar/src/main/resources/educodar/Educodar.g4 by ANTLR 4.5.1
package educodar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EducodarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EducodarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EducodarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(EducodarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link EducodarParser#routesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutesBlock(EducodarParser.RoutesBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link EducodarParser#routeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouteDef(EducodarParser.RouteDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link EducodarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(EducodarParser.ExpressionContext ctx);
}