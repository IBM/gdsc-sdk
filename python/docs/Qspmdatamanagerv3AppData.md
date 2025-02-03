# Qspmdatamanagerv3AppData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_client_specific** | **str** |  | [optional] 
**app_end_time** | **datetime** |  | [optional] 
**app_generic_id** | **str** |  | [optional] 
**app_name** | **str** |  | [optional] 
**app_owner_email** | **str** |  | [optional] 
**app_start_time** | **datetime** |  | [optional] 
**app_uuid** | **str** |  | [optional] 
**app_ver** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.qspmdatamanagerv3_app_data import Qspmdatamanagerv3AppData

# TODO update the JSON string below
json = "{}"
# create an instance of Qspmdatamanagerv3AppData from a JSON string
qspmdatamanagerv3_app_data_instance = Qspmdatamanagerv3AppData.from_json(json)
# print the JSON string representation of the object
print(Qspmdatamanagerv3AppData.to_json())

# convert the object into a dict
qspmdatamanagerv3_app_data_dict = qspmdatamanagerv3_app_data_instance.to_dict()
# create an instance of Qspmdatamanagerv3AppData from a dict
qspmdatamanagerv3_app_data_from_dict = Qspmdatamanagerv3AppData.from_dict(qspmdatamanagerv3_app_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


