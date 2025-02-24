/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

// Create and update policy request message.
type Policybuilderv3PolicyUpdate struct {
	// Activation status identifier: 1001 -> install with no issues, 1002-> installed with issues, 1003 -> not installed.
	ActivationStatus int32 `json:"activation_status,omitempty"`
	ControlFlow *Policybuilderv3ControlFlow `json:"control_flow,omitempty"`
	// The rule ids which are supposed to be deleted on a update policy request.
	DeletedRuleIds []string `json:"deletedRuleIds,omitempty"`
	// Flag to indicate whether policy is installed or not.
	InstalledFlag bool `json:"installed_flag,omitempty"`
	// Variable to indicate the order of the installed policy.
	InstalledOrder int32 `json:"installed_order,omitempty"`
	// Timestamp to indicate when the policy was installed.
	InstalledTimestamp string `json:"installed_timestamp,omitempty"`
	// Timestamp to indicate when the policy was last edited.
	LastEditedTimestamp string `json:"last_edited_timestamp,omitempty"`
	// Flag to indicate whether the policy has log flat enabled or not.
	LogFlat bool `json:"log_flat,omitempty"`
	// Policy Id.
	PolicyId string `json:"policy_id,omitempty"`
	// Policy Name.
	PolicyName string `json:"policy_name,omitempty"`
	PolicyType *Policybuilderv3PolicyType `json:"policy_type,omitempty"`
	Rules []Policybuilderv3Rule `json:"rules,omitempty"`
	// Flag to indicate whether the policy has rules on flat enabled or not.
	RulesOnFlat bool `json:"rules_on_flat,omitempty"`
	// Flag to indicate whether the policy is a template policy or not.
	Template bool `json:"template,omitempty"`
	// Version of the policy.
	Version int32 `json:"version,omitempty"`
}
