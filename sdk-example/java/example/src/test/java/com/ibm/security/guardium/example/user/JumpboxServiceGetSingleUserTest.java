package  com.ibm.security.guardium.example.user;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import com.ibm.security.ApiException;

public class JumpboxServiceGetSingleUserTest {
    @Test
    public void testSdkExamples() {
        try {
                JumpboxServiceGetSingleUser example = new JumpboxServiceGetSingleUser();
                example.jumpboxServiceGetSingleUser();
                assertTrue(true);

        } catch (ApiException e) {
            assertTrue(false);
        }
    }
}