package com.somerandomenterprise.jdk17tests.multiline;

public class MultilineStrings {
    private static final String OLD_STRING = "SELECT "
        + "    d.DOSSIER_ID, d.CHECKOUT_ID,"
        + "    c.CREATION_DATE, c.INVOICING_ENTITY, c.WEBSITE_CODE, c.COLLECTION_CURRENCY, c.SALES_PRICE, c.MERCHANT_AMOUNT, c.SALES_INTERFACE, C.SALES_CHANNEL, C.FRAUD_RISK, C.ENGINE_TYPE,"
        + "    b.BOOKING_ID, b.STATUS as BOOKING_STATUS, b.SB_ADAPTED as SB_ADAPTED,"
        + "    s.ID AS SHOPPING_BASKET_ID, s.CHECKOUT_DATE, s.STATUS AS SHOPPING_BASKET_STATUS, s.SB_TYPE,"
        + "    cust.USER_ID, cust.EMAIL, cust.PHONE, cust.NAME, cust.SURNAME, cust.COUNTRY_CODE, cust.LANGUAGE_CODE, cust.MEMBERSHIP_ID,"
        + "    i.INVOICE_TYPE, i.VAT_NUMBER, i.FULL_NAME, i.EMAIL as INVOICE_EMAIL, i.ADDRESS, i.CITY, i.ZIP_CODE, i.COUNTRY_CODE AS INVOICE_COUNTRY_CODE,"
        + "    m.EDO_ID AS MEMBERSHIP_EDO_ID, m.EDO_LEGACY_ID AS MEMBERSHIP_LEGACY_ID, m.ACCOUNT, m.ACCOUNT_LEGACY, m.PRIME_TYPE, m.FREE_TRIAL, m.EXPIRATION_DATE, m.DURATION, m.DURATION_UNIT, m.NUM_RENEWALS"
        + " FROM DOSSIER_CHECKOUTS d"
        + "    LEFT JOIN CHECKOUT c ON d.checkout_id = c.id"
        + "    LEFT JOIN BOOKING b ON d.checkout_id = b.checkout_id"
        + "    LEFT JOIN SHOPPING_BASKET s ON d.checkout_id = s.id"
        + "    LEFT JOIN CUSTOMER cust ON d.checkout_id = cust.checkout_id"
        + "    LEFT JOIN INVOICE i ON d.checkout_id = i.checkout_id"
        + "    LEFT JOIN MEMBERSHIP m ON cust.membership_id = m.id"
        + " WHERE d.DOSSIER_ID = HEXTORAW(:dossierId)";

    private static final String NEW_STRING = """
         SELECT 
            d.DOSSIER_ID, d.CHECKOUT_ID,
            c.CREATION_DATE, c.INVOICING_ENTITY, c.WEBSITE_CODE, c.COLLECTION_CURRENCY, c.SALES_PRICE, c.MERCHANT_AMOUNT, c.SALES_INTERFACE, C.SALES_CHANNEL, C.FRAUD_RISK, C.ENGINE_TYPE,
            b.BOOKING_ID, b.STATUS as BOOKING_STATUS, b.SB_ADAPTED as SB_ADAPTED,
            s.ID AS SHOPPING_BASKET_ID, s.CHECKOUT_DATE, s.STATUS AS SHOPPING_BASKET_STATUS, s.SB_TYPE,
            cust.USER_ID, cust.EMAIL, cust.PHONE, cust.NAME, cust.SURNAME, cust.COUNTRY_CODE, cust.LANGUAGE_CODE, cust.MEMBERSHIP_ID,
            i.INVOICE_TYPE, i.VAT_NUMBER, i.FULL_NAME, i.EMAIL as INVOICE_EMAIL, i.ADDRESS, i.CITY, i.ZIP_CODE, i.COUNTRY_CODE AS INVOICE_COUNTRY_CODE,
            m.EDO_ID AS MEMBERSHIP_EDO_ID, m.EDO_LEGACY_ID AS MEMBERSHIP_LEGACY_ID, m.ACCOUNT, m.ACCOUNT_LEGACY, m.PRIME_TYPE, m.FREE_TRIAL, m.EXPIRATION_DATE, m.DURATION, m.DURATION_UNIT, m.NUM_RENEWALS
         FROM DOSSIER_CHECKOUTS d
            LEFT JOIN CHECKOUT c ON d.checkout_id = c.id
            LEFT JOIN BOOKING b ON d.checkout_id = b.checkout_id
            LEFT JOIN SHOPPING_BASKET s ON d.checkout_id = s.id
            LEFT JOIN CUSTOMER cust ON d.checkout_id = cust.checkout_id
            LEFT JOIN INVOICE i ON d.checkout_id = i.checkout_id
            LEFT JOIN MEMBERSHIP m ON cust.membership_id = m.id
         WHERE d.DOSSIER_ID = HEXTORAW(:dossierId)
         """;

    private static final String PUZZLE = """
   One " \
   Two ""\n
   Three \"\"\"
""";


    public static void printMultilineString() {
        System.out.println("Old String: " + OLD_STRING);
        System.out.println("New String: " + NEW_STRING);
        System.out.println("Puzzle: " + PUZZLE);
    }
}
