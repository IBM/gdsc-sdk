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
import { Assetsv3Level } from '../models/Assetsv3Level';
import { HttpFile } from '../http/http';

export class Assetsv3DatabaseVertex {
    'catalog'?: string;
    'criticality'?: Assetsv3Level;
    'databaseHost'?: Array<Assetsv3ConnectionEdge>;
    'databaseIp'?: Array<Assetsv3ConnectionEdge>;
    'databaseName'?: string;
    'databaseSubType'?: string;
    'databaseSubscription'?: Array<Assetsv3ConnectionEdge>;
    'databaseType'?: string;
    'description'?: string;
    'extendedProperties'?: Array<Assetsv3CustomProperty>;
    'owner'?: Array<string>;
    'resolutionKey'?: string;
    'riskLevel'?: Assetsv3Level;
    'schemaName'?: string;
    'serviceName'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "catalog",
            "baseName": "catalog",
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
            "name": "databaseHost",
            "baseName": "database_host",
            "type": "Array<Assetsv3ConnectionEdge>",
            "format": ""
        },
        {
            "name": "databaseIp",
            "baseName": "database_ip",
            "type": "Array<Assetsv3ConnectionEdge>",
            "format": ""
        },
        {
            "name": "databaseName",
            "baseName": "database_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "databaseSubType",
            "baseName": "database_sub_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "databaseSubscription",
            "baseName": "database_subscription",
            "type": "Array<Assetsv3ConnectionEdge>",
            "format": ""
        },
        {
            "name": "databaseType",
            "baseName": "database_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "extendedProperties",
            "baseName": "extended_properties",
            "type": "Array<Assetsv3CustomProperty>",
            "format": ""
        },
        {
            "name": "owner",
            "baseName": "owner",
            "type": "Array<string>",
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
            "name": "schemaName",
            "baseName": "schema_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "serviceName",
            "baseName": "service_name",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Assetsv3DatabaseVertex.attributeTypeMap;
    }

    public constructor() {
    }
}



