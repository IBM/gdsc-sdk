# Databootstrapperv3LoadDataRequest

Load data request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**part_number** | **str** | The part number. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.databootstrapperv3_load_data_request import Databootstrapperv3LoadDataRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Databootstrapperv3LoadDataRequest from a JSON string
databootstrapperv3_load_data_request_instance = Databootstrapperv3LoadDataRequest.from_json(json)
# print the JSON string representation of the object
print(Databootstrapperv3LoadDataRequest.to_json())

# convert the object into a dict
databootstrapperv3_load_data_request_dict = databootstrapperv3_load_data_request_instance.to_dict()
# create an instance of Databootstrapperv3LoadDataRequest from a dict
databootstrapperv3_load_data_request_from_dict = Databootstrapperv3LoadDataRequest.from_dict(databootstrapperv3_load_data_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


