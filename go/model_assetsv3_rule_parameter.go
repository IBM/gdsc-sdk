/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

type Assetsv3RuleParameter struct {
	// Attribute type of the rule.
	AssetAttribute string `json:"asset_attribute,omitempty"`
	// Enum to indicate attribute type.
	AttributeEnum string `json:"attribute_enum,omitempty"`
	// Attribute condition.
	Condition string `json:"condition,omitempty"`
	// Category of the attribute.
	ConditionCategory string `json:"condition_category,omitempty"`
	// Value of the attribute.
	ConditionValue string `json:"condition_value,omitempty"`
}
