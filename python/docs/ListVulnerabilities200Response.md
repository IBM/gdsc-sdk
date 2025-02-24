# ListVulnerabilities200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**results** | [**List[VulnerabilityListItem]**](VulnerabilityListItem.md) |  | 
**next_token** | **str** |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.list_vulnerabilities200_response import ListVulnerabilities200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ListVulnerabilities200Response from a JSON string
list_vulnerabilities200_response_instance = ListVulnerabilities200Response.from_json(json)
# print the JSON string representation of the object
print(ListVulnerabilities200Response.to_json())

# convert the object into a dict
list_vulnerabilities200_response_dict = list_vulnerabilities200_response_instance.to_dict()
# create an instance of ListVulnerabilities200Response from a dict
list_vulnerabilities200_response_from_dict = ListVulnerabilities200Response.from_dict(list_vulnerabilities200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


