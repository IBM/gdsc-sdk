# Reportsv3CreateProgramRequest

CreateProgramRequest is the argument type used to create a unique programs.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**program** | [**Reportsv3Program**](Reportsv3Program.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_create_program_request import Reportsv3CreateProgramRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3CreateProgramRequest from a JSON string
reportsv3_create_program_request_instance = Reportsv3CreateProgramRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3CreateProgramRequest.to_json())

# convert the object into a dict
reportsv3_create_program_request_dict = reportsv3_create_program_request_instance.to_dict()
# create an instance of Reportsv3CreateProgramRequest from a dict
reportsv3_create_program_request_from_dict = Reportsv3CreateProgramRequest.from_dict(reportsv3_create_program_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


