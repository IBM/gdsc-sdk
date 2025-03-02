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

import { Riskanalyticsenginev3ClassificationMatchDetails } from '../models/Riskanalyticsenginev3ClassificationMatchDetails';
import { HttpFile } from '../http/http';

/**
* GetRiskEventClassificationsListResponse message for the GetRiskEventClassificationsList API.
*/
export class Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse {
    'classificationMatchDetails'?: Array<Riskanalyticsenginev3ClassificationMatchDetails>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "classificationMatchDetails",
            "baseName": "classification_match_details",
            "type": "Array<Riskanalyticsenginev3ClassificationMatchDetails>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

