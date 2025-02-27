# Healthcollectorv3MUDetailsObjGdp

MUDetailObj gets additional information about managed units.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agg_health_view_list** | [**List[Healthcollectorv3AggregationDetailsObjectGdp]**](Healthcollectorv3AggregationDetailsObjectGdp.md) | Aggregation details. | [optional] 
**connectivity_details** | [**Healthcollectorv3GeneralDetailsObject**](Healthcollectorv3GeneralDetailsObject.md) |  | [optional] 
**general_err_messages** | **List[str]** | Additional messages and details about managed units. | [optional] 
**utilization_scheme** | [**Healthcollectorv3UtilizationParameterObjectGdp**](Healthcollectorv3UtilizationParameterObjectGdp.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.healthcollectorv3_mu_details_obj_gdp import Healthcollectorv3MUDetailsObjGdp

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3MUDetailsObjGdp from a JSON string
healthcollectorv3_mu_details_obj_gdp_instance = Healthcollectorv3MUDetailsObjGdp.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3MUDetailsObjGdp.to_json())

# convert the object into a dict
healthcollectorv3_mu_details_obj_gdp_dict = healthcollectorv3_mu_details_obj_gdp_instance.to_dict()
# create an instance of Healthcollectorv3MUDetailsObjGdp from a dict
healthcollectorv3_mu_details_obj_gdp_from_dict = Healthcollectorv3MUDetailsObjGdp.from_dict(healthcollectorv3_mu_details_obj_gdp_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


