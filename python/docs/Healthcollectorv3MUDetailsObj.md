# Healthcollectorv3MUDetailsObj

MUDetailObj gets additional information about managed units.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregation_details_list** | [**List[Healthcollectorv3AggregationDetailsObject]**](Healthcollectorv3AggregationDetailsObject.md) | Aggregation details. | [optional] 
**connectivity_details** | [**Healthcollectorv3GeneralDetailsObject**](Healthcollectorv3GeneralDetailsObject.md) |  | [optional] 
**general_err_messages** | **List[str]** | Additional messages and details about managed units. | [optional] 
**utilization_parameters_values** | [**Healthcollectorv3UtilizationParameterObject**](Healthcollectorv3UtilizationParameterObject.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.healthcollectorv3_mu_details_obj import Healthcollectorv3MUDetailsObj

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3MUDetailsObj from a JSON string
healthcollectorv3_mu_details_obj_instance = Healthcollectorv3MUDetailsObj.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3MUDetailsObj.to_json())

# convert the object into a dict
healthcollectorv3_mu_details_obj_dict = healthcollectorv3_mu_details_obj_instance.to_dict()
# create an instance of Healthcollectorv3MUDetailsObj from a dict
healthcollectorv3_mu_details_obj_from_dict = Healthcollectorv3MUDetailsObj.from_dict(healthcollectorv3_mu_details_obj_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


