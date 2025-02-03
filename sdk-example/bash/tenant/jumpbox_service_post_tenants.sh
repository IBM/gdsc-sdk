# Make sure the script has executable rights
#chmod u+x ./client.sh

# Print the list of operations available on the service
#./client.sh -h

# Print the service description
#./client.sh --about

# Print detailed information about specific operation
#./client.sh <operationId> -h

# Make GET request
#./client.sh --host https://<hostname>:<port> -u <user>:<password> --accept xml <operationId> <queryParam1>=<value1> <header_key1>:<header_value2>

# Make GET request using arbitrary curl options (must be passed before <operationId>) to an SSL service using username:password
#./client.sh -k -sS --tlsv1.2 --host https://<hostname>:<port> -u <user>:<password> --accept xml <operationId> <queryParam1>=<value1> <header_key1>:<header_value2>

# Make POST request
#$ echo '<body_content>' |  --host https://<hostname>:<port> -u <user>:<password> --content-type json <operationId> -

# Make POST request with simple JSON content, e.g.:
# {
#   "key1": "value1",
#   "key2": "value2",
#   "key3": 23
# }
#echo '<body_content>' |  --host <hostname> --content-type json <operationId> key1==value1 key2=value2 key3:=23 -

# Make POST request with form data
#./client.sh  --host https://<hostname>:<port> -u <user>:<password> <operationId> key1:=value1 key2:=value2 key3:=23

# Preview the cURL command without actually executing it
#./client.sh  --host https://<hostname>:<port> -u <user>:<password> --dry-run <operationid>


user=${YOUR_TENANT_ADMIN_USER_NAME}
password=${YOUR_TENANT_ADMIN_PASSWORD}

host=${URL}
json = '{"name": "Test01","uid": "your_tenant_admin_email@yours.com"}'
echo ${json} | ./client.sh  --host ${host} -u ${user}:${password}  jumpboxServicePostTenants -

