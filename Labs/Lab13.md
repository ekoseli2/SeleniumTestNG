## POM TestNG Final Test
1) Go to Guru99 Demo Site http://demo.guru99.com/V4/
2) In Login page check text "Guru99 Bank" is present
3) Login into application with given credentials(you need to enter your email in order to get credentials in advance)
4) Verify that the Home page contains text as "Manger Id: mngr368294"
5) Click on new customer button and verify you are in New Customer Entry Page
6) Fill the information for new customer
7) Verify new customer added sucessfully

## Pages : In this task you will need to create 3 page classes
- First class for the login page where you need to locate each web element: 
  1) username box 
  2) password box 
  3) Login button 
  4) Guru99 Bank text 
- The second page is for the home page. Locate the following web elements:
  1) Manager Id text
- Third page is for New Customer Entry Page. Locate the following customer information boxes:
  1) name
  2) address
  3) gender
  4) email
  5) password, etc.
  
## Configuration File
Store the following values:
  - Username 
  - Password
  - Url
        
## Utilities
Use your existing utils such as propertiesreader utils, driver utils, and browser utils

## Base
Use your existing base test classes.
        
## Testing Criteria
- while testing first you will verify "Guru99 Bank" is present
- then you need to log into the application
- next verify Home page contains text "Manager Id: mngr368294"
- click on new customer tab 
- verify title contains "New Customer Entry Page"
- fill all necessary information in to be able to create a customer 
- verify the message: "Customer Registered Successfully"