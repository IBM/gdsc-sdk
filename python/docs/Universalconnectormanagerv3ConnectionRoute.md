# Universalconnectormanagerv3ConnectionRoute

Describes incoming host:port into Insights; needed by client, for datasource configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**host** | **str** | URI where related Universal connector service is running/listening. | [optional] 
**port** | **str** | Port where the related Universal connector service is running/listening. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.universalconnectormanagerv3_connection_route import Universalconnectormanagerv3ConnectionRoute

# TODO update the JSON string below
json = "{}"
# create an instance of Universalconnectormanagerv3ConnectionRoute from a JSON string
universalconnectormanagerv3_connection_route_instance = Universalconnectormanagerv3ConnectionRoute.from_json(json)
# print the JSON string representation of the object
print(Universalconnectormanagerv3ConnectionRoute.to_json())

# convert the object into a dict
universalconnectormanagerv3_connection_route_dict = universalconnectormanagerv3_connection_route_instance.to_dict()
# create an instance of Universalconnectormanagerv3ConnectionRoute from a dict
universalconnectormanagerv3_connection_route_from_dict = Universalconnectormanagerv3ConnectionRoute.from_dict(universalconnectormanagerv3_connection_route_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


