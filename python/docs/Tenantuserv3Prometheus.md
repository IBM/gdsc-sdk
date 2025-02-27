# Tenantuserv3Prometheus

Prometheus object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unit** | **str** | Unit. | [optional] 
**value** | **str** | Value. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.tenantuserv3_prometheus import Tenantuserv3Prometheus

# TODO update the JSON string below
json = "{}"
# create an instance of Tenantuserv3Prometheus from a JSON string
tenantuserv3_prometheus_instance = Tenantuserv3Prometheus.from_json(json)
# print the JSON string representation of the object
print(Tenantuserv3Prometheus.to_json())

# convert the object into a dict
tenantuserv3_prometheus_dict = tenantuserv3_prometheus_instance.to_dict()
# create an instance of Tenantuserv3Prometheus from a dict
tenantuserv3_prometheus_from_dict = Tenantuserv3Prometheus.from_dict(tenantuserv3_prometheus_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


