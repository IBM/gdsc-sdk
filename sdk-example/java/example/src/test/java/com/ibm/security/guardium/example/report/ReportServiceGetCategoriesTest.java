package com.ibm.security.guardium.example.report;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import com.ibm.security.ApiException;

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