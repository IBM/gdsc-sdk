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
* DeleteCacheKeyRequest message for delete /api/v3/eventscache/{cache_key}.
*/
export class Analyticseventsv3DeleteCacheKeyRequest {
    /**
    * The cache key to delete.
    */
    'cacheKey'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "cacheKey",
            "baseName": "cache_key",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Analyticseventsv3DeleteCacheKeyRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

