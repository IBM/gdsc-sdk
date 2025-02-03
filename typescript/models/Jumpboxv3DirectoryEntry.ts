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

import { HttpFile } from '../http/http';

/**
* DirectoryEntry message for ICP directory search result.
*/
export class Jumpboxv3DirectoryEntry {
    /**
    * Which directory did this user come from.
    */
    'directoryId'?: string;
    /**
    * LDAP cn.
    */
    'displayName'?: string;
    /**
    * LDAP dn=  (needed to import user from LDAP into TenantUser).
    */
    'distinguishedName'?: string;
    /**
    * Metadata will contain extra attributes returned from LDAP search.
    */
    'metadata'?: { [key: string]: string; };

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "directoryId",
            "baseName": "directory_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "displayName",
            "baseName": "display_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "distinguishedName",
            "baseName": "distinguished_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "{ [key: string]: string; }",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Jumpboxv3DirectoryEntry.attributeTypeMap;
    }

    public constructor() {
    }
}

