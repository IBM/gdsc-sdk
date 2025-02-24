# Qspmdatamanagerv3SearchEntityDataResponse

SearchEntityDataResponse is the response object for SearchEntityData API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rows** | [**List[Qspmdatamanagerv3Row]**](Qspmdatamanagerv3Row.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.qspmdatamanagerv3_search_entity_data_response import Qspmdatamanagerv3SearchEntityDataResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Qspmdatamanagerv3SearchEntityDataResponse from a JSON string
qspmdatamanagerv3_search_entity_data_response_instance = Qspmdatamanagerv3SearchEntityDataResponse.from_json(json)
# print the JSON string representation of the object
print(Qspmdatamanagerv3SearchEntityDataResponse.to_json())

# convert the object into a dict
qspmdatamanagerv3_search_entity_data_response_dict = qspmdatamanagerv3_search_entity_data_response_instance.to_dict()
# create an instance of Qspmdatamanagerv3SearchEntityDataResponse from a dict
qspmdatamanagerv3_search_entity_data_response_from_dict = Qspmdatamanagerv3SearchEntityDataResponse.from_dict(qspmdatamanagerv3_search_entity_data_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


