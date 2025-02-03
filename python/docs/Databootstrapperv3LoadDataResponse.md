# Databootstrapperv3LoadDataResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Success or error message. | [optional] 
**status** | **int** | Http status code. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.databootstrapperv3_load_data_response import Databootstrapperv3LoadDataResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Databootstrapperv3LoadDataResponse from a JSON string
databootstrapperv3_load_data_response_instance = Databootstrapperv3LoadDataResponse.from_json(json)
# print the JSON string representation of the object
print(Databootstrapperv3LoadDataResponse.to_json())

# convert the object into a dict
databootstrapperv3_load_data_response_dict = databootstrapperv3_load_data_response_instance.to_dict()
# create an instance of Databootstrapperv3LoadDataResponse from a dict
databootstrapperv3_load_data_response_from_dict = Databootstrapperv3LoadDataResponse.from_dict(databootstrapperv3_load_data_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


