
# What is TestNG?
-> TestNG is a unit testing tool that allows us create flow using Annotations.
-> First we create methods, then we use TestNG annotations to create running flow.
- We decide which method is test by typing @Test
- Which method runs before tests
- Which method runs after tests ...

###	-> Annotations are a way of controlling the flow of the test.

@Test annotation:
-> Which allows us to run those methods(tests) without main method.

@BeforeMethod:
	-> Makes the annotated method run before each @Test method.
	-> Usually used for setting up conditions, getting browsers, and pages.

driver.get("");
	-maximize
	-implicit wait


@AfterMethod:
	-> After method makes the method run AFTER each @Test method.
	-> Usually used to close things down such as closing the browser

@BeforeClass:
	-> BeforeClass makes the annotated method run ONCE before all of test, before method in the class.
	-> Used for setting up environments, opening browsers etc.

@AfterClass:
	-> After class makes the annotated method run once after the tests in the class.


!!!!NOTE ===  If you are copy pasting from my code make sure to import from correct dependency which is testNG option


ASSERTIONS:
-> Assertions are coming from TestNG
-> Assertions allows us to do our verification for our test cases

-> You can pass an additional argument into assertion methods just to provide additional information about what failed.
 // to be able to print on the console

--> assertEquals :
- This method expected two arguments to be passed: actual, expected.
- It compares these two values and if they are exact match, it will pass.

--> assertTrue :
- This method expects you to pass a boolean value. Or you have to pass a method that returns a boolean value.
- If the boolean value is TRUE, it will pass. If not it will fail.

--> assertFalse :
- This method expects you to pass a boolean value.
- If the boolean value is FALSE, IT WILL PASS. If not, it will fail.

--> If you assertion fails, it will stop running for the current test in the same line where it failed.
It will move to the next test. And start running that one.


How to ignore a test?
1- Add @Ignore on top of the test.


In what order the tests are running if we have multiple tests?
-> By default tests are running in alphabetical order. (Case sensitive capitals come first)

priority => You can change the running order using priority.
	 - We can change the priority which will change the running order of the tests

=======================