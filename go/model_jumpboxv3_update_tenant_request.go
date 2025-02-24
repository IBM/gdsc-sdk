/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

// UpdateTenantRequest message for PUT v3/tenants/{tenant_id} api.
type Jumpboxv3UpdateTenantRequest struct {
	// External metadata.
	ExternalMetadata map[string]Tenantuserv3ExternalMetadata `json:"external_metadata,omitempty"`
	// Is inactive.
	IsInactive bool `json:"is_inactive,omitempty"`
	// Is ready.
	IsReady bool `json:"is_ready,omitempty"`
	// Name.
	Name string `json:"name,omitempty"`
	// Part number.
	PartNumber string `json:"part_number,omitempty"`
	// Tenant id.
	TenantId string `json:"tenant_id,omitempty"`
	// Email.
	Uid string `json:"uid,omitempty"`
}
