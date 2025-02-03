package com.ibm.guardiumsdk.java.example.user;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openapitools.client.ApiException;

public class TenantuserGetRolesTest {
    @Test
    public void testSdkExamples() {
        try {
            TenantuserGetRoles example = new TenantuserGetRoles();
                example.tenantuserGetRoles();
                assertTrue(true);

        } catch (ApiException e) {
            assertTrue(false);
        }
    }
}