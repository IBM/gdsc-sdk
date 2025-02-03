# ListVulnerabilitiesByDataStore200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**results** | [**List[VulnerabilityByDataStoreListItem]**](VulnerabilityByDataStoreListItem.md) |  | 
**next_token** | **str** |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.list_vulnerabilities_by_data_store200_response import ListVulnerabilitiesByDataStore200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ListVulnerabilitiesByDataStore200Response from a JSON string
list_vulnerabilities_by_data_store200_response_instance = ListVulnerabilitiesByDataStore200Response.from_json(json)
# print the JSON string representation of the object
print(ListVulnerabilitiesByDataStore200Response.to_json())

# convert the object into a dict
list_vulnerabilities_by_data_store200_response_dict = list_vulnerabilities_by_data_store200_response_instance.to_dict()
# create an instance of ListVulnerabilitiesByDataStore200Response from a dict
list_vulnerabilities_by_data_store200_response_from_dict = ListVulnerabilitiesByDataStore200Response.from_dict(list_vulnerabilities_by_data_store200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


