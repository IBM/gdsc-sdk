package com.ibm.gdsc.sdk.example.tenant;

import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.sdk.JumpboxServiceApi;
import com.ibm.gdsc.auth.HttpBasicAuth;
import com.ibm.gdsc.sdk.Jumpboxv3PostTenantsRequest;
import com.ibm.gdsc.sdk.Jumpboxv3PostTenantsResponse;

// Go to the Guardium Security Center website and create an API key , copy the one start with "Basic" and then export here:
// export API_KEY=xxx
// Set the URL of your server as environment variable
// export URL=YOUR_TEST_URL
// Or use BasicAuth:
// export API_USERNAME=xxx
// export API_PASSWORD=xxx

public class JumpboxServicePostTenants {
    public Jumpboxv3PostTenantsResponse jumpboxServicePostTenants() throws ApiException{
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
        Jumpboxv3PostTenantsRequest jumpboxv3PostTenantsRequest = new Jumpboxv3PostTenantsRequest(); // Jumpboxv3PostTenantsRequest |
        jumpboxv3PostTenantsRequest.setName("Doe Joe");
        jumpboxv3PostTenantsRequest.setUid("doejoe");
        try {
            Jumpboxv3PostTenantsResponse result = apiInstance.jumpboxServicePostTenants(jumpboxv3PostTenantsRequest);
            System.out.println(result);
            return result;
        } catch (ApiException e) {
            System.err.println("Exception when calling JumpboxServiceApi#jumpboxServicePostTenants");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            throw e;
        }
    }
}
