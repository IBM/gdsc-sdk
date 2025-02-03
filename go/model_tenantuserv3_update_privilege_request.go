/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

type Tenantuserv3UpdatePrivilegeRequest struct {
	// (Optional) Roles of the management permission.
	ManageRoles []string `json:"manage_roles,omitempty"`
	// (Optional) A privilege name that the access-manager sees (for pre-defined privileges, use translation text).
	Name string `json:"name,omitempty"`
	// Permanent id of the privilege to be updated or created.
	PrivilegeId string `json:"privilege_id,omitempty"`
	// (Optional) All pre-defined privileges are not removable.
	Removable bool `json:"removable,omitempty"`
	// The array of Insights roles that this privilege belongs to.
	Roles []string `json:"roles,omitempty"`
	// (Optional) Type of privilege: report, classification, group, page, restapi, etc.
	Type_ string `json:"type,omitempty"`
}
