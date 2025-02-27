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

import { HttpFile } from '../http/http';

/**
* UpdateRiskFeedbackRequest message for the UpdateRiskFeedback API.
*/
export class Riskanalyticscontrollerv3UpdateRiskFeedbackRequest {
    'comment'?: string;
    'feedbackClassificationKey'?: string;
    'originalClassificationKey'?: string;
    /**
    * One or more risk id. This API can be called for multiple risks, only if all of them are from the same category.
    */
    'riskIds'?: Array<number>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "comment",
            "baseName": "comment",
            "type": "string",
            "format": ""
        },
        {
            "name": "feedbackClassificationKey",
            "baseName": "feedback_classification_key",
            "type": "string",
            "format": ""
        },
        {
            "name": "originalClassificationKey",
            "baseName": "original_classification_key",
            "type": "string",
            "format": ""
        },
        {
            "name": "riskIds",
            "baseName": "risk_ids",
            "type": "Array<number>",
            "format": "int32"
        }    ];

    static getAttributeTypeMap() {
        return Riskanalyticscontrollerv3UpdateRiskFeedbackRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

