package com.ibm.security.guardium.example.tenant;

import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.HttpBasicAuth;
import com.ibm.security.guardium.JumpboxServiceApi;
import com.ibm.security.guardium.Jumpboxv3GetTenantsResponse;

// Go to the Guardium Security Center website and create an API key , copy the one start with "Basic" and then export here:
// export API_KEY=xxx
// Set the URL of your server as environment variable
// export URL=YOUR_TEST_URL
// Or use BasicAuth:
// export API_USERNAME=xxx
// export API_PASSWORD=xxx

public class JumpboxServiceGetTenants {
    public Jumpboxv3GetTenantsResponse jumpboxServiceGetTenants() throws ApiException  {
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
        String uid = "example_uid"; // String | Email.
        String externalId = "externalId_example"; // String | External id.
        Boolean includeInactive = true; // Boolean | Include inactive.
        Boolean includeNotReady = true; // Boolean | Include tenants that are not ready(are in state of being created or deleted).
        try {
            Jumpboxv3GetTenantsResponse result = apiInstance.jumpboxServiceGetTenants(uid, externalId, includeInactive, includeNotReady);
            System.out.println(result);
            return result;
        } catch (ApiException e) {
            System.err.println("Exception when calling JumpboxServiceApi#jumpboxServiceGetTenants");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            throw e;
        }
    }
}
