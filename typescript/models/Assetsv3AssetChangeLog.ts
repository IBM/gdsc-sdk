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

import { Assetsv3BeforeAfter } from '../models/Assetsv3BeforeAfter';
import { Assetsv3RuleLog } from '../models/Assetsv3RuleLog';
import { HttpFile } from '../http/http';

export class Assetsv3AssetChangeLog {
    'actionTaken'?: string;
    'activity'?: string;
    'after'?: Array<Assetsv3BeforeAfter>;
    'before'?: Array<Assetsv3BeforeAfter>;
    'date'?: string;
    'performedBy'?: string;
    'rule'?: Array<Assetsv3RuleLog>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "actionTaken",
            "baseName": "action_taken",
            "type": "string",
            "format": ""
        },
        {
            "name": "activity",
            "baseName": "activity",
            "type": "string",
            "format": ""
        },
        {
            "name": "after",
            "baseName": "after",
            "type": "Array<Assetsv3BeforeAfter>",
            "format": ""
        },
        {
            "name": "before",
            "baseName": "before",
            "type": "Array<Assetsv3BeforeAfter>",
            "format": ""
        },
        {
            "name": "date",
            "baseName": "date",
            "type": "string",
            "format": ""
        },
        {
            "name": "performedBy",
            "baseName": "performed_by",
            "type": "string",
            "format": ""
        },
        {
            "name": "rule",
            "baseName": "rule",
            "type": "Array<Assetsv3RuleLog>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Assetsv3AssetChangeLog.attributeTypeMap;
    }

    public constructor() {
    }
}

