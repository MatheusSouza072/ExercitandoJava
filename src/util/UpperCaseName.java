package util;

import java.util.function.Function;

import entities.LambdaProductThree;

public class UpperCaseName implements Function<LambdaProductThree, String> {

	@Override
	public String apply(LambdaProductThree p) {
		return p.getName().toUpperCase();
	}
}