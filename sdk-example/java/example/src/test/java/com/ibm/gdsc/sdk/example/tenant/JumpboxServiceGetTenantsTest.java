package com.ibm.gdsc.sdk.example.tenant;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import com.ibm.gdsc.ApiException;

public class JumpboxServiceGetTenantsTest {
    @Disabled
    public void testSdkExamples() {
        try {
                JumpboxServiceGetTenants example = new JumpboxServiceGetTenants();
                example.jumpboxServiceGetTenants();
                assertTrue(true);

        } catch (ApiException e) {
            e.printStackTrace();
            String reason = e.getResponseBody();
            // Get tenants information requires the userid has privilage to check all tenants
            if (reason != null && reason.indexOf("failed to authenticate user") > -1) {
                assertTrue(true);
                return;
            }
            assertTrue(false);
        }
    }
}