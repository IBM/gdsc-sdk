package com.ibm.gdsc.sdk.example.tenant;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import com.ibm.gdsc.sdk.client.ApiException;

public class JumpboxServiceGetTenantTest {
    @Disabled
    public void testSdkExamples() {
        try {
                JumpboxServiceGetTenant example = new JumpboxServiceGetTenant();
                example.jumpboxServiceGetTenant();
                assertTrue(true);

        } catch (ApiException e) {
            String reason = e.getResponseBody();
              // Get tenant information requires the userid has privilage to check this tenant id
            if (reason.indexOf("not authorized to get tenant tenantId_example") > -1) {
                assertTrue(true);
                return;
            }
            assertTrue(false);
        }
    }
}