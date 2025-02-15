package com.ibm.gdsc.sdk.example.report;

import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.sdk.ReportsServiceApi;
import com.ibm.gdsc.auth.HttpBasicAuth;
import com.ibm.gdsc.sdk.Reportsv3GetReportsResponse;


// Go to the Guardium Security Center website and create an API key , copy the one start with "Basic" and then export here:
// export API_KEY=xxx
// Set the URL of your server as environment variable
// export URL=YOUR_TEST_URL
// Or use BasicAuth:
// export API_USERNAME=xxx
// export API_PASSWORD=xxx

public class ReportServiceGetReports {
    public Reportsv3GetReportsResponse reportsServiceGetReports() throws ApiException{
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        String urlEnv = System.getenv("URL");
        String URL = urlEnv == null || urlEnv.trim().isEmpty() ? "https://localhost" : urlEnv;
        defaultClient.setBasePath(URL);
        
        String userName = System.getenv("API_USERNAME");
        String passWord = System.getenv("API_PASSWORD");
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername(userName);
        BasicAuth.setPassword(passWord);

        ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
        String categoryId = "categoryId_example"; // String | Optional Category ID parameter.
        String tableName = "tableName_example"; // String | Optional table name parameter.
        try {
            Reportsv3GetReportsResponse result = apiInstance.reportsServiceGetReports(categoryId, tableName);
            System.out.println(result);
            return result;
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsServiceApi#reportsServiceGetReports");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            throw e;
        }
    }
}
