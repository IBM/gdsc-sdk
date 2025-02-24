# Dashboardsv3Card

Cards - a small-scale representation of a Dashboard Card.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**card_id** | **str** | Card ID. | [optional] 
**card_position** | [**Dashboardsv3CardPosition**](Dashboardsv3CardPosition.md) |  | [optional] 
**card_type** | [**Dashboardsv3CardType**](Dashboardsv3CardType.md) |  | [optional] 
**excluded_global_filter_ids** | **List[str]** |  | [optional] 
**report_parameters** | [**Dashboardsv3ReportParameters**](Dashboardsv3ReportParameters.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.dashboardsv3_card import Dashboardsv3Card

# TODO update the JSON string below
json = "{}"
# create an instance of Dashboardsv3Card from a JSON string
dashboardsv3_card_instance = Dashboardsv3Card.from_json(json)
# print the JSON string representation of the object
print(Dashboardsv3Card.to_json())

# convert the object into a dict
dashboardsv3_card_dict = dashboardsv3_card_instance.to_dict()
# create an instance of Dashboardsv3Card from a dict
dashboardsv3_card_from_dict = Dashboardsv3Card.from_dict(dashboardsv3_card_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


