/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

// GetSnifConfigResponse is the response message to get latest snif configuration parameters.
type Snifassistv3GetSnifConfigResponse struct {
	// Specify config_id provided by configuration service.
	ConfigId string `json:"config_id,omitempty"`
	// Specify edge_id if known.
	EdgeId string `json:"edge_id,omitempty"`
	// Specify latest configuration parameters.
	Parameters string `json:"parameters,omitempty"`
	// Specify tenant_id.
	TenantId string `json:"tenant_id,omitempty"`
}
