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

import { Resourcecontrollerk8v3AppDeployment } from '../models/Resourcecontrollerk8v3AppDeployment';
import { Resourcecontrollerk8v3AppFile } from '../models/Resourcecontrollerk8v3AppFile';
import { Resourcecontrollerk8v3AppHpa } from '../models/Resourcecontrollerk8v3AppHpa';
import { Resourcecontrollerk8v3AppSecret } from '../models/Resourcecontrollerk8v3AppSecret';
import { Resourcecontrollerk8v3Container } from '../models/Resourcecontrollerk8v3Container';
import { Resourcecontrollerk8v3InitContainer } from '../models/Resourcecontrollerk8v3InitContainer';
import { HttpFile } from '../http/http';

/**
* App contains the information about an app.
*/
export class Resourcecontrollerk8v3App {
    'container'?: Resourcecontrollerk8v3Container;
    /**
    * Optional: The date this app was created (ms since epoch).
    */
    'created'?: string;
    'deployment'?: Resourcecontrollerk8v3AppDeployment;
    /**
    * Optional: The path for mounted empty directory. All containers in pod have read/write permission to it.
    */
    'emptyDir'?: string;
    /**
    * Optional: The internal IDs of the files for the app. This is deprecated in favor of the files field.
    */
    'fileIds'?: Array<string>;
    /**
    * Optional: The files for the app.
    */
    'files'?: Array<Resourcecontrollerk8v3AppFile>;
    'hpa'?: Resourcecontrollerk8v3AppHpa;
    /**
    * The internal ID of the app.
    */
    'id'?: string;
    'initContainers'?: Array<Resourcecontrollerk8v3InitContainer>;
    /**
    * Optional: The date this app was modified (ms since epoch).
    */
    'modified'?: string;
    /**
    * The name of the app.
    */
    'name'?: string;
    /**
    * Optional: The secrets for the app.
    */
    'secrets'?: Array<Resourcecontrollerk8v3AppSecret>;
    /**
    * Optional: The status of the app.
    */
    'status'?: string;
    /**
    * The tenant id for the app.
    */
    'tenantId'?: string;
    /**
    * The internal ID of the tenant for the app.
    */
    'tenantUuid'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "container",
            "baseName": "container",
            "type": "Resourcecontrollerk8v3Container",
            "format": ""
        },
        {
            "name": "created",
            "baseName": "created",
            "type": "string",
            "format": "int64"
        },
        {
            "name": "deployment",
            "baseName": "deployment",
            "type": "Resourcecontrollerk8v3AppDeployment",
            "format": ""
        },
        {
            "name": "emptyDir",
            "baseName": "empty_dir",
            "type": "string",
            "format": ""
        },
        {
            "name": "fileIds",
            "baseName": "file_ids",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "files",
            "baseName": "files",
            "type": "Array<Resourcecontrollerk8v3AppFile>",
            "format": ""
        },
        {
            "name": "hpa",
            "baseName": "hpa",
            "type": "Resourcecontrollerk8v3AppHpa",
            "format": ""
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "initContainers",
            "baseName": "init_containers",
            "type": "Array<Resourcecontrollerk8v3InitContainer>",
            "format": ""
        },
        {
            "name": "modified",
            "baseName": "modified",
            "type": "string",
            "format": "int64"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "secrets",
            "baseName": "secrets",
            "type": "Array<Resourcecontrollerk8v3AppSecret>",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "string",
            "format": ""
        },
        {
            "name": "tenantId",
            "baseName": "tenant_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "tenantUuid",
            "baseName": "tenant_uuid",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Resourcecontrollerk8v3App.attributeTypeMap;
    }

    public constructor() {
    }
}

