package org.example;

public class ItThrows {

    /**
     * <h2>Method throws MyException or RunTimeException</h2>
     * @param code used to choose exception
     * @throws MyException if code is even or RunTimeException if odd
     */
    public static void ThrowMyException(int code) throws MyException{
        if (code%2 == 0) {throw new MyException("MyException thrown");}
        else {throw new RuntimeException("RunTimeException thrown");}
    }
}
