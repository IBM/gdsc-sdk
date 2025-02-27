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
import { Resourcecontrollerk8v3AppHpa } from '../models/Resourcecontrollerk8v3AppHpa';
import { Resourcecontrollerk8v3Container } from '../models/Resourcecontrollerk8v3Container';
import { Resourcecontrollerk8v3ControllerAppFile } from '../models/Resourcecontrollerk8v3ControllerAppFile';
import { Resourcecontrollerk8v3ControllerAppSecret } from '../models/Resourcecontrollerk8v3ControllerAppSecret';
import { Resourcecontrollerk8v3InitContainer } from '../models/Resourcecontrollerk8v3InitContainer';
import { HttpFile } from '../http/http';

export class Resourcecontrollerk8v3ControllerApp {
    'container'?: Resourcecontrollerk8v3Container;
    'deployment'?: Resourcecontrollerk8v3AppDeployment;
    'emptyDir'?: string;
    'files'?: Array<Resourcecontrollerk8v3ControllerAppFile>;
    'hpa'?: Resourcecontrollerk8v3AppHpa;
    /**
    * The internal ID of the app.
    */
    'id'?: string;
    'initContainers'?: Array<Resourcecontrollerk8v3InitContainer>;
    /**
    * The date this app was modified (ms since epoch).
    */
    'modified'?: string;
    /**
    * The name of the app.
    */
    'name'?: string;
    'secretKey'?: string;
    'secrets'?: Array<Resourcecontrollerk8v3ControllerAppSecret>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "container",
            "baseName": "container",
            "type": "Resourcecontrollerk8v3Container",
            "format": ""
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
            "name": "files",
            "baseName": "files",
            "type": "Array<Resourcecontrollerk8v3ControllerAppFile>",
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
            "name": "secretKey",
            "baseName": "secret_key",
            "type": "string",
            "format": ""
        },
        {
            "name": "secrets",
            "baseName": "secrets",
            "type": "Array<Resourcecontrollerk8v3ControllerAppSecret>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Resourcecontrollerk8v3ControllerApp.attributeTypeMap;
    }

    public constructor() {
    }
}

