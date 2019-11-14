package interpreter.ast.nodes.statements;

import interpreter.ast.nodes.expressions.Expression;
import interpreter.ast.nodes.expressions.Variable;
import interpreter.visitor.Visitor;

public class Assignment implements Statement {
	public Variable variable;
	public Expression expression;

	public Assignment(Variable variable, Expression expression) {
		this.variable = variable;
		this.expression = expression;
	}

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}
}
