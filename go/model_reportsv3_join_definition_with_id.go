/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

// Includes join definition properties and join id.
type Reportsv3JoinDefinitionWithId struct {
	CategoryId string `json:"category_id,omitempty"`
	HeaderPairList []Reportsv3HeaderPair `json:"header_pair_list,omitempty"`
	// Unique join ID.
	JoinId string `json:"join_id,omitempty"`
	SourceTableName string `json:"source_table_name,omitempty"`
	TargetHeadersSelectedIds []string `json:"target_headers_selected_ids,omitempty"`
	TargetTableName string `json:"target_table_name,omitempty"`
}
