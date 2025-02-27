# GetSSODetails200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorization_endpoint** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.get_sso_details200_response import GetSSODetails200Response

# TODO update the JSON string below
json = "{}"
# create an instance of GetSSODetails200Response from a JSON string
get_sso_details200_response_instance = GetSSODetails200Response.from_json(json)
# print the JSON string representation of the object
print(GetSSODetails200Response.to_json())

# convert the object into a dict
get_sso_details200_response_dict = get_sso_details200_response_instance.to_dict()
# create an instance of GetSSODetails200Response from a dict
get_sso_details200_response_from_dict = GetSSODetails200Response.from_dict(get_sso_details200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


