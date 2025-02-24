# Featureflagsv3FeatureFlagValue

FeatureFlagValue feature flag value model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_enabled** | **bool** | Feature flag enabled or not. | [optional] 
**value** | **str** | Optional: additional value for the feature flag. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.featureflagsv3_feature_flag_value import Featureflagsv3FeatureFlagValue

# TODO update the JSON string below
json = "{}"
# create an instance of Featureflagsv3FeatureFlagValue from a JSON string
featureflagsv3_feature_flag_value_instance = Featureflagsv3FeatureFlagValue.from_json(json)
# print the JSON string representation of the object
print(Featureflagsv3FeatureFlagValue.to_json())

# convert the object into a dict
featureflagsv3_feature_flag_value_dict = featureflagsv3_feature_flag_value_instance.to_dict()
# create an instance of Featureflagsv3FeatureFlagValue from a dict
featureflagsv3_feature_flag_value_from_dict = Featureflagsv3FeatureFlagValue.from_dict(featureflagsv3_feature_flag_value_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


