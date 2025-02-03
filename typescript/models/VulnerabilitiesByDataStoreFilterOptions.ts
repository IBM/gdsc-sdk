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

import { Compliance } from '../models/Compliance';
import { VulnerabilityAffectedDataStoreFilterOptions } from '../models/VulnerabilityAffectedDataStoreFilterOptions';
import { VulnerabilityCriticality } from '../models/VulnerabilityCriticality';
import { VulnerabilityStatusType } from '../models/VulnerabilityStatusType';
import { VulnerabilityStatusTypeFamily } from '../models/VulnerabilityStatusTypeFamily';
import { VulnerabilityThreatCategory } from '../models/VulnerabilityThreatCategory';
import { VulnerabilityType } from '../models/VulnerabilityType';
import { HttpFile } from '../http/http';

export class VulnerabilitiesByDataStoreFilterOptions {
    'vulnerabilityTypes'?: Array<VulnerabilityType>;
    'criticalities'?: Array<VulnerabilityCriticality>;
    'threats'?: Array<VulnerabilitiesByDataStoreFilterOptionsThreatsEnum>;
    'compliance'?: Array<Compliance>;
    'threatCategories'?: Array<VulnerabilityThreatCategory>;
    'affectedDataStore'?: VulnerabilityAffectedDataStoreFilterOptions;
    'statusTypes'?: Array<VulnerabilityStatusType>;
    'statusTypeFamilies'?: Array<VulnerabilityStatusTypeFamily>;
    /**
    * as epoch timestamp
    */
    'discoveredSince'?: number;
    'sensitiveTags'?: Array<string>;
    'compliances'?: Array<Compliance>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "vulnerabilityTypes",
            "baseName": "vulnerabilityTypes",
            "type": "Array<VulnerabilityType>",
            "format": ""
        },
        {
            "name": "criticalities",
            "baseName": "criticalities",
            "type": "Array<VulnerabilityCriticality>",
            "format": ""
        },
        {
            "name": "threats",
            "baseName": "threats",
            "type": "Array<VulnerabilitiesByDataStoreFilterOptionsThreatsEnum>",
            "format": ""
        },
        {
            "name": "compliance",
            "baseName": "compliance",
            "type": "Array<Compliance>",
            "format": ""
        },
        {
            "name": "threatCategories",
            "baseName": "threatCategories",
            "type": "Array<VulnerabilityThreatCategory>",
            "format": ""
        },
        {
            "name": "affectedDataStore",
            "baseName": "affectedDataStore",
            "type": "VulnerabilityAffectedDataStoreFilterOptions",
            "format": ""
        },
        {
            "name": "statusTypes",
            "baseName": "statusTypes",
            "type": "Array<VulnerabilityStatusType>",
            "format": ""
        },
        {
            "name": "statusTypeFamilies",
            "baseName": "statusTypeFamilies",
            "type": "Array<VulnerabilityStatusTypeFamily>",
            "format": ""
        },
        {
            "name": "discoveredSince",
            "baseName": "discoveredSince",
            "type": "number",
            "format": ""
        },
        {
            "name": "sensitiveTags",
            "baseName": "sensitiveTags",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "compliances",
            "baseName": "compliances",
            "type": "Array<Compliance>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return VulnerabilitiesByDataStoreFilterOptions.attributeTypeMap;
    }

    public constructor() {
    }
}


export enum VulnerabilitiesByDataStoreFilterOptionsThreatsEnum {
    DataLeakage = 'Data Leakage',
    Ransomware = 'Ransomware',
    ComplianceViolation = 'Compliance Violation',
    Malware = 'Malware',
    ExternalSharing = 'External Sharing'
}

