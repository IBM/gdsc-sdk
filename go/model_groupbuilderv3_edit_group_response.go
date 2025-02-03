/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

// EditGroupResponse returns the number of newly inserted, deleted, or updated group members.
type Groupbuilderv3EditGroupResponse struct {
	// Number of deleted group members.
	DeletedCount int32 `json:"deleted_count,omitempty"`
	// Number of new group members.
	InsertedCount int32 `json:"inserted_count,omitempty"`
	Status *Groupbuilderv3StatusResponseBase `json:"status,omitempty"`
	// Number of updated group members.
	UpdatedCount int32 `json:"updated_count,omitempty"`
}
