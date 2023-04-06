## WEBDRIVERWAIT CLASS (Explicitly Wait) 20 seconds
	-> We use explicit wait If we are waiting for some specific web element or action to happen.
	- This will wait up to a duration like implicitly wait. If condition occurs on the third second wait will wait for 3 seconds
	and not the entire duration we defined as the wait time.
	- After 20 seconds TimeOutException will be thrown if condition does not occur

Conditions:
alertIsPresent()
elementSelectionStateToBe()
elementToBeClickable()
elementToBeSelected()
frameToBeAvaliableAndSwitchToIt()
invisibilityOfTheElementLocated()
invisibilityOfElementWithText()
presenceOfAllElementsLocatedBy()
presenceOfElementLocated()
textToBePresentInElement()
textToBePresentInElementLocated()
textToBePresentInElementValue()
titleIs()
titleContains()
visibilityOf()
visibilityOfAllElements()
visibilityOfAllElementsLocatedBy()
visibilityOfElementLocated()



## What Is TestNG.Xml?
TestNG.xml file is a configuration file that helps in organizing our tests.
It allows testers to create and handle multiple test classes, define test suites and tests.

It makes a tester’s job easier by controlling the execution of tests by putting all the test cases together
and run it under one XML file. This is a beautiful concept, without which, it is difficult to work in TestNG.

Advantages Of TestNG.xml
Major advantages of TestNG.xml file are:

It provides parallel execution of test methods.
It allows the dependency of one test method on another test method.
It helps in prioritizing our test methods.
It allows grouping of test methods into test groups.
It has different types of HTML reports, Extent reports, etc. for a better and clear understanding of our test summary.
It has listeners who help in creating logs.

Concepts Used In TestNG.xml
#1) A Suite is represented by one XML file. It can contain one or more tests and is defined by the <suite> tag.

Example: <suite name=”Testing Google Apps”>

#2) A Test is represented by <test> and can contain one or more TestNG classes.

Example: <test name=”Regression”>

#3) A Class is a Java class that contains TestNG annotations. Here it is represented by the <class> tag and can contain one or more test methods.

Example

<classes>
<class name="Googletest.GmailTest"/>
<class name="Googletest.MapsTest"/>
<class name="Googletest.ImagesTest"/>
</classes>