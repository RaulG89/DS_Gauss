package interpreter.ast.nodes.statements;

import interpreter.ast.nodes.expressions.Variable;
import interpreter.visitor.Visitor;

public class Read implements Statement {
	public Variable variable;

	public Read(Variable variable) {
		this.variable = variable;
	}

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}
	

}
