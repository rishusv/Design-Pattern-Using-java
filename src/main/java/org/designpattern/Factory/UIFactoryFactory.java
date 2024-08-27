package org.designpattern.Factory;

public class UIFactoryFactory {
    //SRP for UI Factory
    //Practical Factory
    public static UIFactory createUIFactoryForPlatform(SupportedPlatform platform){
        if(platform.equals(SupportedPlatform.ANDROID)){
            return new AndroidUiFactory();
        } else if (platform.equals(SupportedPlatform.IOS)) {
            return new IOSUIFactory();
        }
        return null;
    }
}
