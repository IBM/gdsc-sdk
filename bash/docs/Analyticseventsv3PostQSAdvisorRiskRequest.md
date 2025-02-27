# analyticseventsv3PostQSAdvisorRiskRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**origin** | [**Templatesv3Origin**](Templatesv3Origin.md) |  | [optional] [default to null]
**originUnderscoredata** | **string** | Optional: context:${context_id} of the data such as &quot;Report:${report_id}&quot; or &quot;RiskEvent:${risk_id}&quot; | [optional] [default to null]
**targetUnderscorereceivers** | [**array[Schedulerv3Recipient]**](Schedulerv3Recipient.md) | notification recipient | [optional] [default to null]
**templateUnderscoredata** | **map[String, string]** | Use a flattened structure for now, can be changed with furthur request from QS Advisor team | [optional] [default to null]
**title** | **string** |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


