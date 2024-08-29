package org.designpattern.Strategy.PathCalculatorFactory;

import org.designpattern.Strategy.*;

public class PathCalculatorFactory {
    public static PathCalculatorStrategy getPathCalculatorForMode(Modes mode){
        if(mode.equals(Modes.CAR)){
            return new CarPathCalculator();
        }
        else if(mode.equals(Modes.BIKE)){
            return new BikePathCalculator();
        }
        else {
            return new WalkPathCalculator();
        }
    }
}
