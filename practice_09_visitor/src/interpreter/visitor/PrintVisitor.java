package interpreter.visitor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import interpreter.ast.nodes.Program;
import interpreter.ast.nodes.expressions.*;
import interpreter.ast.nodes.statements.*;

public class PrintVisitor implements Visitor {
	private BufferedReader console;
	private HashMap<String, Integer> values;

	public PrintVisitor() {
		console = new BufferedReader(new InputStreamReader(System.in));
		values = new HashMap<>();
	}

	@Override
	public Object visit(Program program, Object param) {
		for (Statement sent : program.statements)
			sent.accept(this, param);
		return null;
	}

	@Override
	public Object visit(Read read, Object param) {
		try {
			System.out.print("Introduzca " + read.variable.name + ": ");
			int value = Integer.parseInt(console.readLine());
			values.put(read.variable.name, value);
		} catch (NumberFormatException e) {
			System.out.println("Debe introducir número entero");
		} catch (IOException e) {
			System.out.println(
					"Se produjo un error al leer el valor de la variable");
		}
		return null;
	}

	@Override
	public Object visit(Print print, Object param) {
		Object object = print.expression.accept(this, param);
		System.out.println(object);
		return null;
	}

	@Override
	public Object visit(Assignment assignment, Object param) {
		String name = assignment.variable.name;
		int value = (int) assignment.expression.accept(this, param);
		values.put(name, value);
		return null;
	}

	@Override
	public Object visit(IntegerLiteral integerLiteral, Object param) {
		return Integer.parseInt(integerLiteral.value);
	}

	@Override
	public Object visit(Division division, Object param) {
		int left = (int) division.left.accept(this, param);
		int right = (int) division.right.accept(this, param);
		return left / right;
	}

	@Override
	public Object visit(Sum sum, Object param) {
		int left = (int) sum.left.accept(this, param);
		int right = (int) sum.right.accept(this, param);
		return left + right;
	}

	@Override
	public Object visit(Variable variable, Object param) {
		return values.get(variable.name);
	}

	@Override
	public Object visit(Product product, Object param) {
		int left = (int) product.left.accept(this, param);
		int right = (int) product.right.accept(this, param);
		return left * right;
	}

}
