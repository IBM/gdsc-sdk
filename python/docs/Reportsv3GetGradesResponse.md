# Reportsv3GetGradesResponse

GetGradesResponse is the response for getting a list of grades with all data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grades_list** | [**List[Reportsv3Grade]**](Reportsv3Grade.md) | List of grades. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_get_grades_response import Reportsv3GetGradesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GetGradesResponse from a JSON string
reportsv3_get_grades_response_instance = Reportsv3GetGradesResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GetGradesResponse.to_json())

# convert the object into a dict
reportsv3_get_grades_response_dict = reportsv3_get_grades_response_instance.to_dict()
# create an instance of Reportsv3GetGradesResponse from a dict
reportsv3_get_grades_response_from_dict = Reportsv3GetGradesResponse.from_dict(reportsv3_get_grades_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


