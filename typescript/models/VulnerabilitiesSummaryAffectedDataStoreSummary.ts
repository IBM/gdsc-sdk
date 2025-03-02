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

import { VulnerabilitiesSummaryAffectedDataStoreSummaryCloudAccountIdsCountInner } from '../models/VulnerabilitiesSummaryAffectedDataStoreSummaryCloudAccountIdsCountInner';
import { VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner } from '../models/VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner';
import { VulnerabilitiesSummaryAffectedDataStoreSummaryDataStoreTypesInner } from '../models/VulnerabilitiesSummaryAffectedDataStoreSummaryDataStoreTypesInner';
import { HttpFile } from '../http/http';

export class VulnerabilitiesSummaryAffectedDataStoreSummary {
    'cloudAccountIdsCount': Array<VulnerabilitiesSummaryAffectedDataStoreSummaryCloudAccountIdsCountInner>;
    'cloudRegionsCount': Array<VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner>;
    'dataStoreTypes': Array<VulnerabilitiesSummaryAffectedDataStoreSummaryDataStoreTypesInner>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "cloudAccountIdsCount",
            "baseName": "cloudAccountIdsCount",
            "type": "Array<VulnerabilitiesSummaryAffectedDataStoreSummaryCloudAccountIdsCountInner>",
            "format": ""
        },
        {
            "name": "cloudRegionsCount",
            "baseName": "cloudRegionsCount",
            "type": "Array<VulnerabilitiesSummaryAffectedDataStoreSummaryCloudRegionsCountInner>",
            "format": ""
        },
        {
            "name": "dataStoreTypes",
            "baseName": "dataStoreTypes",
            "type": "Array<VulnerabilitiesSummaryAffectedDataStoreSummaryDataStoreTypesInner>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return VulnerabilitiesSummaryAffectedDataStoreSummary.attributeTypeMap;
    }

    public constructor() {
    }
}

