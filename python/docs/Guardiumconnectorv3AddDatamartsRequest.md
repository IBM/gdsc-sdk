# Guardiumconnectorv3AddDatamartsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**central_manager_id** | **str** |  | [optional] 
**data** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_add_datamarts_request import Guardiumconnectorv3AddDatamartsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3AddDatamartsRequest from a JSON string
guardiumconnectorv3_add_datamarts_request_instance = Guardiumconnectorv3AddDatamartsRequest.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3AddDatamartsRequest.to_json())

# convert the object into a dict
guardiumconnectorv3_add_datamarts_request_dict = guardiumconnectorv3_add_datamarts_request_instance.to_dict()
# create an instance of Guardiumconnectorv3AddDatamartsRequest from a dict
guardiumconnectorv3_add_datamarts_request_from_dict = Guardiumconnectorv3AddDatamartsRequest.from_dict(guardiumconnectorv3_add_datamarts_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


