/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

// ListAWSStreamsResponse defines response of ListAWSStreamsRequest call.
type Streamsv3ListAwsStreamsResponse struct {
	// Map of streams by regions.
	StreamsByRegion map[string]Streamsv3StreamByRegion `json:"streams_by_region,omitempty"`
}
