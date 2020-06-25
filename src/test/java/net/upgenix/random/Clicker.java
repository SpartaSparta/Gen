package net.upgenix.random;

import org.openqa.selenium.WebElement;

class Clicker implements Runnable{
    public WebElement element;

    public Clicker(WebElement element){
        this.element = element;
    }

    @Override
    public void run() {
        element.click();
    }
}
