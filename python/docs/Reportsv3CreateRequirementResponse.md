# Reportsv3CreateRequirementResponse

CreateRequirementResponse is the response after creating a requirements .

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requirement_id** | **int** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_create_requirement_response import Reportsv3CreateRequirementResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3CreateRequirementResponse from a JSON string
reportsv3_create_requirement_response_instance = Reportsv3CreateRequirementResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3CreateRequirementResponse.to_json())

# convert the object into a dict
reportsv3_create_requirement_response_dict = reportsv3_create_requirement_response_instance.to_dict()
# create an instance of Reportsv3CreateRequirementResponse from a dict
reportsv3_create_requirement_response_from_dict = Reportsv3CreateRequirementResponse.from_dict(reportsv3_create_requirement_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


