package com.ibm.gdsc.sdk.example.user;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import com.ibm.gdsc.sdk.client.ApiException;

public class JumpboxServiceGetUsersTest {
    @Test
    public void testSdkExamples() {
        try {
                JumpboxServiceGetUsers example = new JumpboxServiceGetUsers();
                example.jumpboxServiceGetUsers();
                assertTrue(true);

        } catch (ApiException e) {
            assertTrue(false);
        }
    }
}