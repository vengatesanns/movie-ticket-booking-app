CREATE TABLE vault.access_token (token_id text,authentication blob,
authentication_id text,client_id text,refresh_token text,"token" blob,
username text, PRIMARY KEY ((token_id),username,client_id));


//View Based on Authentication ID
CREATE MATERIALIZED VIEW vault.access_token_by_authentication_id 
AS SELECT "authentication_id","token_id","token" FROM access_token 
WHERE authentication_id IS NOT NULL AND token_id IS NOT NULL
AND username IS NOT NULL AND client_id IS NOT NULL primary key(authentication_id,client_id,username,token_id);


CREATE MATERIALIZED VIEW vault.access_token_by_refresh_token 
AS SELECT "authentication_id","token_id","token","refresh_token" FROM access_token 
WHERE refresh_token IS NOT NULL AND token_id IS NOT NULL
AND username IS NOT NULL AND client_id IS NOT NULL primary key(refresh_token,client_id,username,token_id);



CREATE MATERIALIZED VIEW vault.access_token_by_clientid_username
AS SELECT "client_id","token_id","token" FROM access_token 
WHERE client_id IS NOT NULL AND username IS NOT NULL AND token_id IS NOT NULL
primary key(client_id,username,token_id);
