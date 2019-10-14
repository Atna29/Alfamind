package com.my.keywords.android
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.TouchAction

class swiping {	
    AppiumDriver driver;	

    swiping() {		
        this.driver = MobileDriverFactory.getDriver()	
    }	

    private scrollEntireList() {
        // very specific to android and the type of element that makes up your dropdowns		
        ArrayList listElement = driver.findElementsByClassName("android.widget.TextView")		
        TouchAction touchAction = new TouchAction(driver)		
        def bottomElement = listElement[listElement.size() - 1]		
        def topElement = listElement[0]		
        // Press and scroll from the last element in the list all the way to the top		                
        touchAction.press(bottomElement).moveTo(topElement).release().perform();	
    }	

    @Keyword	
    def boolean scrollListToElementWithText(String elementText) {		
        boolean isElementFound = false;		
        while (isElementFound == false) {			
        // very specific to android and the type of element that makes up your dropdowns					                        
        ArrayList listElement = driver.findElementsByClassName("android.widget.TextView")			
        for (int i = 0; i<listElement.size(); i++) {				
            String textItem = ((MobileElement)listElement[i]).getText()
            if (textItem == elementText) {					
                isElementFound = true;					
                return true;				
            }			
        }			
        scrollEntireList()		
    }	
}}