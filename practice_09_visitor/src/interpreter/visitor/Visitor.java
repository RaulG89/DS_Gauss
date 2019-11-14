package interpreter.visitor;

import interpreter.ast.nodes.Program;
import interpreter.ast.nodes.expressions.Division;
import interpreter.ast.nodes.expressions.IntegerLiteral;
import interpreter.ast.nodes.expressions.Product;
import interpreter.ast.nodes.expressions.Sum;
import interpreter.ast.nodes.expressions.Variable;
import interpreter.ast.nodes.statements.Assignment;
import interpreter.ast.nodes.statements.Print;
import interpreter.ast.nodes.statements.Read;

public interface Visitor {
	Object visit(Program program, Object param);

	Object visit(Read read, Object param);

	Object visit(Print print, Object param);

	Object visit(Assignment assignment, Object param);

	Object visit(IntegerLiteral integerLiteral, Object param);

	Object visit(Division division, Object param);

	Object visit(Sum sum, Object param);

	Object visit(Variable variable, Object param);

	Object visit(Product product, Object param);
}
