# Resourcecontrollerk8v3Cron

Cron contains the information about the cron configuration for a job.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schedule** | **str** | Run this job on a schedule. Accepts a valid cron string. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_cron import Resourcecontrollerk8v3Cron

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3Cron from a JSON string
resourcecontrollerk8v3_cron_instance = Resourcecontrollerk8v3Cron.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3Cron.to_json())

# convert the object into a dict
resourcecontrollerk8v3_cron_dict = resourcecontrollerk8v3_cron_instance.to_dict()
# create an instance of Resourcecontrollerk8v3Cron from a dict
resourcecontrollerk8v3_cron_from_dict = Resourcecontrollerk8v3Cron.from_dict(resourcecontrollerk8v3_cron_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


