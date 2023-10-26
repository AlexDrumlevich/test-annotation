package telran.annotation.examples;

import telran.test.TestRunner;

public class TestClassAppl {

	public static void main(String[] args) {
		TestClass testObject = new TestClass();
		TestRunner testRunner = new TestRunner(testObject);
		testRunner.run();

	}

}
