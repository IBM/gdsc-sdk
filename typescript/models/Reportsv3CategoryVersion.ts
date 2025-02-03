/**
 * IBM Guardium Data Security Center
 * IBM Guardium Data Security Center simplifies your organization\'s Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Reportsv3TableNames } from '../models/Reportsv3TableNames';
import { HttpFile } from '../http/http';

export class Reportsv3CategoryVersion {
    'headerMap'?: { [key: string]: string; };
    'name'?: string;
    'primary'?: boolean;
    'skipJoinOnly'?: boolean;
    'tableMap'?: { [key: string]: Reportsv3TableNames; };

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "headerMap",
            "baseName": "header_map",
            "type": "{ [key: string]: string; }",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "primary",
            "baseName": "primary",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "skipJoinOnly",
            "baseName": "skip_join_only",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "tableMap",
            "baseName": "table_map",
            "type": "{ [key: string]: Reportsv3TableNames; }",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Reportsv3CategoryVersion.attributeTypeMap;
    }

    public constructor() {
    }
}

