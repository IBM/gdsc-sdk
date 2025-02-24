/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

type Resourcecontrollerk8v3GetControllersResponse struct {
	// The controllers for the tenant.
	Controllers []Resourcecontrollerk8v3Controller `json:"controllers,omitempty"`
	// The internal ID of the tenant the controllers are for.
	TenantId string `json:"tenant_id,omitempty"`
}
