# Qspmdatamanagerv3SearchEntityDataRequest

SearchEntityDataRequest is the request object for SearchEntityData API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**columns** | **List[str]** |  | [optional] 
**filter** | **str** |  | [optional] 
**limit** | **str** |  | [optional] 
**table_name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.qspmdatamanagerv3_search_entity_data_request import Qspmdatamanagerv3SearchEntityDataRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Qspmdatamanagerv3SearchEntityDataRequest from a JSON string
qspmdatamanagerv3_search_entity_data_request_instance = Qspmdatamanagerv3SearchEntityDataRequest.from_json(json)
# print the JSON string representation of the object
print(Qspmdatamanagerv3SearchEntityDataRequest.to_json())

# convert the object into a dict
qspmdatamanagerv3_search_entity_data_request_dict = qspmdatamanagerv3_search_entity_data_request_instance.to_dict()
# create an instance of Qspmdatamanagerv3SearchEntityDataRequest from a dict
qspmdatamanagerv3_search_entity_data_request_from_dict = Qspmdatamanagerv3SearchEntityDataRequest.from_dict(qspmdatamanagerv3_search_entity_data_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


