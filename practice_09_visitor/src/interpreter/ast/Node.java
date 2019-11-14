package interpreter.ast;

import interpreter.visitor.Visitor;

public interface Node {
	Object accept(Visitor v, Object param);
}
