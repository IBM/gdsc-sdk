/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

// AggregationDetailsObject gets additional information about aggregation.
type Healthcollectorv3AggregationDetailsObject struct {
	// Aggregation action error.
	AggregationActionError string `json:"aggregation_action_error,omitempty"`
	// Aggregation health status.
	AggregationActionHealthStatus int32 `json:"aggregation_action_health_status,omitempty"`
	// Aggregation type.
	AggregationType string `json:"aggregation_type,omitempty"`
	// Error code for the aggregator.
	Error_ int32 `json:"error,omitempty"`
	// Aggregator host name or IP address.
	Unit string `json:"unit,omitempty"`
}
