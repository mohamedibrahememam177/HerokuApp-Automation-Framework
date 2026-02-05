package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class HomePage {
    private WebDriver driver;

    //constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // methods=interaction
    public void click(String textLink){
        driver.findElement(By.linkText(textLink)).click();
    }

    public LoginPage clickFormAuthentication(){
      click("Form Authentication");
      return new LoginPage(driver);
    }
    public DropdownPage clickDropdown(){
        click("Dropdown");
        return new DropdownPage(driver);
    }
    public HoversPage clickHoversPage(){
        click("Hovers");
        return new HoversPage(driver) ;
    }
    public AddRemoveElements clickAddRemoveElementsPage(){
        click("Add/Remove Elements");
        return new AddRemoveElements(driver);
    }
    public KeyPressPage clickOnKeyPressLink(){
        click("Key Presses");
        return new KeyPressPage(driver);
    }
    public JavaScriptAlertsPage clickOnJavaScriptAlerts(){
        click("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }
    public FileUploadPage FileUploadPage(){
        click("File Upload");
        return new FileUploadPage(driver);
    }
    public DynamicLoadingPage clickOnDynamicLoading(){
        click("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public LargeAndDeepDOMPage clickOnLargeAndDeepDOM(){
        click("Large & Deep DOM");
        return new LargeAndDeepDOMPage(driver);
    }
    public InfiniteScrollPage clickOnInfiniteScroll(){
        click("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
    public MultipleWindowsPage clickOnMultipleWindows(){
        click("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }
    public FramePage clickOnFrameLink(){
        click("Frames");
        return new FramePage(driver);
    }
    public FileDownloadPage clickOnFileDownloadLink(){
        click("File Download");
        return new FileDownloadPage(driver);
    }
    public SortableDataTablesPage clickOnSortableDataTables(){
        click("Sortable Data Tables");
        return new SortableDataTablesPage(driver);
    }



    }
