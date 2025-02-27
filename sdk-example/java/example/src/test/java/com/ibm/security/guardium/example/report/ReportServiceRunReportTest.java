package com.ibm.security.guardium.example.report;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import com.ibm.security.ApiException;

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