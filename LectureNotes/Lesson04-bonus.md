
Utilities Package
The reason of using utilities:
1.to make our code more reusable
2.easy to maintenance
(in the future if you wanna change something instead of going each class you will only change from utilities)
3.Reduce typing of same codes over and over


7-cssSelector
it has own syntax
common methods that you can use for css

1- tagname[attribute='value']
2- tagname.value --> . means in css locator className

3-tagname#value # means id in css

--you can also go from parent to child
div[class='er4g'] > a

8-xpath
2 type xpath : Absolute and Relative

        1-Absolute Xpath
        -start with /
        -you need to start top parent (beginning of html code)
        -it is not useful because it takes from very top from to child

        html
            head
            body
                div
                div
                    div
                        a
                    div
                div
                div
            body
            head
        html

        for ex : /html/body/div/div/a
                 /html/body/div

        if you have siblings you can use [number]. it will pick the siblings for you
                         /html/body/div[2]

2-relative xpath
-- starts with //
-- double // allows you to locate your webelement from anywhere in html code.
--more useful when we compare for absolute xpath because you can start anywhere in html code


some syntax of using relative xpath

1-//tagname[@attribute='value']-- looks for tagname attribute and value
2-//tagname[contains(@attribute, 'value') --locate webelemnt  with the given value if contains
3-//tagname[.='text'] --looks for exact text match for any attribute

ex :

        <div class="est">
            <a class "def" href="www.google.com">
         div

         tagname div
         attribute class
         attribute value est




Implicit wait
--An implicit wait is tell webdriver to pool the html code for a certain amount of time
when you trying to findelement
--if page is loaded immediately it wont wait up to given second.
--type of selenium waits

findElements() method
•This method is used to find more than one webElement
•Return type:List <WebElement>
•If it cannot find a webElement:
•Does NOT throw exception.
•Only returns an empty list.

How do we go from parent to child using xpath?
-->ex:	Locating anchor tag by its parent using xpath.

	//div[@id='hello'] --> this is locating the div
	//div[@id='hello']/a --> this is now locating the anchor tag using its parent

How do we go from CHILD TO PARENT using xpath?
- When we want to go from child to parent: /..
//a[@class='ghju']/..  this will locate the parent of a tag
//xpath has ability to go from child to parent
//to be able to go from child to parent you will need to use /..

" Selenium Methods:
-getTitle()
-navigate()
-getText()
-sendKeys()
-getCurrentUrl()
-getAttribute()
-getPageSource()
-getClass()
-findElement(By, by)
-click()
-findElements(By, by)
-isEnabled()
-close() and quit()"
-isDisplayed()
isSelected()