# Vulmanagementv3GetVulnerabilitiesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total_count** | **str** | Total count of vulnerabilities. | [optional] 
**vulnerabilities** | [**List[Vulmanagementv3Vulnerability]**](Vulmanagementv3Vulnerability.md) | List of vulnerabalities. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.vulmanagementv3_get_vulnerabilities_response import Vulmanagementv3GetVulnerabilitiesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Vulmanagementv3GetVulnerabilitiesResponse from a JSON string
vulmanagementv3_get_vulnerabilities_response_instance = Vulmanagementv3GetVulnerabilitiesResponse.from_json(json)
# print the JSON string representation of the object
print(Vulmanagementv3GetVulnerabilitiesResponse.to_json())

# convert the object into a dict
vulmanagementv3_get_vulnerabilities_response_dict = vulmanagementv3_get_vulnerabilities_response_instance.to_dict()
# create an instance of Vulmanagementv3GetVulnerabilitiesResponse from a dict
vulmanagementv3_get_vulnerabilities_response_from_dict = Vulmanagementv3GetVulnerabilitiesResponse.from_dict(vulmanagementv3_get_vulnerabilities_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


