package com.shaily.postman.countingStrategy;

public class UniqueIds implements CountingStrategy {

    private static UniqueIds uniqueIds;
    private static int counter;

    private UniqueIds() {

    }

    public static UniqueIds getInstance() {
        if(uniqueIds == null) {
            synchronized (UniqueIds.class) {
                if(uniqueIds == null) {
                    uniqueIds = new UniqueIds();
                    counter = 1;
                }
            }
        }
        return uniqueIds;
    }

}
