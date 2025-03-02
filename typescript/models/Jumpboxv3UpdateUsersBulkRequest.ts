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

import { Jumpboxv3User } from '../models/Jumpboxv3User';
import { HttpFile } from '../http/http';

/**
* UpdateUsersBulkRequest message for Patch v3/users api.
*/
export class Jumpboxv3UpdateUsersBulkRequest {
    'action'?: string;
    /**
    * Boolean to update metadata only or not.
    */
    'metadataOnly'?: boolean;
    /**
    * List of users to get updated.
    */
    'users'?: Array<Jumpboxv3User>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "action",
            "baseName": "action",
            "type": "string",
            "format": ""
        },
        {
            "name": "metadataOnly",
            "baseName": "metadata_only",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "users",
            "baseName": "users",
            "type": "Array<Jumpboxv3User>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Jumpboxv3UpdateUsersBulkRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

