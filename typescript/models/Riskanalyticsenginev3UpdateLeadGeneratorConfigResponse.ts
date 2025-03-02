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
* UpdateLeadGeneratorConfigResponse is the response object for UpdateLeadGeneratorConfig API.
*/
export class Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse {
    /**
    * Result code of the API -- 0 = success, any other value == failure.
    */
    'resultCode'?: number;
    /**
    * Result text of the API -- empty string in case of success, error text in case of failure.
    */
    'resultText'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "resultCode",
            "baseName": "result_code",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "resultText",
            "baseName": "result_text",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

