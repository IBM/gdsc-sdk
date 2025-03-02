/**
 * IBM Guardium Data Security Center
 * Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Riskanalyticscontrollerv3ShortObservation } from '../models/Riskanalyticscontrollerv3ShortObservation';
import { Riskanalyticscontrollerv3Status } from '../models/Riskanalyticscontrollerv3Status';
import { Riskanalyticsenginev3Pivot } from '../models/Riskanalyticsenginev3Pivot';
import { Riskanalyticsenginev3SeverityLevel } from '../models/Riskanalyticsenginev3SeverityLevel';
import { HttpFile } from '../http/http';

/**
* Risk event.
*/
export class Riskanalyticscontrollerv3RiskEvent {
    'categorizationConfidence'?: number;
    'categorizationModified'?: boolean;
    /**
    * Category description of the risk.
    */
    'categoryDescription'?: string;
    /**
    * Classification of the risk // key of the classification.
    */
    'classification'?: string;
    /**
    * Classification nls // key of nls.
    */
    'classificationNls'?: string;
    /**
    * Description of the risk.
    */
    'description'?: string;
    /**
    * Flag for emerging risks.
    */
    'emergingRisk'?: boolean;
    /**
    * Opened date in format YYYY-MM-DDTHH:mm:ssZ.
    */
    'fromDate'?: Date;
    /**
    * Justification.
    */
    'justification'?: string;
    'pivot'?: Riskanalyticsenginev3Pivot;
    /**
    * Risk id.
    */
    'riskId'?: number;
    /**
    * Severity of the risk.
    */
    'severity'?: number;
    'severityLevel'?: Riskanalyticsenginev3SeverityLevel;
    /**
    * Observations of the risk.
    */
    'shortObservations'?: Array<Riskanalyticscontrollerv3ShortObservation>;
    'status'?: Riskanalyticscontrollerv3Status;
    /**
    * Status changed by the user name.
    */
    'statusChangedByUserName'?: string;
    /**
    * Last updated date in format YYYY-MM-DDTHH:mm:ssZ.
    */
    'toDate'?: Date;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "categorizationConfidence",
            "baseName": "categorization_confidence",
            "type": "number",
            "format": "float"
        },
        {
            "name": "categorizationModified",
            "baseName": "categorization_modified",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "categoryDescription",
            "baseName": "category_description",
            "type": "string",
            "format": ""
        },
        {
            "name": "classification",
            "baseName": "classification",
            "type": "string",
            "format": ""
        },
        {
            "name": "classificationNls",
            "baseName": "classification_nls",
            "type": "string",
            "format": ""
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "emergingRisk",
            "baseName": "emerging_risk",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "fromDate",
            "baseName": "from_date",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "justification",
            "baseName": "justification",
            "type": "string",
            "format": ""
        },
        {
            "name": "pivot",
            "baseName": "pivot",
            "type": "Riskanalyticsenginev3Pivot",
            "format": ""
        },
        {
            "name": "riskId",
            "baseName": "risk_id",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "severity",
            "baseName": "severity",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "severityLevel",
            "baseName": "severity_level",
            "type": "Riskanalyticsenginev3SeverityLevel",
            "format": ""
        },
        {
            "name": "shortObservations",
            "baseName": "short_observations",
            "type": "Array<Riskanalyticscontrollerv3ShortObservation>",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "Riskanalyticscontrollerv3Status",
            "format": ""
        },
        {
            "name": "statusChangedByUserName",
            "baseName": "status_changed_by_user_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "toDate",
            "baseName": "to_date",
            "type": "Date",
            "format": "date-time"
        }    ];

    static getAttributeTypeMap() {
        return Riskanalyticscontrollerv3RiskEvent.attributeTypeMap;
    }

    public constructor() {
    }
}



