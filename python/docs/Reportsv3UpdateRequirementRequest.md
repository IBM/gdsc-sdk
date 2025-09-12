# Reportsv3UpdateRequirementRequest

UpdateRequirementRequest is the argument type used to update a requirements.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requirement** | [**Reportsv3Requirement**](Reportsv3Requirement.md) |  | [optional] 
**requirement_id** | **int** | The id of the requirements that was updated. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_update_requirement_request import Reportsv3UpdateRequirementRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3UpdateRequirementRequest from a JSON string
reportsv3_update_requirement_request_instance = Reportsv3UpdateRequirementRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3UpdateRequirementRequest.to_json())

# convert the object into a dict
reportsv3_update_requirement_request_dict = reportsv3_update_requirement_request_instance.to_dict()
# create an instance of Reportsv3UpdateRequirementRequest from a dict
reportsv3_update_requirement_request_from_dict = Reportsv3UpdateRequirementRequest.from_dict(reportsv3_update_requirement_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


