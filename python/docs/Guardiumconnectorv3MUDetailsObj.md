# Guardiumconnectorv3MUDetailsObj

Additional information about Managed Units.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agg_health_view_list** | [**List[Guardiumconnectorv3AggregationViewListObject]**](Guardiumconnectorv3AggregationViewListObject.md) | Aggregation details. | [optional] 
**connectivity_details** | [**Guardiumconnectorv3GeneralDetailsObject**](Guardiumconnectorv3GeneralDetailsObject.md) |  | [optional] 
**general_err_messages** | **List[str]** | Additional messages and details about managed units. | [optional] 
**utilization_scheme** | [**Guardiumconnectorv3UtilizationParameterObject**](Guardiumconnectorv3UtilizationParameterObject.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_mu_details_obj import Guardiumconnectorv3MUDetailsObj

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3MUDetailsObj from a JSON string
guardiumconnectorv3_mu_details_obj_instance = Guardiumconnectorv3MUDetailsObj.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3MUDetailsObj.to_json())

# convert the object into a dict
guardiumconnectorv3_mu_details_obj_dict = guardiumconnectorv3_mu_details_obj_instance.to_dict()
# create an instance of Guardiumconnectorv3MUDetailsObj from a dict
guardiumconnectorv3_mu_details_obj_from_dict = Guardiumconnectorv3MUDetailsObj.from_dict(guardiumconnectorv3_mu_details_obj_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


