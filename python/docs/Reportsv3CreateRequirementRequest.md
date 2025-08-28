# Reportsv3CreateRequirementRequest

CreateRequirementRequest is the argument type used to create a unique requirements.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requirement** | [**Reportsv3Requirement**](Reportsv3Requirement.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_create_requirement_request import Reportsv3CreateRequirementRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3CreateRequirementRequest from a JSON string
reportsv3_create_requirement_request_instance = Reportsv3CreateRequirementRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3CreateRequirementRequest.to_json())

# convert the object into a dict
reportsv3_create_requirement_request_dict = reportsv3_create_requirement_request_instance.to_dict()
# create an instance of Reportsv3CreateRequirementRequest from a dict
reportsv3_create_requirement_request_from_dict = Reportsv3CreateRequirementRequest.from_dict(reportsv3_create_requirement_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


