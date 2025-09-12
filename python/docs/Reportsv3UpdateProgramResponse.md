# Reportsv3UpdateProgramResponse

UpdateProgramResponse is the response after updating a programs.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**program_id** | **int** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_update_program_response import Reportsv3UpdateProgramResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3UpdateProgramResponse from a JSON string
reportsv3_update_program_response_instance = Reportsv3UpdateProgramResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3UpdateProgramResponse.to_json())

# convert the object into a dict
reportsv3_update_program_response_dict = reportsv3_update_program_response_instance.to_dict()
# create an instance of Reportsv3UpdateProgramResponse from a dict
reportsv3_update_program_response_from_dict = Reportsv3UpdateProgramResponse.from_dict(reportsv3_update_program_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


