# WINDOWS/TABS
-> Selenium can only focus on one thing at a time.
-> Selenium creates something called window handle for each tab or window.
-> For selenium, there is no difference between a tab, and a window. It works same for both of the tab and window.

	What is a window handle : Randomly generated string that is unique to each window.
	example : CDwindow-7E6F9AEE107F13A24BF541182AEE2971

	How to get current window handle?
		-> driver.getWindowHandle() --> will store current window that you are working for one window.

	How to get all of the window handles of the currenly opened tabs/windows?
		-> driver.getWindowHandles() --> will return a SET of string that contains all the windows or tabs that you have.