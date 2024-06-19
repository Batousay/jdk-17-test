package com.somerandomenterprise.jdk17tests.npe;

public class SampleNullPointers {
    public static void breakEverything() {
        String descriptiveStringName = null;
        System.out.println(descriptiveStringName.length());
    }
}
