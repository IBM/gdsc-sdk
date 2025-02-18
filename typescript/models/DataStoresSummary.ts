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

import { DataStoresSummaryCloudLocationsInner } from '../models/DataStoresSummaryCloudLocationsInner';
import { DataStoresSummaryServiceProvidersInner } from '../models/DataStoresSummaryServiceProvidersInner';
import { DataStoresSummaryStoreTypesInner } from '../models/DataStoresSummaryStoreTypesInner';
import { SensitivitiesItemsInner } from '../models/SensitivitiesItemsInner';
import { HttpFile } from '../http/http';

export class DataStoresSummary {
    'totalStores': number;
    'storeTypes': Array<DataStoresSummaryStoreTypesInner>;
    'cloudLocations': Array<DataStoresSummaryCloudLocationsInner>;
    'serviceProviders': Array<DataStoresSummaryServiceProvidersInner>;
    'totalSensitivities': number;
    'sensitivities': Array<SensitivitiesItemsInner>;
    'totalPotentialFlows': number;
    'totalActualFlows': number;
    'totalSensitiveStores': number;
    'accountsIds': Array<string>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "totalStores",
            "baseName": "totalStores",
            "type": "number",
            "format": ""
        },
        {
            "name": "storeTypes",
            "baseName": "storeTypes",
            "type": "Array<DataStoresSummaryStoreTypesInner>",
            "format": ""
        },
        {
            "name": "cloudLocations",
            "baseName": "cloudLocations",
            "type": "Array<DataStoresSummaryCloudLocationsInner>",
            "format": ""
        },
        {
            "name": "serviceProviders",
            "baseName": "serviceProviders",
            "type": "Array<DataStoresSummaryServiceProvidersInner>",
            "format": ""
        },
        {
            "name": "totalSensitivities",
            "baseName": "totalSensitivities",
            "type": "number",
            "format": ""
        },
        {
            "name": "sensitivities",
            "baseName": "sensitivities",
            "type": "Array<SensitivitiesItemsInner>",
            "format": ""
        },
        {
            "name": "totalPotentialFlows",
            "baseName": "totalPotentialFlows",
            "type": "number",
            "format": ""
        },
        {
            "name": "totalActualFlows",
            "baseName": "totalActualFlows",
            "type": "number",
            "format": ""
        },
        {
            "name": "totalSensitiveStores",
            "baseName": "totalSensitiveStores",
            "type": "number",
            "format": ""
        },
        {
            "name": "accountsIds",
            "baseName": "accountsIds",
            "type": "Array<string>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return DataStoresSummary.attributeTypeMap;
    }

    public constructor() {
    }
}

