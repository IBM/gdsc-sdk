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

import { Resourcecontrollerk8v3App } from '../models/Resourcecontrollerk8v3App';
import { HttpFile } from '../http/http';

export class Resourcecontrollerk8v3GetTenantAppsResponse {
    /**
    * The apps for the tenant.
    */
    'apps'?: Array<Resourcecontrollerk8v3App>;
    /**
    * The internal ID of the tenant the apps are for.
    */
    'tenantId'?: string;
    /**
    * The uuid of the tenant to get jobs for.
    */
    'tenantUuid'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "apps",
            "baseName": "apps",
            "type": "Array<Resourcecontrollerk8v3App>",
            "format": ""
        },
        {
            "name": "tenantId",
            "baseName": "tenant_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "tenantUuid",
            "baseName": "tenant_uuid",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Resourcecontrollerk8v3GetTenantAppsResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

