# GroupBuilderApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**groupBuilderCancelImportGroup**](GroupBuilderApi.md#groupBuilderCancelImportGroup) | **DELETE** /api/v3/groups_import | Summary: Cancel import group Description: Cancel import refresh for selected groups. |
| [**groupBuilderCreateGroup**](GroupBuilderApi.md#groupBuilderCreateGroup) | **POST** /api/v3/groups | Summary: Create group Description: Create new groups. |
| [**groupBuilderDeleteGroup**](GroupBuilderApi.md#groupBuilderDeleteGroup) | **DELETE** /api/v3/groups | Summary: Delete group Description: Delete specified groups if the group ID is not used for reports. |
| [**groupBuilderEditGroup**](GroupBuilderApi.md#groupBuilderEditGroup) | **PATCH** /api/v3/groups/{group_id} | Summary: Edit group Description: Add or delete group members. |
| [**groupBuilderExportGroup**](GroupBuilderApi.md#groupBuilderExportGroup) | **POST** /api/v3/groups_export | Summary: Export group Description: Export group content to a file based on a group ID. |
| [**groupBuilderGetGroupDetails**](GroupBuilderApi.md#groupBuilderGetGroupDetails) | **GET** /api/v3/groups/{group_id} | Summary: Get group details Description: Get details of group specified by group ID. |
| [**groupBuilderGetGroupMembers**](GroupBuilderApi.md#groupBuilderGetGroupMembers) | **POST** /api/v3/groups/search | Summary: Get group members Description: Get members of all the group ids provided in the request. To be consumed by policy builder ms. |
| [**groupBuilderGetGroupSyncMapping**](GroupBuilderApi.md#groupBuilderGetGroupSyncMapping) | **GET** /api/v3/groups/mappings/sync | Summary: Get gdp to gi group mapping Description: Get insights to gdp group sync mapping. |
| [**groupBuilderGetGroupTypeMapping**](GroupBuilderApi.md#groupBuilderGetGroupTypeMapping) | **GET** /api/v3/groups-mappings | Summary: Get group type mapping Description: Get insights to gdp group types mapping. |
| [**groupBuilderGetGroupTypes**](GroupBuilderApi.md#groupBuilderGetGroupTypes) | **GET** /api/v3/group_types | Summary: Get group types Description: Get a list of available group types. |
| [**groupBuilderGetGroups**](GroupBuilderApi.md#groupBuilderGetGroups) | **GET** /api/v3/groups | Summary: Get groups Description: Get a list of imported group members. |
| [**groupBuilderGetImportGroups**](GroupBuilderApi.md#groupBuilderGetImportGroups) | **GET** /api/v3/groups_import | Summary: Get import groups Description: Get unsynchronized groups from a central manager. |
| [**groupBuilderImportGroup**](GroupBuilderApi.md#groupBuilderImportGroup) | **POST** /api/v3/groups_import | Summary: Import group Description: Import selected groups from a central manager. (This API is called from GDP only) |
| [**groupBuilderRefreshGroups**](GroupBuilderApi.md#groupBuilderRefreshGroups) | **POST** /api/v3/groups/refresh | Summary: Refresh groups Description: Refresh tenants selected imported groups. |
| [**groupBuilderResetGroups**](GroupBuilderApi.md#groupBuilderResetGroups) | **POST** /api/v3/groups/reset | Summary: Reset groups Description: Resets tenants selected predefined groups. |
| [**groupBuilderStoreGroupMembersGdp**](GroupBuilderApi.md#groupBuilderStoreGroupMembersGdp) | **POST** /api/v3/central_managers/{central_manager_id}/groups/members | Summary: Store group members Gdp Description: Store GDP groups. (This API is called from GDP only) |
| [**groupBuilderStoreGroupsGdp**](GroupBuilderApi.md#groupBuilderStoreGroupsGdp) | **POST** /api/v3/central_managers/{central_manager_id}/groups | Summary: Store groups Gdp Description: Store GDP groups. (This API is called from GDP only) |


<a id="groupBuilderCancelImportGroup"></a>
# **groupBuilderCancelImportGroup**
> Groupbuilderv3CancelGroupImportResponse groupBuilderCancelImportGroup(groupIds)

Summary: Cancel import group Description: Cancel import refresh for selected groups.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.GroupBuilderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupBuilderApi apiInstance = new GroupBuilderApi(defaultClient);
    List<Integer> groupIds = Arrays.asList(); // List<Integer> | Group IDs to delete.
    try {
      Groupbuilderv3CancelGroupImportResponse result = apiInstance.groupBuilderCancelImportGroup(groupIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuilderApi#groupBuilderCancelImportGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupIds** | [**List&lt;Integer&gt;**](Integer.md)| Group IDs to delete. | [optional] |

### Return type

[**Groupbuilderv3CancelGroupImportResponse**](Groupbuilderv3CancelGroupImportResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="groupBuilderCreateGroup"></a>
# **groupBuilderCreateGroup**
> Groupbuilderv3CreateGroupResponse groupBuilderCreateGroup(groupbuilderv3CreateGroupRequest)

Summary: Create group Description: Create new groups.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.GroupBuilderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupBuilderApi apiInstance = new GroupBuilderApi(defaultClient);
    Groupbuilderv3CreateGroupRequest groupbuilderv3CreateGroupRequest = new Groupbuilderv3CreateGroupRequest(); // Groupbuilderv3CreateGroupRequest | 
    try {
      Groupbuilderv3CreateGroupResponse result = apiInstance.groupBuilderCreateGroup(groupbuilderv3CreateGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuilderApi#groupBuilderCreateGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupbuilderv3CreateGroupRequest** | [**Groupbuilderv3CreateGroupRequest**](Groupbuilderv3CreateGroupRequest.md)|  | |

### Return type

[**Groupbuilderv3CreateGroupResponse**](Groupbuilderv3CreateGroupResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="groupBuilderDeleteGroup"></a>
# **groupBuilderDeleteGroup**
> Groupbuilderv3DeleteGroupResponse groupBuilderDeleteGroup(groupIds)

Summary: Delete group Description: Delete specified groups if the group ID is not used for reports.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.GroupBuilderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupBuilderApi apiInstance = new GroupBuilderApi(defaultClient);
    List<Integer> groupIds = Arrays.asList(); // List<Integer> | Group IDs to delete.
    try {
      Groupbuilderv3DeleteGroupResponse result = apiInstance.groupBuilderDeleteGroup(groupIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuilderApi#groupBuilderDeleteGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupIds** | [**List&lt;Integer&gt;**](Integer.md)| Group IDs to delete. | [optional] |

### Return type

[**Groupbuilderv3DeleteGroupResponse**](Groupbuilderv3DeleteGroupResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="groupBuilderEditGroup"></a>
# **groupBuilderEditGroup**
> Groupbuilderv3EditGroupResponse groupBuilderEditGroup(groupId, groupbuilderv3EditGroupRequest)

Summary: Edit group Description: Add or delete group members.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.GroupBuilderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupBuilderApi apiInstance = new GroupBuilderApi(defaultClient);
    Integer groupId = 56; // Integer | Group ID.
    Groupbuilderv3EditGroupRequest groupbuilderv3EditGroupRequest = new Groupbuilderv3EditGroupRequest(); // Groupbuilderv3EditGroupRequest | 
    try {
      Groupbuilderv3EditGroupResponse result = apiInstance.groupBuilderEditGroup(groupId, groupbuilderv3EditGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuilderApi#groupBuilderEditGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **Integer**| Group ID. | |
| **groupbuilderv3EditGroupRequest** | [**Groupbuilderv3EditGroupRequest**](Groupbuilderv3EditGroupRequest.md)|  | |

### Return type

[**Groupbuilderv3EditGroupResponse**](Groupbuilderv3EditGroupResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="groupBuilderExportGroup"></a>
# **groupBuilderExportGroup**
> Groupbuilderv3GetExportGroupResponse groupBuilderExportGroup(groupbuilderv3GetExportGroupRequest)

Summary: Export group Description: Export group content to a file based on a group ID.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.GroupBuilderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupBuilderApi apiInstance = new GroupBuilderApi(defaultClient);
    Groupbuilderv3GetExportGroupRequest groupbuilderv3GetExportGroupRequest = new Groupbuilderv3GetExportGroupRequest(); // Groupbuilderv3GetExportGroupRequest | 
    try {
      Groupbuilderv3GetExportGroupResponse result = apiInstance.groupBuilderExportGroup(groupbuilderv3GetExportGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuilderApi#groupBuilderExportGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupbuilderv3GetExportGroupRequest** | [**Groupbuilderv3GetExportGroupRequest**](Groupbuilderv3GetExportGroupRequest.md)|  | |

### Return type

[**Groupbuilderv3GetExportGroupResponse**](Groupbuilderv3GetExportGroupResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="groupBuilderGetGroupDetails"></a>
# **groupBuilderGetGroupDetails**
> Groupbuilderv3GetGroupDetailResponse groupBuilderGetGroupDetails(groupId, filter, order)

Summary: Get group details Description: Get details of group specified by group ID.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.GroupBuilderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupBuilderApi apiInstance = new GroupBuilderApi(defaultClient);
    Integer groupId = 56; // Integer | Group ID.
    String filter = "filter_example"; // String | Filter by group member name.
    String order = "order_example"; // String | Order by ascending (ASC) or descending (DESC).
    try {
      Groupbuilderv3GetGroupDetailResponse result = apiInstance.groupBuilderGetGroupDetails(groupId, filter, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuilderApi#groupBuilderGetGroupDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupId** | **Integer**| Group ID. | |
| **filter** | **String**| Filter by group member name. | [optional] |
| **order** | **String**| Order by ascending (ASC) or descending (DESC). | [optional] |

### Return type

[**Groupbuilderv3GetGroupDetailResponse**](Groupbuilderv3GetGroupDetailResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="groupBuilderGetGroupMembers"></a>
# **groupBuilderGetGroupMembers**
> Groupbuilderv3GetGroupMembersResponse groupBuilderGetGroupMembers(groupbuilderv3GetGroupMembersRequest)

Summary: Get group members Description: Get members of all the group ids provided in the request. To be consumed by policy builder ms.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.GroupBuilderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupBuilderApi apiInstance = new GroupBuilderApi(defaultClient);
    Groupbuilderv3GetGroupMembersRequest groupbuilderv3GetGroupMembersRequest = new Groupbuilderv3GetGroupMembersRequest(); // Groupbuilderv3GetGroupMembersRequest | 
    try {
      Groupbuilderv3GetGroupMembersResponse result = apiInstance.groupBuilderGetGroupMembers(groupbuilderv3GetGroupMembersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuilderApi#groupBuilderGetGroupMembers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupbuilderv3GetGroupMembersRequest** | [**Groupbuilderv3GetGroupMembersRequest**](Groupbuilderv3GetGroupMembersRequest.md)|  | |

### Return type

[**Groupbuilderv3GetGroupMembersResponse**](Groupbuilderv3GetGroupMembersResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="groupBuilderGetGroupSyncMapping"></a>
# **groupBuilderGetGroupSyncMapping**
> Groupbuilderv3GetGroupSyncMappingResponse groupBuilderGetGroupSyncMapping(centralManagerId)

Summary: Get gdp to gi group mapping Description: Get insights to gdp group sync mapping.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.GroupBuilderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupBuilderApi apiInstance = new GroupBuilderApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | Central manager.
    try {
      Groupbuilderv3GetGroupSyncMappingResponse result = apiInstance.groupBuilderGetGroupSyncMapping(centralManagerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuilderApi#groupBuilderGetGroupSyncMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **centralManagerId** | **String**| Central manager. | [optional] |

### Return type

[**Groupbuilderv3GetGroupSyncMappingResponse**](Groupbuilderv3GetGroupSyncMappingResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="groupBuilderGetGroupTypeMapping"></a>
# **groupBuilderGetGroupTypeMapping**
> Groupbuilderv3GetGroupTypeMappingResponse groupBuilderGetGroupTypeMapping()

Summary: Get group type mapping Description: Get insights to gdp group types mapping.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.GroupBuilderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupBuilderApi apiInstance = new GroupBuilderApi(defaultClient);
    try {
      Groupbuilderv3GetGroupTypeMappingResponse result = apiInstance.groupBuilderGetGroupTypeMapping();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuilderApi#groupBuilderGetGroupTypeMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Groupbuilderv3GetGroupTypeMappingResponse**](Groupbuilderv3GetGroupTypeMappingResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="groupBuilderGetGroupTypes"></a>
# **groupBuilderGetGroupTypes**
> Groupbuilderv3GetGroupTypesResponse groupBuilderGetGroupTypes()

Summary: Get group types Description: Get a list of available group types.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.GroupBuilderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupBuilderApi apiInstance = new GroupBuilderApi(defaultClient);
    try {
      Groupbuilderv3GetGroupTypesResponse result = apiInstance.groupBuilderGetGroupTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuilderApi#groupBuilderGetGroupTypes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Groupbuilderv3GetGroupTypesResponse**](Groupbuilderv3GetGroupTypesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="groupBuilderGetGroups"></a>
# **groupBuilderGetGroups**
> Groupbuilderv3GetGroupsResponse groupBuilderGetGroups(doNotIncludeMemberCount, onlyFullAccess, nonNested)

Summary: Get groups Description: Get a list of imported group members.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.GroupBuilderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupBuilderApi apiInstance = new GroupBuilderApi(defaultClient);
    Boolean doNotIncludeMemberCount = true; // Boolean | Return group names, ID's, type ID's, nested bool, and tuple count only if the flag is true.
    Boolean onlyFullAccess = true; // Boolean | Only return groups that user has full-access to.
    Boolean nonNested = true; // Boolean | Only return non-nested groups.
    try {
      Groupbuilderv3GetGroupsResponse result = apiInstance.groupBuilderGetGroups(doNotIncludeMemberCount, onlyFullAccess, nonNested);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuilderApi#groupBuilderGetGroups");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **doNotIncludeMemberCount** | **Boolean**| Return group names, ID&#39;s, type ID&#39;s, nested bool, and tuple count only if the flag is true. | [optional] |
| **onlyFullAccess** | **Boolean**| Only return groups that user has full-access to. | [optional] |
| **nonNested** | **Boolean**| Only return non-nested groups. | [optional] |

### Return type

[**Groupbuilderv3GetGroupsResponse**](Groupbuilderv3GetGroupsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="groupBuilderGetImportGroups"></a>
# **groupBuilderGetImportGroups**
> Groupbuilderv3GetImportGroupsResponse groupBuilderGetImportGroups(centralManagerId)

Summary: Get import groups Description: Get unsynchronized groups from a central manager.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.GroupBuilderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupBuilderApi apiInstance = new GroupBuilderApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | Central manager host name.
    try {
      Groupbuilderv3GetImportGroupsResponse result = apiInstance.groupBuilderGetImportGroups(centralManagerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuilderApi#groupBuilderGetImportGroups");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **centralManagerId** | **String**| Central manager host name. | [optional] |

### Return type

[**Groupbuilderv3GetImportGroupsResponse**](Groupbuilderv3GetImportGroupsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="groupBuilderImportGroup"></a>
# **groupBuilderImportGroup**
> Groupbuilderv3ImportGroupResponse groupBuilderImportGroup(groupbuilderv3ImportGroupRequest)

Summary: Import group Description: Import selected groups from a central manager. (This API is called from GDP only)

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.GroupBuilderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupBuilderApi apiInstance = new GroupBuilderApi(defaultClient);
    Groupbuilderv3ImportGroupRequest groupbuilderv3ImportGroupRequest = new Groupbuilderv3ImportGroupRequest(); // Groupbuilderv3ImportGroupRequest | 
    try {
      Groupbuilderv3ImportGroupResponse result = apiInstance.groupBuilderImportGroup(groupbuilderv3ImportGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuilderApi#groupBuilderImportGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupbuilderv3ImportGroupRequest** | [**Groupbuilderv3ImportGroupRequest**](Groupbuilderv3ImportGroupRequest.md)|  | |

### Return type

[**Groupbuilderv3ImportGroupResponse**](Groupbuilderv3ImportGroupResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="groupBuilderRefreshGroups"></a>
# **groupBuilderRefreshGroups**
> Groupbuilderv3RefreshGroupsResponse groupBuilderRefreshGroups(groupbuilderv3RefreshGroupsRequest)

Summary: Refresh groups Description: Refresh tenants selected imported groups.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.GroupBuilderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupBuilderApi apiInstance = new GroupBuilderApi(defaultClient);
    Groupbuilderv3RefreshGroupsRequest groupbuilderv3RefreshGroupsRequest = new Groupbuilderv3RefreshGroupsRequest(); // Groupbuilderv3RefreshGroupsRequest | 
    try {
      Groupbuilderv3RefreshGroupsResponse result = apiInstance.groupBuilderRefreshGroups(groupbuilderv3RefreshGroupsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuilderApi#groupBuilderRefreshGroups");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupbuilderv3RefreshGroupsRequest** | [**Groupbuilderv3RefreshGroupsRequest**](Groupbuilderv3RefreshGroupsRequest.md)|  | |

### Return type

[**Groupbuilderv3RefreshGroupsResponse**](Groupbuilderv3RefreshGroupsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="groupBuilderResetGroups"></a>
# **groupBuilderResetGroups**
> Groupbuilderv3ResetGroupsResponse groupBuilderResetGroups(groupbuilderv3ResetGroupsRequest)

Summary: Reset groups Description: Resets tenants selected predefined groups.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.GroupBuilderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupBuilderApi apiInstance = new GroupBuilderApi(defaultClient);
    Groupbuilderv3ResetGroupsRequest groupbuilderv3ResetGroupsRequest = new Groupbuilderv3ResetGroupsRequest(); // Groupbuilderv3ResetGroupsRequest | 
    try {
      Groupbuilderv3ResetGroupsResponse result = apiInstance.groupBuilderResetGroups(groupbuilderv3ResetGroupsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuilderApi#groupBuilderResetGroups");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupbuilderv3ResetGroupsRequest** | [**Groupbuilderv3ResetGroupsRequest**](Groupbuilderv3ResetGroupsRequest.md)|  | |

### Return type

[**Groupbuilderv3ResetGroupsResponse**](Groupbuilderv3ResetGroupsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="groupBuilderStoreGroupMembersGdp"></a>
# **groupBuilderStoreGroupMembersGdp**
> Groupbuilderv3StoreGroupMembersGdpResponse groupBuilderStoreGroupMembersGdp(centralManagerId, groupbuilderv3StoreGroupMembersGdpRequest)

Summary: Store group members Gdp Description: Store GDP groups. (This API is called from GDP only)

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.GroupBuilderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupBuilderApi apiInstance = new GroupBuilderApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | ID of central manager.
    Groupbuilderv3StoreGroupMembersGdpRequest groupbuilderv3StoreGroupMembersGdpRequest = new Groupbuilderv3StoreGroupMembersGdpRequest(); // Groupbuilderv3StoreGroupMembersGdpRequest | 
    try {
      Groupbuilderv3StoreGroupMembersGdpResponse result = apiInstance.groupBuilderStoreGroupMembersGdp(centralManagerId, groupbuilderv3StoreGroupMembersGdpRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuilderApi#groupBuilderStoreGroupMembersGdp");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **centralManagerId** | **String**| ID of central manager. | |
| **groupbuilderv3StoreGroupMembersGdpRequest** | [**Groupbuilderv3StoreGroupMembersGdpRequest**](Groupbuilderv3StoreGroupMembersGdpRequest.md)|  | |

### Return type

[**Groupbuilderv3StoreGroupMembersGdpResponse**](Groupbuilderv3StoreGroupMembersGdpResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="groupBuilderStoreGroupsGdp"></a>
# **groupBuilderStoreGroupsGdp**
> Groupbuilderv3GetGroupsResponseGdp groupBuilderStoreGroupsGdp(centralManagerId, groupbuilderv3GetGroupsRequestGdp)

Summary: Store groups Gdp Description: Store GDP groups. (This API is called from GDP only)

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.GroupBuilderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    GroupBuilderApi apiInstance = new GroupBuilderApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | ID of central manager.
    Groupbuilderv3GetGroupsRequestGdp groupbuilderv3GetGroupsRequestGdp = new Groupbuilderv3GetGroupsRequestGdp(); // Groupbuilderv3GetGroupsRequestGdp | 
    try {
      Groupbuilderv3GetGroupsResponseGdp result = apiInstance.groupBuilderStoreGroupsGdp(centralManagerId, groupbuilderv3GetGroupsRequestGdp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuilderApi#groupBuilderStoreGroupsGdp");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **centralManagerId** | **String**| ID of central manager. | |
| **groupbuilderv3GetGroupsRequestGdp** | [**Groupbuilderv3GetGroupsRequestGdp**](Groupbuilderv3GetGroupsRequestGdp.md)|  | |

### Return type

[**Groupbuilderv3GetGroupsResponseGdp**](Groupbuilderv3GetGroupsResponseGdp.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

