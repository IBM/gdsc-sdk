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

export class Riskanalyticscontrollerv3Indicator {
    /**
    * Indicator (feature) description.
    */
    'indicatorDesc'?: string;
    /**
    * Indicator (feature) score.
    */
    'indicatorScore'?: number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "indicatorDesc",
            "baseName": "indicator_desc",
            "type": "string",
            "format": ""
        },
        {
            "name": "indicatorScore",
            "baseName": "indicator_score",
            "type": "number",
            "format": "int32"
        }    ];

    static getAttributeTypeMap() {
        return Riskanalyticscontrollerv3Indicator.attributeTypeMap;
    }

    public constructor() {
    }
}

