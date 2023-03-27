
web tables in HTML?

tr --> stands for table row
<td> stands for table data
<th> --> stands for table header. just makes things centered and bold.

<table>
	<thead>
		<tr>
			<td></td>
			<td></td>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
		</tr>

	</tbody>

</table>




How do we handle web tables using Selenium webdriver?

	-> We create specific xpath locators to locate what we want to get from the table itself.


How do we handle web tables?
- By creating custom locators to get whatever I need to get from the table.
-> If I need to get the whole row, I create a locator that returns me the whole row.
-> If I need to get 1 single cell, I need to create a locator that returns me 1 single cell.


//table[@id='ctl00_MainContent_orderGrid']/tbody/tr

//table[@id='ctl00_MainContent_orderGrid']//tr

ALERTS
There are two types of alerts.
1- HTML Alerts:
-> How do we handle: We just locate just as another web element on the page.
-> Then we click.

	2- JavaScript Alerts:
	    --prompt,confirm box ,alert box

	HOW DO WE HANDLE ALERTS?
		-> Using Alerts.
		-> JS alerts are not part of the HTML structure. Therefore we need to switch the driver focus to the alert itself.
		1- Create an instance of Alert, then switch to alert.
		  		Alert alert = driver.switchTo().alert();
		2-  to accept, dismiss
			alert.accept();
			alert.dismiss();


IFRAMES

-> Iframes are basically <html> inside of another <html>
-> Selenium can only focus one thing at a time.
So we need to SWITCH driver's focus to the inner iframe to be able to perform any action with Selenium.
-> There are 3 ways to switch to iframes

	1- Locating as WebElement then using that webElement to switch.
	WebElement iframe = driver.findElement(LOCATOR);
	driver.switchTo.frame(iframe);

	2- Switching by index. We pass the index number of the frame.
	-> if you have more than one iframe on the page, indexes are used.
	<iframe> --> index 0
	<iframe> --> index 1
	<iframe> --> index 2

	driver.switchTo.frame(0);

	3- Switching by id or name attribute value.
	driver.switchTo.frame("idValue");
	driver.switchTo.frame("nameValue");




