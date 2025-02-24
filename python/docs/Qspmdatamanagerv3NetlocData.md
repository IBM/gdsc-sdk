# Qspmdatamanagerv3NetlocData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**netloc_city** | **str** |  | [optional] 
**netloc_country** | **str** |  | [optional] 
**netloc_data_center** | **str** |  | [optional] 
**netloc_dns** | **str** |  | [optional] 
**netloc_host** | **str** |  | [optional] 
**netloc_port** | **str** |  | [optional] 
**netloc_region** | **str** |  | [optional] 
**netloc_state_prov** | **str** |  | [optional] 
**netloc_uuid** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.qspmdatamanagerv3_netloc_data import Qspmdatamanagerv3NetlocData

# TODO update the JSON string below
json = "{}"
# create an instance of Qspmdatamanagerv3NetlocData from a JSON string
qspmdatamanagerv3_netloc_data_instance = Qspmdatamanagerv3NetlocData.from_json(json)
# print the JSON string representation of the object
print(Qspmdatamanagerv3NetlocData.to_json())

# convert the object into a dict
qspmdatamanagerv3_netloc_data_dict = qspmdatamanagerv3_netloc_data_instance.to_dict()
# create an instance of Qspmdatamanagerv3NetlocData from a dict
qspmdatamanagerv3_netloc_data_from_dict = Qspmdatamanagerv3NetlocData.from_dict(qspmdatamanagerv3_netloc_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


