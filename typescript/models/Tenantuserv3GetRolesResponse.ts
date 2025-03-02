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

import { Tenantuserv3Role } from '../models/Tenantuserv3Role';
import { HttpFile } from '../http/http';

export class Tenantuserv3GetRolesResponse {
    /**
    * Roles found.
    */
    'roles'?: Array<Tenantuserv3Role>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "roles",
            "baseName": "roles",
            "type": "Array<Tenantuserv3Role>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Tenantuserv3GetRolesResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

