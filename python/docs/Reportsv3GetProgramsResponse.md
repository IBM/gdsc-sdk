# Reportsv3GetProgramsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**programs** | [**List[Reportsv3Program]**](Reportsv3Program.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_get_programs_response import Reportsv3GetProgramsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GetProgramsResponse from a JSON string
reportsv3_get_programs_response_instance = Reportsv3GetProgramsResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GetProgramsResponse.to_json())

# convert the object into a dict
reportsv3_get_programs_response_dict = reportsv3_get_programs_response_instance.to_dict()
# create an instance of Reportsv3GetProgramsResponse from a dict
reportsv3_get_programs_response_from_dict = Reportsv3GetProgramsResponse.from_dict(reportsv3_get_programs_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


