# Lesson 1

### Things to pay attention to:

#### Pom.xml

- *Java version is the same as the one you have configured your project with in your IDE. Here it is set as "17", if you have version 1.8, set as "8"

- Here your dependencies are set to "borrow" code from the Maven repository. This will give you access to some methods and classes that aren't normally there.

- Frequently update your Maven repository by pressing the little refresh icon in the Maven ribbon.
  
#### src/test/java/firstCode/mainSelenium.java

- *If your google chrome isn't working, feel free to change the browser to Edge or Firefox for the test. Simply replace the word chrome with edge.

- Use the run button at the TOP ribbon for the default run configuration which should work just fine.

- WebDriver class used to control the web browser using your code in this project.

- WebDriver.get("URL") method. Pay close attention to the actions performed by this method.
  
What should happen:

Your browser should open the website all by itself