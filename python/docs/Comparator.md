# Comparator


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **float** |  | 
**operator** | [**Operator**](Operator.md) |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.comparator import Comparator

# TODO update the JSON string below
json = "{}"
# create an instance of Comparator from a JSON string
comparator_instance = Comparator.from_json(json)
# print the JSON string representation of the object
print(Comparator.to_json())

# convert the object into a dict
comparator_dict = comparator_instance.to_dict()
# create an instance of Comparator from a dict
comparator_from_dict = Comparator.from_dict(comparator_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


