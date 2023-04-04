package Lesson11;

import Base.TestBase2;
import Utilities.BrowserUtils;
import Utilities.DriverUtil;
import Utilities.PropertiesReaderUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class C3_ActionsTest extends TestBase2 {

    /*
    1) Go to https://demo.guru99.com/test/simple_context_menu.html
    2) Double-click the "double click" button
    3) Then accept the alert that pops up
     */
    Actions actions;
    @Ignore
    @Test
    public void doubleClickTest() {
        // 1) Go to https://demo.guru99.com/test/simple_context_menu.html
        DriverUtil.getDriver().get(PropertiesReaderUtil.getProperties("demoguruSCM"));

        // 2) Double-click the "double click" button
        WebElement doubleClickButton = DriverUtil.getDriver().findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
        actions = new Actions(DriverUtil.getDriver());
        actions.doubleClick(doubleClickButton).perform();

        // 3) Then accept the alert that pops up
        Alert alert = DriverUtil.getDriver().switchTo().alert();
        alert.accept();
    }

    /*
1) Go to http://demo.guru99.com/test/simple_context_menu.html
2) Right-click the "right click" button
3) Then click on edit button
4) Accept the alert that pops up
 */
    @Ignore
    @Test
    public void rightClickTest() {
        DriverUtil.getDriver().get(PropertiesReaderUtil.getProperties("demoguruSCM"));
        WebElement rightClickButton = DriverUtil.getDriver().findElement(By.xpath("//span[.='right click me']"));
        // 2) Right-click the "right click" button
        actions = new Actions(DriverUtil.getDriver());
        actions.contextClick(rightClickButton).perform();
        // 3) Then click on edit button
        DriverUtil.getDriver().findElement(By.xpath("//span[.='Edit']")).click();
        Alert alert = DriverUtil.getDriver().switchTo().alert();
        BrowserUtils.wait(2);
        alert.accept();
    }

    /*
    1) go to http://demo.guru99.com/test/drag_drop.html
    2) first find where drag from, drag the "BANK" item
    3) then find where to drop; drop it on "Account" on the "DEBIT SIDE"
    4) use actions to drag and drop
        -first specify location of drag,
        -second specify location of drop
     */
    @Test
    public void dragAndDropTest() {
        // 1) go to http://demo.guru99.com/test/drag_drop.html
        DriverUtil.getDriver().get(PropertiesReaderUtil.getProperties("demoguruDnD"));

        // Find the location of the dragged item
        WebElement bankFrom = DriverUtil.getDriver().findElement(By.id("credit2"));
        // Find the location to drop the dragged item
        WebElement bankTo = DriverUtil.getDriver().findElement(By.id("bank"));

        // Use actions class to drag and drop our stored web elements
        actions = new Actions(DriverUtil.getDriver());
        actions.dragAndDrop(bankFrom, bankTo).perform();

        // Try this one more time with "5000" item and drop to the "Amount" on "DEBIT SIDE"

    }

}
