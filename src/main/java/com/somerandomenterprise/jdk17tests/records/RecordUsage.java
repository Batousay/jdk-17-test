package com.somerandomenterprise.jdk17tests.records;

public class RecordUsage {

    public static void useRecordsSample() {
        NewRecord newRecord = new NewRecord("Name", 10);
        OldRecord oldRecord = new OldRecord("John", 30);
        PojoRecord pojoRecord = new PojoRecord("Jane", 20);

        System.out.println("Old record: " + oldRecord);
        System.out.println("New record: " + newRecord);
        System.out.println("Pojo record: " + pojoRecord);

    }
}
