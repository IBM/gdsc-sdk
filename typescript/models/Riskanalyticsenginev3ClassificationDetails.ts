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
import { Riskanalyticsenginev3ClassificationObservation } from '../models/Riskanalyticsenginev3ClassificationObservation';
import { HttpFile } from '../http/http';

/**
* ClassificationDetails message an additional info for the classification the UI.
*/
export class Riskanalyticsenginev3ClassificationDetails {
    /**
    * Class description for UI with translation.
    */
    'classDescriptionNls'?: string;
    /**
    * Key of the classification found for this risk.
    */
    'classKey'?: string;
    /**
    * Key of the classification found for this risk.
    */
    'classNls'?: string;
    /**
    * Classification Observation array of observations that were found for this classification.
    */
    'classObservations'?: Array<Riskanalyticsenginev3ClassificationObservation>;
    /**
    * Value of the classification found for this risk.
    */
    'classValue'?: number;
    'classificationMatchDetails'?: Array<Riskanalyticsenginev3ClassificationMatchDetails>;
    'classificationModified'?: boolean;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "classDescriptionNls",
            "baseName": "class_description_nls",
            "type": "string",
            "format": ""
        },
        {
            "name": "classKey",
            "baseName": "class_key",
            "type": "string",
            "format": ""
        },
        {
            "name": "classNls",
            "baseName": "class_nls",
            "type": "string",
            "format": ""
        },
        {
            "name": "classObservations",
            "baseName": "class_observations",
            "type": "Array<Riskanalyticsenginev3ClassificationObservation>",
            "format": ""
        },
        {
            "name": "classValue",
            "baseName": "class_value",
            "type": "number",
            "format": "float"
        },
        {
            "name": "classificationMatchDetails",
            "baseName": "classification_match_details",
            "type": "Array<Riskanalyticsenginev3ClassificationMatchDetails>",
            "format": ""
        },
        {
            "name": "classificationModified",
            "baseName": "classification_modified",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Riskanalyticsenginev3ClassificationDetails.attributeTypeMap;
    }

    public constructor() {
    }
}

