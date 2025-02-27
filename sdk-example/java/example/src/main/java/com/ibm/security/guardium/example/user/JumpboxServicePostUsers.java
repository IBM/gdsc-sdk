package com.ibm.security.guardium.example.user;

import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.HttpBasicAuth;
import com.ibm.security.guardium.JumpboxServiceApi;
import com.ibm.security.guardium.Jumpboxv3PostUsersBulkRequest;
import com.ibm.security.guardium.Jumpboxv3PostUsersBulkResponse;
import com.ibm.security.guardium.Jumpboxv3User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Go to the Guardium Security Center website and create an API key , copy the one start with "Basic" and then export here:
// export API_KEY=xxx
// Set the URL of your server as environment variable
// export URL=YOUR_TEST_URL
// Or use BasicAuth:
// export API_USERNAME=xxx
// export API_PASSWORD=xxx

public class JumpboxServicePostUsers {
    public void jumpboxServicePostUsers() throws ApiException {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        String urlEnv = System.getenv("URL");
        String URL = urlEnv == null || urlEnv.trim().isEmpty() ? "https://localhost" : urlEnv;
        defaultClient.setBasePath(URL);
       
        String userName = System.getenv("API_USERNAME");
        String passWord = System.getenv("API_PASSWORD");
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername(userName);
        BasicAuth.setPassword(passWord);

        JumpboxServiceApi apiInstance = new JumpboxServiceApi(defaultClient);

        Jumpboxv3User user = new Jumpboxv3User();
        user.setDisplayName("Doe Joe");
        user.setUid("doe_joe@ibm.com");
        user.setRoles(Arrays.asList("admin", "default"));

        List<Jumpboxv3User> users = new ArrayList<Jumpboxv3User>();
        users.add(user);

        Jumpboxv3PostUsersBulkRequest jumpboxv3PostUsersBulkRequest = new Jumpboxv3PostUsersBulkRequest();
        jumpboxv3PostUsersBulkRequest.setUsers(users);

        try {
            Jumpboxv3PostUsersBulkResponse result = apiInstance.jumpboxServicePostUsers(jumpboxv3PostUsersBulkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JumpboxServiceApi#jumpboxServicePostUsers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            throw e;
        }
    }
}
