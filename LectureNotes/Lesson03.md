# Locators :
They are helping us to locate any webelement that you see on the webpage
8 different locators in selenium are:
1. name
2. linktext
3. partiallinktext
4. id
5. classname
6. tagname
7. css
8. xpath

## 1) Name:
This locator will be looking into the whole HTML code and return the webelement with matching name attribute value
- this one fill find and return the first webelemt it finds.
- syntax : driver.findElement(By.name("name attribute value")).

## 2) Linktext (equals the text)
- this locater allows us to locate links by their text
- this locater will only works if webelement has links
How do i understand if the webelemt has links ?
<a href="https//www.amazon.com"> Text amazon </a>
Tagname --> a
Attribute --> href
Atrribute Value https//www.amazon.com
Link text -- Text amazon

syntax : driver.findElement(By.linktext("Text amazon"));

## 3) Partiallinktext (contain the text)
- This locater allows us to locate links by their text  but it doesnt need exact match for text
- Syntax : driver.findElement(By.partialLinktext("amazon"));

To Search something in html
- For mac click command+F
- For windows ctrl+F


## 4) id
- id will locate by matching id attribute's value.
- id is unique for the specific webelement
- if you have id and its not dynamic you should always use id .
- dynamic (when you refresh if you see id value is changing that means id is dynamic )
- syntax : driver.findElement(By.id("id attribute value"));

## 5) className :
--className is not unique, that's why it might have multiple values of the same attribute
--and it will return you the first one it finds
syntax : driver.findElement(By.className("class attribute value"));