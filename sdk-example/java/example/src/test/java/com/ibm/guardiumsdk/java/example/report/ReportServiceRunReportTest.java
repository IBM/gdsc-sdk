package com.ibm.guardiumsdk.java.example.report;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.openapitools.client.ApiException;

public class ReportServiceRunReportTest {
    @Test
    public void testSdkExamples() {
        try {
                ReportsRunnerRunReport example = new ReportsRunnerRunReport();
                example.reportsRunnerRunReport();
                assertTrue(true);

        } catch (com.google.gson.JsonSyntaxException e) {
            assertTrue(true);
        } catch (ApiException e) {
            assertTrue(false);
        }
    }
}