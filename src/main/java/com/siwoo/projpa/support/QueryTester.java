package com.siwoo.projpa.support;

import java.util.List;

public class QueryTester {

    public static boolean noResult(List result) {
        if(result == null || result.size() == 0) {
            System.out.println("0 result retrieved");
            return true;
        }
        else return false;
    };

    public static void printResult(Object result) {
        if(result instanceof Object[]) {
            Object[] row = (Object[]) result;
            for(int i = 0; i < row.length; i++) {
                printResult(row[i]);
            }
        } else if (result instanceof Long ||
                result instanceof Double ||
                result instanceof String ) {
            System.out.printf(result.getClass().getSimpleName() + ": " + result + ", ");
        } else {
            System.out.printf(result.getClass().getSimpleName()+" entity : " + result + ", ");
        }
    }

}
