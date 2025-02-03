package com.ibm.guardiumsdk.java.example.report;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.api.ReportsRunnerApi;
import org.openapitools.client.auth.HttpBasicAuth;
import org.openapitools.client.model.Reportsrunnerv3RunReportRequest;
import org.openapitools.client.model.Reportsv3RunTimeParameter;
import org.openapitools.client.model.StreamResultOfReportsrunnerv3RunReportResponse;

import java.util.ArrayList;
import java.util.List;

// Go to the Guardium Security Center website and create an API key , copy the one start with "Basic" and then export here:
// export API_KEY=xxx
// Set the URL of your server as environment variable
// export URL=YOUR_TEST_URL
// Or use BasicAuth:
// export API_USERNAME=xxx
// export API_PASSWORD=xxx

public class ReportsRunnerRunReport {
    public StreamResultOfReportsrunnerv3RunReportResponse reportsRunnerRunReport() throws ApiException {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        String urlEnv = System.getenv("URL");
        String URL = urlEnv == null || urlEnv.trim().isEmpty() ? "https://localhost" : urlEnv;
        defaultClient.setBasePath(URL);
     
        String userName = System.getenv("API_USERNAME");
        String passWord = System.getenv("API_PASSWORD");
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername(userName);
        BasicAuth.setPassword(passWord);

        ReportsRunnerApi apiInstance = new ReportsRunnerApi(defaultClient);
        Reportsrunnerv3RunReportRequest reportsrunnerv3RunReportRequest = getRunReportRequest();

        try {
            StreamResultOfReportsrunnerv3RunReportResponse result = apiInstance.reportsRunnerRunReport(reportsrunnerv3RunReportRequest);
            System.out.println(result);
            return result;

        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsRunnerApi#reportsRunnerRunReport");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            throw e;
        }
    }

    private static Reportsrunnerv3RunReportRequest getRunReportRequest() {
        Reportsrunnerv3RunReportRequest reportsrunnerv3RunReportRequest = new Reportsrunnerv3RunReportRequest(); // Reportsrunnerv3RunReportRequest |
        reportsrunnerv3RunReportRequest.setReportId("000000000000000000002001");
        reportsrunnerv3RunReportRequest.setFetchSize(5);
        reportsrunnerv3RunReportRequest.setOffset(0);
        List<Reportsv3RunTimeParameter> runtimeParameterList = new ArrayList<Reportsv3RunTimeParameter>();
        reportsrunnerv3RunReportRequest.setRuntimeParameterList(runtimeParameterList);
        return reportsrunnerv3RunReportRequest;
    }
}
