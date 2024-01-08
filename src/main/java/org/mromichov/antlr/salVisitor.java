package org.mromichov.antlr;// Generated from D:/IdeaProjects/TestSchoolAlgorithmicLanguage/src/sal.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link salParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface salVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link salParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(salParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(salParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(salParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link salParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(salParser.ValueContext ctx);
}