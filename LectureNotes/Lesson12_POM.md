# Page Object Model Design Pattern

Page Object Model (POM) is a design pattern, popularly used in test automation
that creates Object Repository for web UI elements (user interface; which is what you see on the webpage).
The advantage of the model is that it reduces code duplication and improves test maintenance.

- Under this model, for each web page in the application, there should be a Page Class.
- This Page class will identify the WebElements of that web page and
- also contains Page methods which perform steps with those WebElements.
- Name of these methods should be given as per the task they are performing,
- i.e., if a loading the page,  class name will be login page ,POM method name can be login()

IN POM Design you need to have some structure for each page :
1. PageFactory.initElements(driver, this); 
      - It creates connection in between driver and object of the class.
2. @FindBy annotation to locate webElements.
      - Using this FindBy annotation, helps us to locate web elements.
3. Create methods related webelements

### Why Page Object Model?  (REUSABLE, READABLE and MAINTAINABLE. )
- In the future, if there is a change in the web element,
you need to make the change in just one class file and not 10 different scripts.
- That is achieved with POM and it makes code REUSABLE, READABLE and MAINTAINABLE.

For example, in the home page of the web application,
I have a menu bar which leads to different modules with different features.
While performing automation testing, many test cases would be clicking through these menu buttons to execute specific tests.
Now assume that the User Interface is CHANGED and all the menu buttons are relocated to a different position in the home page.
So, this will result in automation tests to fail. Automated test cases will fail as scripts will not be able to find particular element-locators to perform an action.
Now, QA Engineer needs to walk through the whole code to update locators where necessary.
CHANGING the element-locators in the duplicated code will consume a lot of time to only adjust locators.
> Here, you can save this time by using the Page Object Model in our test automation framework.

### Key Takeaways:
1) We don't want to store any locators in the utilities or test classes
2) In the utilities package you will continue to create 'generic' common methods such as driver and browser utilities