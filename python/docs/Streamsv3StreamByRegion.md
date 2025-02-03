# Streamsv3StreamByRegion

StreamByRegion defines an array of streams.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stream** | **List[str]** | Array of streams. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.streamsv3_stream_by_region import Streamsv3StreamByRegion

# TODO update the JSON string below
json = "{}"
# create an instance of Streamsv3StreamByRegion from a JSON string
streamsv3_stream_by_region_instance = Streamsv3StreamByRegion.from_json(json)
# print the JSON string representation of the object
print(Streamsv3StreamByRegion.to_json())

# convert the object into a dict
streamsv3_stream_by_region_dict = streamsv3_stream_by_region_instance.to_dict()
# create an instance of Streamsv3StreamByRegion from a dict
streamsv3_stream_by_region_from_dict = Streamsv3StreamByRegion.from_dict(streamsv3_stream_by_region_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


