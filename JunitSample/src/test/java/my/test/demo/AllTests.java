package my.test.demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArraysCompareTest.class, QuickBeforeAfterTest.class,
		StringHelperParameterizedBooleanTest.class,
		StringHelperParameterizedTest.class, StringHelperTest.class })
public class AllTests {

}
