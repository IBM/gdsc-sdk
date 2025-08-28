# Reportsv3GetRequirementsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requirement** | [**List[Reportsv3Requirement]**](Reportsv3Requirement.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_get_requirements_response import Reportsv3GetRequirementsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GetRequirementsResponse from a JSON string
reportsv3_get_requirements_response_instance = Reportsv3GetRequirementsResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GetRequirementsResponse.to_json())

# convert the object into a dict
reportsv3_get_requirements_response_dict = reportsv3_get_requirements_response_instance.to_dict()
# create an instance of Reportsv3GetRequirementsResponse from a dict
reportsv3_get_requirements_response_from_dict = Reportsv3GetRequirementsResponse.from_dict(reportsv3_get_requirements_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


