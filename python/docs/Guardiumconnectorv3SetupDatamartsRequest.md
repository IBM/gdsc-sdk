# Guardiumconnectorv3SetupDatamartsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**central_manager_id** | **str** |  | [optional] 
**datamarts** | [**List[Guardiumconnectorv3DatamartExecutionMode]**](Guardiumconnectorv3DatamartExecutionMode.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_setup_datamarts_request import Guardiumconnectorv3SetupDatamartsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3SetupDatamartsRequest from a JSON string
guardiumconnectorv3_setup_datamarts_request_instance = Guardiumconnectorv3SetupDatamartsRequest.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3SetupDatamartsRequest.to_json())

# convert the object into a dict
guardiumconnectorv3_setup_datamarts_request_dict = guardiumconnectorv3_setup_datamarts_request_instance.to_dict()
# create an instance of Guardiumconnectorv3SetupDatamartsRequest from a dict
guardiumconnectorv3_setup_datamarts_request_from_dict = Guardiumconnectorv3SetupDatamartsRequest.from_dict(guardiumconnectorv3_setup_datamarts_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


