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

import { Tenantuserv3CurrentUserTenant } from '../models/Tenantuserv3CurrentUserTenant';
import { Tenantuserv3FullUser } from '../models/Tenantuserv3FullUser';
import { Tenantuserv3Tenant } from '../models/Tenantuserv3Tenant';
import { HttpFile } from '../http/http';

/**
* CurrentUser contains a single user.
*/
export class Tenantuserv3CurrentUser {
    'curUserTenant'?: Tenantuserv3Tenant;
    'tenants'?: Array<Tenantuserv3CurrentUserTenant>;
    'user'?: Tenantuserv3FullUser;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "curUserTenant",
            "baseName": "cur_user_tenant",
            "type": "Tenantuserv3Tenant",
            "format": ""
        },
        {
            "name": "tenants",
            "baseName": "tenants",
            "type": "Array<Tenantuserv3CurrentUserTenant>",
            "format": ""
        },
        {
            "name": "user",
            "baseName": "user",
            "type": "Tenantuserv3FullUser",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Tenantuserv3CurrentUser.attributeTypeMap;
    }

    public constructor() {
    }
}

