package com.ibm.guardiumsdk.java.example.user;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.api.TenantuserApi;
import org.openapitools.client.auth.HttpBasicAuth;
import org.openapitools.client.model.Tenantuserv3GetRolesResponse;

// Go to the Guardium Security Center website and create an API key , copy the one start with "Basic" and then export here:
// export API_KEY=xxx
// Set the URL of your server as environment variable
// export URL=YOUR_TEST_URL
// Or use BasicAuth:
// export API_USERNAME=xxx
// export API_PASSWORD=xxx

public class TenantuserGetRoles {
    public Tenantuserv3GetRolesResponse  tenantuserGetRoles() throws ApiException{
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        String urlEnv = System.getenv("URL");
        String URL = urlEnv == null || urlEnv.trim().isEmpty() ? "https://localhost" : urlEnv;
        defaultClient.setBasePath(URL);
        
        String userName = System.getenv("API_USERNAME");
        String passWord = System.getenv("API_PASSWORD");
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername(userName);
        BasicAuth.setPassword(passWord);

        TenantuserApi apiInstance = new TenantuserApi();
        try {
            Tenantuserv3GetRolesResponse result = apiInstance.tenantuserGetRoles();
            System.out.println(result);
            return result;
        } catch (ApiException e) {
            System.err.println("Exception when calling TenantuserServiceApi#tenantuserGetRoles");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            throw e;
        }
    }
}
