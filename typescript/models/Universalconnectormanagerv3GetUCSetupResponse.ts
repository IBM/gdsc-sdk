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

import { Universalconnectormanagerv3File } from '../models/Universalconnectormanagerv3File';
import { HttpFile } from '../http/http';

/**
* GetUCSetupResponse is the response object for getting the UC parameters of a specific Universal Connector.
*/
export class Universalconnectormanagerv3GetUCSetupResponse {
    /**
    * Binaries files (zip,rpm,jar, base64 encoded).
    */
    'binaries'?: Array<Universalconnectormanagerv3File>;
    /**
    * Map of certificates (key is the name, value is the value itself).
    */
    'certificates'?: { [key: string]: string; };
    /**
    * Configuration files for pipeline.
    */
    'configurations'?: Array<Universalconnectormanagerv3File>;
    /**
    * Map of credentials (key is the name, value is the value itself).
    */
    'credentials'?: { [key: string]: string; };
    'offlinePackages'?: Array<Universalconnectormanagerv3File>;
    /**
    * Type of the pipeline (pull or push).
    */
    'pipelineType'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "binaries",
            "baseName": "binaries",
            "type": "Array<Universalconnectormanagerv3File>",
            "format": ""
        },
        {
            "name": "certificates",
            "baseName": "certificates",
            "type": "{ [key: string]: string; }",
            "format": ""
        },
        {
            "name": "configurations",
            "baseName": "configurations",
            "type": "Array<Universalconnectormanagerv3File>",
            "format": ""
        },
        {
            "name": "credentials",
            "baseName": "credentials",
            "type": "{ [key: string]: string; }",
            "format": ""
        },
        {
            "name": "offlinePackages",
            "baseName": "offline_packages",
            "type": "Array<Universalconnectormanagerv3File>",
            "format": ""
        },
        {
            "name": "pipelineType",
            "baseName": "pipeline_type",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Universalconnectormanagerv3GetUCSetupResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

