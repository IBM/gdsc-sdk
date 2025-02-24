# ListSensitivities200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**results** | [**List[SensitivityListItem]**](SensitivityListItem.md) |  | 
**next_token** | **str** |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.list_sensitivities200_response import ListSensitivities200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ListSensitivities200Response from a JSON string
list_sensitivities200_response_instance = ListSensitivities200Response.from_json(json)
# print the JSON string representation of the object
print(ListSensitivities200Response.to_json())

# convert the object into a dict
list_sensitivities200_response_dict = list_sensitivities200_response_instance.to_dict()
# create an instance of ListSensitivities200Response from a dict
list_sensitivities200_response_from_dict = ListSensitivities200Response.from_dict(list_sensitivities200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


