package studio5;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import studio5.tests.ArrayMeanTestSuite;
import studio5.tests.ArraySumTestSuite;
import studio5.tests.DistanceBetweenTest;
import studio5.tests.FilledArraySumAndMeanComprehensiveTest;
import studio5.tests.FilledArrayTestSuite;
import studio5.tests.SubstituteAllTestSuite;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ DistanceBetweenTest.class, SubstituteAllTestSuite.class, ArraySumTestSuite.class,
		FilledArrayTestSuite.class, ArrayMeanTestSuite.class, FilledArraySumAndMeanComprehensiveTest.class })
public class MethodsTestSuite {
	public static double distanceBetween(double x1, double y1, double x2, double y2) {
		// FIXME: Hint use Math methods (e.g. Math.sqrt) to compute the distance
		double xdistance = (x2-x1)*(x2-x1);
		double ydistance = (y2-y1)*(y2-y1);
		double distance = Math.sqrt(xdistance+ydistance);
		
		return distance;
	}


}
