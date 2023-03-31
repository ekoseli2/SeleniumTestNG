## What is hardcoding?
- hardcoding means passing every data inside of class without using any utils or files
- if you hard code, to be able to change the test data
- you have to go to each test and change the data from there

### Data Driven Testing is running the same test against different data.
- instead of hardcoding tes data inside of test
- We created a properties file and we keep our test data in the file.
- DataProvider Annotation

PropertiesReading utility class
-  to be able to read from .properties type of file, we created util class.
- steps to read from properties file:
1) Creating the object from Properties class
Properties properties = new Properties();
2) We need to OPEN the file in
FileInputStream file = new FileInputStream("path");
3) We need to load the file to properties object.
properties.load(file);
4) We close the previously opened file
file.close();
//by hiding properties object and getting this object in the getter method is
basically an example of encapsulation

--> JavaScriptExecutor :
for some actions that selenium that able to handle

	-JavaScriptExecutor is an Interface that helps to execute JavaScript through Selenium Webdriver.
	-JavaScriptExecutor provides two methods "executescript" & "executeAsyncScript"
	to run javascript on the selected window or current page.
	-This method executes JavaScript in the context of the currently selected frame or window in Selenium.

	JavaScriptExecutor:

	1- We create javascriptExecutor object and we cast our WebDriver type instance into JavascriptExecutor type.
    JavascriptExecutor js = (JavascriptExecutor) driver;

    2- Then we have access to the methods that are coming from JavascriptExecutor interface.
    js.executeScript(Script,Arguments);

    For arguments scrooldown , click ,window.open etc..
    -- you will prefer to use when you are not able to do some actions with selenium

Scroll in Selenium?
- with selenium itself you are not able to scroll in the page you need the _JSExecutor_