# Edgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse

Response message to Monitoring Edge Query Pending Response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**edge_result_report_id** | **str** |  | [optional] 
**heartbeat** | **str** |  | [optional] 
**query** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.edgeschedulerv3_monitoring_pending_request_for_edge_query_response import Edgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Edgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse from a JSON string
edgeschedulerv3_monitoring_pending_request_for_edge_query_response_instance = Edgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse.from_json(json)
# print the JSON string representation of the object
print(Edgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse.to_json())

# convert the object into a dict
edgeschedulerv3_monitoring_pending_request_for_edge_query_response_dict = edgeschedulerv3_monitoring_pending_request_for_edge_query_response_instance.to_dict()
# create an instance of Edgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse from a dict
edgeschedulerv3_monitoring_pending_request_for_edge_query_response_from_dict = Edgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse.from_dict(edgeschedulerv3_monitoring_pending_request_for_edge_query_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


