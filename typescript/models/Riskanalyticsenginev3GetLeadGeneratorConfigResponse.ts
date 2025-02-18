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

import { Riskanalyticsenginev3LeadGeneratorConfig } from '../models/Riskanalyticsenginev3LeadGeneratorConfig';
import { HttpFile } from '../http/http';

/**
* GetLeadGeneratorConfigResponse is the response object for GetLeadGeneratorConfig API.
*/
export class Riskanalyticsenginev3GetLeadGeneratorConfigResponse {
    /**
    * A list of lead generator configs from the risk analytics engine.
    */
    'configs'?: Array<Riskanalyticsenginev3LeadGeneratorConfig>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "configs",
            "baseName": "configs",
            "type": "Array<Riskanalyticsenginev3LeadGeneratorConfig>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Riskanalyticsenginev3GetLeadGeneratorConfigResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

