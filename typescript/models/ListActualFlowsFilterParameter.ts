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

import { AccessType } from '../models/AccessType';
import { CloudServiceProvider } from '../models/CloudServiceProvider';
import { Comparator } from '../models/Comparator';
import { HttpFile } from '../http/http';

export class ListActualFlowsFilterParameter {
    'sourceIds'?: Array<string>;
    'sourceTypes'?: Array<string>;
    'sourceCloudAccountIds'?: Array<string>;
    'sourceCloudRegions'?: Array<string>;
    'sourceCloudProviders'?: Array<CloudServiceProvider>;
    'destinationIds'?: Array<string>;
    'destinationTypes'?: Array<string>;
    'destinationCloudAccountIds'?: Array<string>;
    'destinationCloudRegions'?: Array<string>;
    'destinationCloudProviders'?: Array<CloudServiceProvider>;
    'accessTypes'?: Array<AccessType>;
    'lastSeen'?: Comparator;
    'firstSeen'?: Comparator;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "sourceIds",
            "baseName": "sourceIds",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "sourceTypes",
            "baseName": "sourceTypes",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "sourceCloudAccountIds",
            "baseName": "sourceCloudAccountIds",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "sourceCloudRegions",
            "baseName": "sourceCloudRegions",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "sourceCloudProviders",
            "baseName": "sourceCloudProviders",
            "type": "Array<CloudServiceProvider>",
            "format": ""
        },
        {
            "name": "destinationIds",
            "baseName": "destinationIds",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "destinationTypes",
            "baseName": "destinationTypes",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "destinationCloudAccountIds",
            "baseName": "destinationCloudAccountIds",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "destinationCloudRegions",
            "baseName": "destinationCloudRegions",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "destinationCloudProviders",
            "baseName": "destinationCloudProviders",
            "type": "Array<CloudServiceProvider>",
            "format": ""
        },
        {
            "name": "accessTypes",
            "baseName": "accessTypes",
            "type": "Array<AccessType>",
            "format": ""
        },
        {
            "name": "lastSeen",
            "baseName": "lastSeen",
            "type": "Comparator",
            "format": ""
        },
        {
            "name": "firstSeen",
            "baseName": "firstSeen",
            "type": "Comparator",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ListActualFlowsFilterParameter.attributeTypeMap;
    }

    public constructor() {
    }
}

