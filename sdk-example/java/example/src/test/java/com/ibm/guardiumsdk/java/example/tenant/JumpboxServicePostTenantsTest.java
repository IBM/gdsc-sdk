package com.ibm.guardiumsdk.java.example.tenant;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.openapitools.client.ApiException;

public class JumpboxServicePostTenantsTest {
    @Disabled
    public void testSdkExamples() {
        try {
                JumpboxServicePostTenants example = new JumpboxServicePostTenants();
                example.jumpboxServicePostTenants();
                assertTrue(true);

        } catch (ApiException e) {
            int code = e.getCode();
            // Need special permit to post a tenant
            System.out.println("Maggie, code:" + code);
            if (code == 401 || code == 0) {
                assertTrue(true);
                return;
            }

            assertTrue(false);
        }
    }
}