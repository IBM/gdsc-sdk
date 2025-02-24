package com.ibm.security.guardium.example.report;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import com.ibm.security.ApiException;

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