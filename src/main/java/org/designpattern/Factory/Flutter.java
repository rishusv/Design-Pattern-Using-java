package org.designpattern.Factory;

public class Flutter {
    //declare non factory methods here
    public void setTheme(){  // non factory method
        System.out.println("Setting theme");
    }

    public void setRefreshRate(){ // non factory method
        System.out.println("Setting Refresh Rate");
    }

    public UIFactory createUIFactory(SupportedPlatform platform){
        //violates OCP
//        if(platform.equals(SupportedPlatform.ANDROID)){
//            return new AndroidUiFactory();
//        } else if (platform.equals(SupportedPlatform.IOS)) {
//            return new IOSUIFactory();
//        }
//        return null;
        return UIFactoryFactory.createUIFactoryForPlatform(platform);
    }
}
