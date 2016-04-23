/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.yura.domination.engine.core;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Matthew
 */
public class TestRunner {
    public static void main(String[] args) {
	Result result = JUnitCore.runClasses(

	);
	for (Failure failure : result.getFailures()) {
	    System.out.println("Failure: " + failure.toString());
	}
	System.out.println(result.wasSuccessful());
    }
}
