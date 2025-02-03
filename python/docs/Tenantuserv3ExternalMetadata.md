# Tenantuserv3ExternalMetadata

ExternalMetadata external metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**add_ons** | [**Dict[str, Tenantuserv3Prometheus]**](Tenantuserv3Prometheus.md) | Add ons. | [optional] 
**crn** | **str** |  | [optional] 
**expiration_date** | **datetime** |  | [optional] 
**instance_id** | **str** | Instance id. | [optional] 
**part_number** | **str** | Part number. | [optional] 
**plan_id** | **str** | Plan id. | [optional] 
**service_id** | **str** | Service id. | [optional] 
**subscription_id** | **str** | Subscription id. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.tenantuserv3_external_metadata import Tenantuserv3ExternalMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3ExternalMetadata from a JSON string
tenantuserv3_external_metadata_instance = Tenantuserv3ExternalMetadata.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3ExternalMetadata.to_json())

# convert the object into a dict
tenantuserv3_external_metadata_dict = tenantuserv3_external_metadata_instance.to_dict()
# create an instance of Tenantuserv3ExternalMetadata from a dict
tenantuserv3_external_metadata_from_dict = Tenantuserv3ExternalMetadata.from_dict(tenantuserv3_external_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


