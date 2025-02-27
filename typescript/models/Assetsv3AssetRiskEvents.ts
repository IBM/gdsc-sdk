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

import { Assetsv3AssetOpenRiskEventList } from '../models/Assetsv3AssetOpenRiskEventList';
import { HttpFile } from '../http/http';

export class Assetsv3AssetRiskEvents {
    'assetOpenRiskEventList'?: Array<Assetsv3AssetOpenRiskEventList>;
    'lastActivity'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "assetOpenRiskEventList",
            "baseName": "asset_open_risk_event_list",
            "type": "Array<Assetsv3AssetOpenRiskEventList>",
            "format": ""
        },
        {
            "name": "lastActivity",
            "baseName": "last_activity",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Assetsv3AssetRiskEvents.attributeTypeMap;
    }

    public constructor() {
    }
}

