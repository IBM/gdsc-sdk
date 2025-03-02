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

import { Streamsv3AzureCheckStatus } from '../models/Streamsv3AzureCheckStatus';
import { HttpFile } from '../http/http';

/**
* CheckAzureStorageStringResponse defines response of CheckAzureStorageStringRequest call.
*/
export class Streamsv3CheckAzureStorageStringResponse {
    'status'?: Streamsv3AzureCheckStatus;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "status",
            "baseName": "status",
            "type": "Streamsv3AzureCheckStatus",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Streamsv3CheckAzureStorageStringResponse.attributeTypeMap;
    }

    public constructor() {
    }
}



