# Reportsv3DeleteProgramRequest

DeleteProgramRequest is the request for deleting a programs.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**program_id** | **int** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_delete_program_request import Reportsv3DeleteProgramRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3DeleteProgramRequest from a JSON string
reportsv3_delete_program_request_instance = Reportsv3DeleteProgramRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3DeleteProgramRequest.to_json())

# convert the object into a dict
reportsv3_delete_program_request_dict = reportsv3_delete_program_request_instance.to_dict()
# create an instance of Reportsv3DeleteProgramRequest from a dict
reportsv3_delete_program_request_from_dict = Reportsv3DeleteProgramRequest.from_dict(reportsv3_delete_program_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


