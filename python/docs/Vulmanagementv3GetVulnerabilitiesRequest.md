# Vulmanagementv3GetVulnerabilitiesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filter** | [**List[Vulmanagementv3FilterCategory]**](Vulmanagementv3FilterCategory.md) | Applied filter list for vulnerability list. | [optional] 
**limit** | **int** | The max amount of rows to return for pagination. | [optional] 
**offset** | **int** | The amount to offset the rows by for pagination. | [optional] 
**search_key** | **str** | Search key for vulnerability list. | [optional] 
**sort_column** | **str** |  | [optional] 
**sort_order** | [**Vulmanagementv3SortOrder**](Vulmanagementv3SortOrder.md) |  | [optional] [default to Vulmanagementv3SortOrder.ASC]

## Example

```python
from ibm_gdsc_sdk_saas.models.vulmanagementv3_get_vulnerabilities_request import Vulmanagementv3GetVulnerabilitiesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Vulmanagementv3GetVulnerabilitiesRequest from a JSON string
vulmanagementv3_get_vulnerabilities_request_instance = Vulmanagementv3GetVulnerabilitiesRequest.from_json(json)
# print the JSON string representation of the object
print(Vulmanagementv3GetVulnerabilitiesRequest.to_json())

# convert the object into a dict
vulmanagementv3_get_vulnerabilities_request_dict = vulmanagementv3_get_vulnerabilities_request_instance.to_dict()
# create an instance of Vulmanagementv3GetVulnerabilitiesRequest from a dict
vulmanagementv3_get_vulnerabilities_request_from_dict = Vulmanagementv3GetVulnerabilitiesRequest.from_dict(vulmanagementv3_get_vulnerabilities_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


