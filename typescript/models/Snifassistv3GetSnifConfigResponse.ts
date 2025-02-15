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
* GetSnifConfigResponse is the response message to get latest snif configuration parameters.
*/
export class Snifassistv3GetSnifConfigResponse {
    /**
    * Specify config_id provided by configuration service.
    */
    'configId'?: string;
    /**
    * Specify edge_id if known.
    */
    'edgeId'?: string;
    /**
    * Specify latest configuration parameters.
    */
    'parameters'?: string;
    /**
    * Specify tenant_id.
    */
    'tenantId'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "configId",
            "baseName": "config_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "edgeId",
            "baseName": "edge_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "parameters",
            "baseName": "parameters",
            "type": "string",
            "format": "byte"
        },
        {
            "name": "tenantId",
            "baseName": "tenant_id",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Snifassistv3GetSnifConfigResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

