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

import { HttpFile } from '../http/http';

/**
* AppHpa contains the information required for horizontal pod autoscaler.
*/
export class Resourcecontrollerk8v3AppHpa {
    /**
    * The upper limit for the number of pods that can be set by the autoscaler. It cannot be smaller than min_replicas.
    */
    'maxReplicas'?: string;
    /**
    * Optional: The lower limit for the number of pods that can be set by the autoscaler, default 1.
    */
    'minReplicas'?: string;
    /**
    * Optional: The target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified it defaults to the target CPU utilization at 80% of the requested resources.
    */
    'targetCpuUtilizationPercentage'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "maxReplicas",
            "baseName": "max_replicas",
            "type": "string",
            "format": "int64"
        },
        {
            "name": "minReplicas",
            "baseName": "min_replicas",
            "type": "string",
            "format": "int64"
        },
        {
            "name": "targetCpuUtilizationPercentage",
            "baseName": "target_cpu_utilization_percentage",
            "type": "string",
            "format": "int64"
        }    ];

    static getAttributeTypeMap() {
        return Resourcecontrollerk8v3AppHpa.attributeTypeMap;
    }

    public constructor() {
    }
}

