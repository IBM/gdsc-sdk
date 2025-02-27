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

import { GooglerpcStatus } from '../models/GooglerpcStatus';
import { HttpFile } from '../http/http';

/**
* DeleteDatasetResponse message as the response for deleting a dataset.
*/
export class Ecosystemv3DeleteDatasetsResponse {
    'status'?: GooglerpcStatus;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "status",
            "baseName": "status",
            "type": "GooglerpcStatus",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Ecosystemv3DeleteDatasetsResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

