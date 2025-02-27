package  com.ibm.security.guardium.example.user;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import com.ibm.security.ApiException;

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