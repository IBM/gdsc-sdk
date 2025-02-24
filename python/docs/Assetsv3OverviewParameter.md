# Assetsv3OverviewParameter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**database_name** | **str** |  | [optional] 
**db_id** | **str** |  | [optional] 
**ip_host** | [**List[Assetsv3IpHost]**](Assetsv3IpHost.md) | IP addresses and hosts associated with each. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_overview_parameter import Assetsv3OverviewParameter

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3OverviewParameter from a JSON string
assetsv3_overview_parameter_instance = Assetsv3OverviewParameter.from_json(json)
# print the JSON string representation of the object
print(Assetsv3OverviewParameter.to_json())

# convert the object into a dict
assetsv3_overview_parameter_dict = assetsv3_overview_parameter_instance.to_dict()
# create an instance of Assetsv3OverviewParameter from a dict
assetsv3_overview_parameter_from_dict = Assetsv3OverviewParameter.from_dict(assetsv3_overview_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


