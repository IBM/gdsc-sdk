# Qspmdatamanagerv3InsertEntitiesRequest

InsertEntitiesRequest is the request object for InsertAllEntities API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dims** | **List[object]** |  | [optional] 
**facts** | **List[object]** |  | [optional] 
**policysqls** | **List[str]** |  | [optional] 
**scan_id** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.qspmdatamanagerv3_insert_entities_request import Qspmdatamanagerv3InsertEntitiesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Qspmdatamanagerv3InsertEntitiesRequest from a JSON string
qspmdatamanagerv3_insert_entities_request_instance = Qspmdatamanagerv3InsertEntitiesRequest.from_json(json)
# print the JSON string representation of the object
print(Qspmdatamanagerv3InsertEntitiesRequest.to_json())

# convert the object into a dict
qspmdatamanagerv3_insert_entities_request_dict = qspmdatamanagerv3_insert_entities_request_instance.to_dict()
# create an instance of Qspmdatamanagerv3InsertEntitiesRequest from a dict
qspmdatamanagerv3_insert_entities_request_from_dict = Qspmdatamanagerv3InsertEntitiesRequest.from_dict(qspmdatamanagerv3_insert_entities_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


