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

import { Assetsv3ExtendedProp } from '../models/Assetsv3ExtendedProp';
import { Assetsv3HealthType } from '../models/Assetsv3HealthType';
import { Assetsv3StatusType } from '../models/Assetsv3StatusType';
import { HttpFile } from '../http/http';

export class Assetsv3Asset {
    'applicationName'?: string;
    'applicationVersion'?: string;
    'assetSubtype'?: string;
    'assetType'?: string;
    'connectivity'?: Assetsv3HealthType;
    'criticalVaCount'?: number;
    'database'?: string;
    'dbId'?: string;
    'deployment'?: string;
    'encryption'?: Assetsv3StatusType;
    'endpointName'?: string;
    /**
    * entity ID which was inserted/updated.
    */
    'entityId'?: string;
    'entityType'?: string;
    'extendedProperties'?: Array<Assetsv3ExtendedProp>;
    'gdpDataSources'?: string;
    /**
    * grouper ID which was grouped assets.
    */
    'grouperId'?: number;
    'host'?: string;
    'hostId'?: string;
    'hostPort'?: string;
    'ip'?: string;
    'ipPort'?: string;
    'macAddress'?: string;
    'modelName'?: string;
    'monitoring'?: Assetsv3StatusType;
    'name'?: string;
    'origin'?: Array<string>;
    'riskLevel'?: string;
    'sensitiveData'?: number;
    'service'?: string;
    'storageName'?: string;
    'subscription'?: string;
    'tags'?: Array<string>;
    'totalVaCount'?: number;
    'traffic'?: Assetsv3HealthType;
    'type'?: string;
    'userAccounts'?: Array<string>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "applicationName",
            "baseName": "application_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "applicationVersion",
            "baseName": "application_version",
            "type": "string",
            "format": ""
        },
        {
            "name": "assetSubtype",
            "baseName": "asset_subtype",
            "type": "string",
            "format": ""
        },
        {
            "name": "assetType",
            "baseName": "asset_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "connectivity",
            "baseName": "connectivity",
            "type": "Assetsv3HealthType",
            "format": ""
        },
        {
            "name": "criticalVaCount",
            "baseName": "critical_va_count",
            "type": "number",
            "format": "int64"
        },
        {
            "name": "database",
            "baseName": "database",
            "type": "string",
            "format": ""
        },
        {
            "name": "dbId",
            "baseName": "db_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "deployment",
            "baseName": "deployment",
            "type": "string",
            "format": ""
        },
        {
            "name": "encryption",
            "baseName": "encryption",
            "type": "Assetsv3StatusType",
            "format": ""
        },
        {
            "name": "endpointName",
            "baseName": "endpoint_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "entityId",
            "baseName": "entity_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "entityType",
            "baseName": "entity_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "extendedProperties",
            "baseName": "extended_properties",
            "type": "Array<Assetsv3ExtendedProp>",
            "format": ""
        },
        {
            "name": "gdpDataSources",
            "baseName": "gdp_data_sources",
            "type": "string",
            "format": ""
        },
        {
            "name": "grouperId",
            "baseName": "grouper_id",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "host",
            "baseName": "host",
            "type": "string",
            "format": ""
        },
        {
            "name": "hostId",
            "baseName": "host_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "hostPort",
            "baseName": "host_port",
            "type": "string",
            "format": ""
        },
        {
            "name": "ip",
            "baseName": "ip",
            "type": "string",
            "format": ""
        },
        {
            "name": "ipPort",
            "baseName": "ip_port",
            "type": "string",
            "format": ""
        },
        {
            "name": "macAddress",
            "baseName": "mac_address",
            "type": "string",
            "format": ""
        },
        {
            "name": "modelName",
            "baseName": "model_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "monitoring",
            "baseName": "monitoring",
            "type": "Assetsv3StatusType",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "origin",
            "baseName": "origin",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "riskLevel",
            "baseName": "risk_level",
            "type": "string",
            "format": ""
        },
        {
            "name": "sensitiveData",
            "baseName": "sensitive_data",
            "type": "number",
            "format": "int64"
        },
        {
            "name": "service",
            "baseName": "service",
            "type": "string",
            "format": ""
        },
        {
            "name": "storageName",
            "baseName": "storage_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "subscription",
            "baseName": "subscription",
            "type": "string",
            "format": ""
        },
        {
            "name": "tags",
            "baseName": "tags",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "totalVaCount",
            "baseName": "total_va_count",
            "type": "number",
            "format": "int64"
        },
        {
            "name": "traffic",
            "baseName": "traffic",
            "type": "Assetsv3HealthType",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "string",
            "format": ""
        },
        {
            "name": "userAccounts",
            "baseName": "user_accounts",
            "type": "Array<string>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Assetsv3Asset.attributeTypeMap;
    }

    public constructor() {
    }
}



