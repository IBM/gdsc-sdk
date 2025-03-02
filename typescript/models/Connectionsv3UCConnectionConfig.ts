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

import { Connectionsv3UCConnectionSummary } from '../models/Connectionsv3UCConnectionSummary';
import { HttpFile } from '../http/http';

/**
* UC connection config with connecion id.
*/
export class Connectionsv3UCConnectionConfig {
    /**
    * Connection id.
    */
    'connectionId'?: string;
    'ucConnectionSummary'?: Connectionsv3UCConnectionSummary;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "connectionId",
            "baseName": "connection_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "ucConnectionSummary",
            "baseName": "uc_connection_summary",
            "type": "Connectionsv3UCConnectionSummary",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Connectionsv3UCConnectionConfig.attributeTypeMap;
    }

    public constructor() {
    }
}

