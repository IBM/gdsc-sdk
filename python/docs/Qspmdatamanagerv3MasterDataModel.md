# Qspmdatamanagerv3MasterDataModel


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creation_ts** | **datetime** |  | [optional] 
**ref_desc** | **str** |  | [optional] 
**ref_has_schema** | **bool** |  | [optional] 
**ref_id** | **str** |  | [optional] 
**ref_name** | **str** |  | [optional] 
**ref_schema** | [**ProtobufAny**](ProtobufAny.md) |  | [optional] 
**ref_type** | **str** |  | [optional] 
**ref_value** | **str** |  | [optional] 
**ref_version** | **str** |  | [optional] 
**updation_ts** | **datetime** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.qspmdatamanagerv3_master_data_model import Qspmdatamanagerv3MasterDataModel

# TODO update the JSON string below
json = "{}"
# create an instance of Qspmdatamanagerv3MasterDataModel from a JSON string
qspmdatamanagerv3_master_data_model_instance = Qspmdatamanagerv3MasterDataModel.from_json(json)
# print the JSON string representation of the object
print(Qspmdatamanagerv3MasterDataModel.to_json())

# convert the object into a dict
qspmdatamanagerv3_master_data_model_dict = qspmdatamanagerv3_master_data_model_instance.to_dict()
# create an instance of Qspmdatamanagerv3MasterDataModel from a dict
qspmdatamanagerv3_master_data_model_from_dict = Qspmdatamanagerv3MasterDataModel.from_dict(qspmdatamanagerv3_master_data_model_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


