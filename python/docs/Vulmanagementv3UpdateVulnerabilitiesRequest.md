# Vulmanagementv3UpdateVulnerabilitiesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**updates** | [**List[Vulmanagementv3VulnerabilityUpdate]**](Vulmanagementv3VulnerabilityUpdate.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.vulmanagementv3_update_vulnerabilities_request import Vulmanagementv3UpdateVulnerabilitiesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Vulmanagementv3UpdateVulnerabilitiesRequest from a JSON string
vulmanagementv3_update_vulnerabilities_request_instance = Vulmanagementv3UpdateVulnerabilitiesRequest.from_json(json)
# print the JSON string representation of the object
print(Vulmanagementv3UpdateVulnerabilitiesRequest.to_json())

# convert the object into a dict
vulmanagementv3_update_vulnerabilities_request_dict = vulmanagementv3_update_vulnerabilities_request_instance.to_dict()
# create an instance of Vulmanagementv3UpdateVulnerabilitiesRequest from a dict
vulmanagementv3_update_vulnerabilities_request_from_dict = Vulmanagementv3UpdateVulnerabilitiesRequest.from_dict(vulmanagementv3_update_vulnerabilities_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


