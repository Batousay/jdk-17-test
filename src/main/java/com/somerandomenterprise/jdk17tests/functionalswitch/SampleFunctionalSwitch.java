package com.somerandomenterprise.jdk17tests.functionalswitch;

public class SampleFunctionalSwitch {
    public static void sampleFunctionalSwitch(String fruit) {
        String printString = switch (fruit) {
            case "apple" -> "Apple";
            case "banana" -> "Banana";
            case "orange" -> "Orange";
            default -> {
                System.out.println("Unknown fruit");
                yield "Unknown";
                }
            };

        System.out.println(printString);
    }

    public static void oldSwitchStatement(String fruit) {
        String printString;
        switch (fruit) {
            case "apple":
                printString = "Apple";
                break;
            case "banana":
                printString = "Banana";
                break;
            case "orange":
                printString = "Orange";
                break;
            default:
                System.out.println("Unknown fruit " + fruit);
                printString = "Unknown";
        }
        System.out.println(printString);
    }
}
