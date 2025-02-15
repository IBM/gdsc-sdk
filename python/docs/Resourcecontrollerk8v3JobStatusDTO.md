# Resourcecontrollerk8v3JobStatusDTO


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modified** | **str** | The date this job was modified (ms since epoch). | [optional] 
**status** | **str** | The job status. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.resourcecontrollerk8v3_job_status_dto import Resourcecontrollerk8v3JobStatusDTO

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3JobStatusDTO from a JSON string
resourcecontrollerk8v3_job_status_dto_instance = Resourcecontrollerk8v3JobStatusDTO.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3JobStatusDTO.to_json())

# convert the object into a dict
resourcecontrollerk8v3_job_status_dto_dict = resourcecontrollerk8v3_job_status_dto_instance.to_dict()
# create an instance of Resourcecontrollerk8v3JobStatusDTO from a dict
resourcecontrollerk8v3_job_status_dto_from_dict = Resourcecontrollerk8v3JobStatusDTO.from_dict(resourcecontrollerk8v3_job_status_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


