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

import { Assetsv3ConnectionEdge } from '../models/Assetsv3ConnectionEdge';
import { Assetsv3CustomProperty } from '../models/Assetsv3CustomProperty';
import { HttpFile } from '../http/http';

export class Assetsv3SubscriptionVertex {
    'duration'?: string;
    'endTime'?: Date;
    'extendedProperties'?: Array<Assetsv3CustomProperty>;
    'name'?: string;
    'resolutionKey'?: string;
    'startTime'?: Date;
    'subscriptionAccount'?: Array<Assetsv3ConnectionEdge>;
    'subscriptionId'?: string;
    'type'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "duration",
            "baseName": "duration",
            "type": "string",
            "format": ""
        },
        {
            "name": "endTime",
            "baseName": "end_time",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "extendedProperties",
            "baseName": "extended_properties",
            "type": "Array<Assetsv3CustomProperty>",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "resolutionKey",
            "baseName": "resolution_key",
            "type": "string",
            "format": ""
        },
        {
            "name": "startTime",
            "baseName": "start_time",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "subscriptionAccount",
            "baseName": "subscription_account",
            "type": "Array<Assetsv3ConnectionEdge>",
            "format": ""
        },
        {
            "name": "subscriptionId",
            "baseName": "subscription_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Assetsv3SubscriptionVertex.attributeTypeMap;
    }

    public constructor() {
    }
}

