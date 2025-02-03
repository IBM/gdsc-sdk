# Assetsv3ModelApplication


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_name** | **str** |  | [optional] 
**last_used** | **str** |  | [optional] 
**service_type** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_model_application import Assetsv3ModelApplication

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3ModelApplication from a JSON string
assetsv3_model_application_instance = Assetsv3ModelApplication.from_json(json)
# print the JSON string representation of the object
print(Assetsv3ModelApplication.to_json())

# convert the object into a dict
assetsv3_model_application_dict = assetsv3_model_application_instance.to_dict()
# create an instance of Assetsv3ModelApplication from a dict
assetsv3_model_application_from_dict = Assetsv3ModelApplication.from_dict(assetsv3_model_application_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


