/*
 * IBM Guardium Data Security Center
 * Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ibm.security.guardium;

import com.ibm.security.ApiException;
import com.ibm.security.guardium.AddCommentBody;
import com.ibm.security.guardium.Authenticate400Response;
import java.math.BigDecimal;
import com.ibm.security.guardium.ListVulnerabilities200Response;
import com.ibm.security.guardium.ListVulnerabilitiesByDataStore200Response;
import com.ibm.security.guardium.ListVulnerabilitiesByDataStoreSortParameter;
import com.ibm.security.guardium.ListVulnerabilitiesSortParameter;
import com.ibm.security.guardium.SetVulnerabilityStatusRequest;
import com.ibm.security.guardium.UpdateCommentBody;
import com.ibm.security.guardium.VulnerabilitiesByDataStoreFilterOptions;
import com.ibm.security.guardium.VulnerabilitiesFilterOptions;
import com.ibm.security.guardium.VulnerabilitiesSummary;
import com.ibm.security.guardium.Vulnerability;
import com.ibm.security.guardium.VulnerabilityStatus;
import com.ibm.security.guardium.VulnerabilityStatusComment;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataVulnerabilitiesApi
 */
@Disabled
public class DataVulnerabilitiesApiTest {

    private final DataVulnerabilitiesApi api = new DataVulnerabilitiesApi();

    /**
     * Add vulnerability status comment
     *
     * Add or update the status comment of a vulnerability status to keep track of the workflow progress.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addVulnerabilityStatusCommentTest() throws ApiException {
        String vulnerabilityId = null;
        String statusId = null;
        AddCommentBody addCommentBody = null;
        VulnerabilityStatus response = api.addVulnerabilityStatusComment(vulnerabilityId, statusId, addCommentBody);
        // TODO: test validations
    }

    /**
     * Get vulnerabilities summary
     *
     * Get a summary of all the vulnerabilities. You can also filter the results of the vulnerabilities based on the vulnerebility&#39;s type, threat, status, and so on.&lt;BR&gt;&lt;B&gt;Note:&lt;/B&gt; Filter needs to be HTML Encoded.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVulnerabilitiesSummaryTest() throws ApiException {
        VulnerabilitiesFilterOptions filter = null;
        VulnerabilitiesSummary response = api.getVulnerabilitiesSummary(filter);
        // TODO: test validations
    }

    /**
     * Get vulnerability details by ID
     *
     * Get vulnerability details by providing its ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVulnerabilityTest() throws ApiException {
        String vulnerabilityId = null;
        Vulnerability response = api.getVulnerability(vulnerabilityId);
        // TODO: test validations
    }

    /**
     * List vulnerabilities based on an applied filter
     *
     * Get a list of data vulnerabilities based on a filter applied. You can filter by ID of the vulnerability, type of the vulnerability, and so on.&lt;BR&gt;&lt;B&gt;Note:&lt;/B&gt; Filter needs to be HTML encoded.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listVulnerabilitiesTest() throws ApiException {
        VulnerabilitiesFilterOptions filter = null;
        ListVulnerabilitiesSortParameter sort = null;
        BigDecimal pageSize = null;
        String nextToken = null;
        ListVulnerabilities200Response response = api.listVulnerabilities(filter, sort, pageSize, nextToken);
        // TODO: test validations
    }

    /**
     * List vulnerabilities of data stores
     *
     * Get a list of all the vulnerabilities of data stores.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listVulnerabilitiesByDataStoreTest() throws ApiException {
        VulnerabilitiesByDataStoreFilterOptions filter = null;
        ListVulnerabilitiesByDataStoreSortParameter sort = null;
        BigDecimal pageSize = null;
        String nextToken = null;
        ListVulnerabilitiesByDataStore200Response response = api.listVulnerabilitiesByDataStore(filter, sort, pageSize, nextToken);
        // TODO: test validations
    }

    /**
     * Delete vulnerability status comment
     *
     * Delete a status comment of a vulnerability status.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeVulnerabilityStatusCommentTest() throws ApiException {
        String vulnerabilityId = null;
        String statusId = null;
        String commentId = null;
        api.removeVulnerabilityStatusComment(vulnerabilityId, statusId, commentId);
        // TODO: test validations
    }

    /**
     * Set status of a vulnerability
     *
     * Add or update the status of a vulnerability to track its progress.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setVulnerabilityStatusTest() throws ApiException {
        String vulnerabilityId = null;
        SetVulnerabilityStatusRequest setVulnerabilityStatusRequest = null;
        VulnerabilityStatus response = api.setVulnerabilityStatus(vulnerabilityId, setVulnerabilityStatusRequest);
        // TODO: test validations
    }

    /**
     * Set vulnerability status
     *
     * Set a vulnerability status of a vulnerability.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateVulnerabilityStatusCommentTest() throws ApiException {
        String vulnerabilityId = null;
        String statusId = null;
        String commentId = null;
        UpdateCommentBody updateCommentBody = null;
        VulnerabilityStatusComment response = api.updateVulnerabilityStatusComment(vulnerabilityId, statusId, commentId, updateCommentBody);
        // TODO: test validations
    }

}
