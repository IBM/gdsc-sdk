package com.ibm.guardiumsdk.java.example.user;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openapitools.client.ApiException;
import org.openapitools.client.model.Tenantuserv3GetUsersResponse;

public class JumpboxServicePostUsersTest {
    @Test
    public void testSdkExamples() {
        try {
                JumpboxServiceGetSingleUser test1 = new JumpboxServiceGetSingleUser();
                Tenantuserv3GetUsersResponse result = test1.jumpboxServiceGetSingleUser();
                if (result.getUsers().size() > 1) {
                    // User already exists
                    assertTrue(true);
                    return; 
                }
                
                JumpboxServicePostUsers example = new JumpboxServicePostUsers();
                example.jumpboxServicePostUsers();
                assertTrue(true);

        } catch (ApiException e) {
            String reason = e.getResponseBody();
            if (reason.indexOf("already exists in the system.") > -1) {
                assertTrue(true);
                return;
            }
            assertTrue(false);
        }
    }
}