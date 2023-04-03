## DRIVER UTILITY

- initialize the driver without coding too many line for each class
- Being able to pass the same driver instance when calling methods from other classes

## Singleton Design pattern in DriverUtil:
1) We create a private constructor, and we also create a getter method
	to allow users to create the instance of this class from getter.
2) You cannot create an object of that class because you made a Private Constructor
    - there will be always one instance of driver with singleton design pattern
    - we aim to achieve our goal from one instance of the webdriver

Example : https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm

## Headless browser:
- The headless browser is a special web browser that does not open any visual elements
- As a result, it will:
  1) Execute tests much faster than the normal "<HEAD>ed" browser
  2) You cannot visually observe your test behavior anymore
  3) As a result headless browsing is great for intermediate and advanced testers


## ACTIONS:
Actions class is a collection of individual Action that you want to perform.
- Actions class allows us to handle mouse and keyboard actions on the web pages (like JavaScript).
  - For Example :
    - hover over : moveToElement
    - right click: contextClick
    - dragAndDrop: allows us to drag and drop a web element
    - clickAndHold: clicks onto something and waits for next command
    - release :
      1) To get Actions methods, we need to create the instance of the actions class.
      2) And pass the driver instance into the constructor.
      3) We must use : perform() method at the end to be able to perform any Actions method.