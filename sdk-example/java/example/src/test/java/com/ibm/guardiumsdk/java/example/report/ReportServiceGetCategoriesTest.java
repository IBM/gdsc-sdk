package com.ibm.guardiumsdk.java.example.report;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.openapitools.client.ApiException;

public class ReportServiceGetCategoriesTest {
    @Test
    public void testSdkExamples() {
        try {
                ReportServiceGetCategories example = new ReportServiceGetCategories();
                example.reportsServiceGetCategories();
                assertTrue(true);

        } catch (ApiException e) {
            assertTrue(false);
        }
    }
}