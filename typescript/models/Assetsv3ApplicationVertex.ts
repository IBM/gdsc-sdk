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

import { Assetsv3ConnectionEdge } from '../models/Assetsv3ConnectionEdge';
import { Assetsv3CustomProperty } from '../models/Assetsv3CustomProperty';
import { Assetsv3Level } from '../models/Assetsv3Level';
import { HttpFile } from '../http/http';

export class Assetsv3ApplicationVertex {
    'appId'?: string;
    'applicationDatabase'?: Array<Assetsv3ConnectionEdge>;
    'applicationEndpoint'?: Array<Assetsv3ConnectionEdge>;
    'applicationHost'?: Array<Assetsv3ConnectionEdge>;
    'applicationIp'?: Array<Assetsv3ConnectionEdge>;
    'applicationName'?: string;
    'applicationStorage'?: Array<Assetsv3ConnectionEdge>;
    'applicationSubType'?: string;
    'applicationSubscription'?: Array<Assetsv3ConnectionEdge>;
    'applicationType'?: string;
    'category'?: string;
    'criticality'?: Assetsv3Level;
    'extendedProperties'?: Array<Assetsv3CustomProperty>;
    'lastUsed'?: Date;
    'owner'?: Array<string>;
    'parentApplication'?: string;
    'resolutionKey'?: string;
    'riskLevel'?: Assetsv3Level;
    'serviceType'?: string;
    'version'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "appId",
            "baseName": "app_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "applicationDatabase",
            "baseName": "application_database",
            "type": "Array<Assetsv3ConnectionEdge>",
            "format": ""
        },
        {
            "name": "applicationEndpoint",
            "baseName": "application_endpoint",
            "type": "Array<Assetsv3ConnectionEdge>",
            "format": ""
        },
        {
            "name": "applicationHost",
            "baseName": "application_host",
            "type": "Array<Assetsv3ConnectionEdge>",
            "format": ""
        },
        {
            "name": "applicationIp",
            "baseName": "application_ip",
            "type": "Array<Assetsv3ConnectionEdge>",
            "format": ""
        },
        {
            "name": "applicationName",
            "baseName": "application_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "applicationStorage",
            "baseName": "application_storage",
            "type": "Array<Assetsv3ConnectionEdge>",
            "format": ""
        },
        {
            "name": "applicationSubType",
            "baseName": "application_sub_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "applicationSubscription",
            "baseName": "application_subscription",
            "type": "Array<Assetsv3ConnectionEdge>",
            "format": ""
        },
        {
            "name": "applicationType",
            "baseName": "application_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "category",
            "baseName": "category",
            "type": "string",
            "format": ""
        },
        {
            "name": "criticality",
            "baseName": "criticality",
            "type": "Assetsv3Level",
            "format": ""
        },
        {
            "name": "extendedProperties",
            "baseName": "extended_properties",
            "type": "Array<Assetsv3CustomProperty>",
            "format": ""
        },
        {
            "name": "lastUsed",
            "baseName": "last_used",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "owner",
            "baseName": "owner",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "parentApplication",
            "baseName": "parent_application",
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
            "name": "riskLevel",
            "baseName": "risk_level",
            "type": "Assetsv3Level",
            "format": ""
        },
        {
            "name": "serviceType",
            "baseName": "service_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "version",
            "baseName": "version",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Assetsv3ApplicationVertex.attributeTypeMap;
    }

    public constructor() {
    }
}



