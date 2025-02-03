/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

// ClassificationDetails message an additional info for the classification the UI.
type Riskanalyticsenginev3ClassificationDetails struct {
	// Class description for UI with translation.
	ClassDescriptionNls string `json:"class_description_nls,omitempty"`
	// Key of the classification found for this risk.
	ClassKey string `json:"class_key,omitempty"`
	// Key of the classification found for this risk.
	ClassNls string `json:"class_nls,omitempty"`
	// Classification Observation array of observations that were found for this classification.
	ClassObservations []Riskanalyticsenginev3ClassificationObservation `json:"class_observations,omitempty"`
	// Value of the classification found for this risk.
	ClassValue float32 `json:"class_value,omitempty"`
	ClassificationMatchDetails []Riskanalyticsenginev3ClassificationMatchDetails `json:"classification_match_details,omitempty"`
	ClassificationModified bool `json:"classification_modified,omitempty"`
}
