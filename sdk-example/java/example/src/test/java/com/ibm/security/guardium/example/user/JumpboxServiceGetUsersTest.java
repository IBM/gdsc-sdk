package com.ibm.security.guardium.example.user;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import com.ibm.security.ApiException;

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