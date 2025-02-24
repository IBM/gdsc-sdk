# Assetsv3Asset


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_name** | **str** |  | [optional] 
**application_version** | **str** |  | [optional] 
**asset_subtype** | **str** |  | [optional] 
**asset_type** | **str** |  | [optional] 
**connectivity** | [**Assetsv3HealthType**](Assetsv3HealthType.md) |  | [optional] 
**critical_va_count** | **int** |  | [optional] 
**database** | **str** |  | [optional] 
**db_id** | **str** |  | [optional] 
**deployment** | **str** |  | [optional] 
**encryption** | [**Assetsv3StatusType**](Assetsv3StatusType.md) |  | [optional] 
**endpoint_name** | **str** |  | [optional] 
**entity_id** | **str** | entity ID which was inserted/updated. | [optional] 
**entity_type** | **str** |  | [optional] 
**extended_properties** | [**List[Assetsv3ExtendedProp]**](Assetsv3ExtendedProp.md) |  | [optional] 
**gdp_data_sources** | **str** |  | [optional] 
**grouper_id** | **int** | grouper ID which was grouped assets. | [optional] 
**host** | **str** |  | [optional] 
**host_id** | **str** |  | [optional] 
**host_port** | **str** |  | [optional] 
**ip** | **str** |  | [optional] 
**ip_port** | **str** |  | [optional] 
**is_splittable** | **bool** |  | [optional] 
**mac_address** | **str** |  | [optional] 
**model_name** | **str** |  | [optional] 
**monitoring** | [**Assetsv3StatusType**](Assetsv3StatusType.md) |  | [optional] 
**name** | **str** |  | [optional] 
**origin** | **List[str]** |  | [optional] 
**risk_level** | **str** |  | [optional] 
**sensitive_data** | **int** |  | [optional] 
**service** | **str** |  | [optional] 
**storage_name** | **str** |  | [optional] 
**subscription** | **str** |  | [optional] 
**tags** | **List[str]** |  | [optional] 
**total_va_count** | **int** |  | [optional] 
**traffic** | [**Assetsv3HealthType**](Assetsv3HealthType.md) |  | [optional] 
**type** | **str** |  | [optional] 
**user_accounts** | **List[str]** |  | [optional] 
**vertex_id** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_asset import Assetsv3Asset

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3Asset from a JSON string
assetsv3_asset_instance = Assetsv3Asset.from_json(json)
# print the JSON string representation of the object
print(Assetsv3Asset.to_json())

# convert the object into a dict
assetsv3_asset_dict = assetsv3_asset_instance.to_dict()
# create an instance of Assetsv3Asset from a dict
assetsv3_asset_from_dict = Assetsv3Asset.from_dict(assetsv3_asset_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


