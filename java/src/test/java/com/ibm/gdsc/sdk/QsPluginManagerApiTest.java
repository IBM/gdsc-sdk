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


package com.ibm.gdsc.sdk;

import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.sdk.Qspmpluginmanagerv3PluginRQ;
import com.ibm.gdsc.sdk.Qspmpluginmanagerv3PluginRS;
import com.ibm.gdsc.sdk.Qspmpluginmanagerv3PolicyPluginRQ;
import com.ibm.gdsc.sdk.Qspmpluginmanagerv3PolicyPluginRS;
import com.ibm.gdsc.sdk.RuntimeError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QsPluginManagerApi
 */
@Disabled
public class QsPluginManagerApiTest {

    private final QsPluginManagerApi api = new QsPluginManagerApi();

    /**
     * Summary: Invoke only application provisioning data plugin Description:Parses app input file and triggers dataload
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void qSPluginManagerInvokeAppProvTest() throws ApiException {
        String pluginId = null;
        Qspmpluginmanagerv3PluginRQ qspmpluginmanagerv3PluginRQ = null;
        Qspmpluginmanagerv3PluginRS response = api.qSPluginManagerInvokeAppProv(pluginId, qspmpluginmanagerv3PluginRQ);
        // TODO: test validations
    }

    /**
     * Summary: Invoke only explorer inventory data plugin Description:Parses explorer input file and triggers dataload
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void qSPluginManagerInvokeExplorerV1Test() throws ApiException {
        String pluginId = null;
        Qspmpluginmanagerv3PluginRQ qspmpluginmanagerv3PluginRQ = null;
        Qspmpluginmanagerv3PluginRS response = api.qSPluginManagerInvokeExplorerV1(pluginId, qspmpluginmanagerv3PluginRQ);
        // TODO: test validations
    }

    /**
     * Summary: Invoke only explorer analytics data plugin Description:Parses explorer input file and triggers dataload
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void qSPluginManagerInvokeExplorerV2Test() throws ApiException {
        String pluginId = null;
        Qspmpluginmanagerv3PluginRQ qspmpluginmanagerv3PluginRQ = null;
        Qspmpluginmanagerv3PluginRS response = api.qSPluginManagerInvokeExplorerV2(pluginId, qspmpluginmanagerv3PluginRQ);
        // TODO: test validations
    }

    /**
     * Summary: Invoke consolidated or only network data plugin Description:Parses input files and triggers dataload
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void qSPluginManagerInvokePluginTest() throws ApiException {
        String pluginId = null;
        Qspmpluginmanagerv3PluginRQ qspmpluginmanagerv3PluginRQ = null;
        Qspmpluginmanagerv3PluginRS response = api.qSPluginManagerInvokePlugin(pluginId, qspmpluginmanagerv3PluginRQ);
        // TODO: test validations
    }

    /**
     * Summary: Invoke only policy data plugin Description:Parses policy input file and triggers dataload
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void qSPluginManagerInvokePolicyTest() throws ApiException {
        String pluginId = null;
        Qspmpluginmanagerv3PolicyPluginRQ qspmpluginmanagerv3PolicyPluginRQ = null;
        Qspmpluginmanagerv3PolicyPluginRS response = api.qSPluginManagerInvokePolicy(pluginId, qspmpluginmanagerv3PolicyPluginRQ);
        // TODO: test validations
    }

}
