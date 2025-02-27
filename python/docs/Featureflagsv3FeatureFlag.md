# Featureflagsv3FeatureFlag

FeatureFlag feature flag model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flag_name** | **str** | Flag name. | [optional] 
**is_enabled** | **bool** | Feature flag enabled or not. | [optional] 
**value** | **str** | Optional: additional value for the feature flag. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.featureflagsv3_feature_flag import Featureflagsv3FeatureFlag

# TODO update the JSON string below
json = "{}"
# create an instance of Featureflagsv3FeatureFlag from a JSON string
featureflagsv3_feature_flag_instance = Featureflagsv3FeatureFlag.from_json(json)
# print the JSON string representation of the object
print(Featureflagsv3FeatureFlag.to_json())

# convert the object into a dict
featureflagsv3_feature_flag_dict = featureflagsv3_feature_flag_instance.to_dict()
# create an instance of Featureflagsv3FeatureFlag from a dict
featureflagsv3_feature_flag_from_dict = Featureflagsv3FeatureFlag.from_dict(featureflagsv3_feature_flag_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


