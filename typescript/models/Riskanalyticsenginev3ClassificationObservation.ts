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
* ClassificationObservation is a pair of key and value of observation that were found for this classification.
*/
export class Riskanalyticsenginev3ClassificationObservation {
    /**
    * Is supporting observation - means is this observation used as a supporting observation for this classification.
    */
    'isSupportingObservation'?: boolean;
    /**
    * Classification observation key.
    */
    'key'?: string;
    /**
    * Classification observation value before normalization.
    */
    'originalValue'?: number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "isSupportingObservation",
            "baseName": "is_supporting_observation",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "key",
            "baseName": "key",
            "type": "string",
            "format": ""
        },
        {
            "name": "originalValue",
            "baseName": "original_value",
            "type": "number",
            "format": "float"
        }    ];

    static getAttributeTypeMap() {
        return Riskanalyticsenginev3ClassificationObservation.attributeTypeMap;
    }

    public constructor() {
    }
}

