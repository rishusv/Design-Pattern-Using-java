package org.designpattern.Strategy;

import org.designpattern.Strategy.PathCalculatorFactory.PathCalculatorFactory;

public class GoogleMaps {
    public void findPath(String from,String to,Modes mode){
        PathCalculatorStrategy pathCalculatorStrategy =
                PathCalculatorFactory.getPathCalculatorForMode(mode);

        pathCalculatorStrategy.findPath(from,to);
    }
}
