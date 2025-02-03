package com.ibm.guardiumsdk.java.example.report;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.openapitools.client.ApiException;

public class ReportServiceGetReportsTest {
    @Test
    public void testSdkExamples() {
        try {
                ReportServiceGetReports example = new ReportServiceGetReports();
                example.reportsServiceGetReports();
                assertTrue(true);

        } catch (ApiException e) {
            assertTrue(false);
        }
    }
}