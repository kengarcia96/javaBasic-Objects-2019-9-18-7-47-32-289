package com.cultivation.javaBasic.showYourIntelligence;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class StackFrameHelper {
    public static String getCurrentMethodName() {
        // TODO: please modify the following code to pass the test
        // <--start
        String methodName = Thread.currentThread().getStackTrace()[2].getClassName() + "." +Thread.currentThread().getStackTrace()[2].getMethodName();
        return methodName;
        // --end-->
    }
}
