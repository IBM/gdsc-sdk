# Reportsv3UpdateProgramRequest

UpdateProgramRequest is the argument type used to update a programs.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**program** | [**Reportsv3Program**](Reportsv3Program.md) |  | [optional] 
**program_id** | **int** | The id of the programs that was updated. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_update_program_request import Reportsv3UpdateProgramRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3UpdateProgramRequest from a JSON string
reportsv3_update_program_request_instance = Reportsv3UpdateProgramRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3UpdateProgramRequest.to_json())

# convert the object into a dict
reportsv3_update_program_request_dict = reportsv3_update_program_request_instance.to_dict()
# create an instance of Reportsv3UpdateProgramRequest from a dict
reportsv3_update_program_request_from_dict = Reportsv3UpdateProgramRequest.from_dict(reportsv3_update_program_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


