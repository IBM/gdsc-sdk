# Dashboardsv3CardPosition

CardPosition - Positioning parameters for a card on a dashboard.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**height** | **float** | Card Height. | [optional] 
**width** | **float** | Card Width. | [optional] 
**x_position** | **float** | Card X Position. | [optional] 
**y_position** | **float** | Card Y Position. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.dashboardsv3_card_position import Dashboardsv3CardPosition

# TODO update the JSON string below
json = "{}"
# create an instance of Dashboardsv3CardPosition from a JSON string
dashboardsv3_card_position_instance = Dashboardsv3CardPosition.from_json(json)
# print the JSON string representation of the object
print(Dashboardsv3CardPosition.to_json())

# convert the object into a dict
dashboardsv3_card_position_dict = dashboardsv3_card_position_instance.to_dict()
# create an instance of Dashboardsv3CardPosition from a dict
dashboardsv3_card_position_from_dict = Dashboardsv3CardPosition.from_dict(dashboardsv3_card_position_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


