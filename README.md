# OAuth2-Resource-Server
Demo for OAuth2. This is the resource server. The resource server only supports client_credentials grant type at the moment.

This is a resource server which utilizes Keycloak as the Authorization Server.
There is only one endpoint at this time-

- /oauth : This requires the JWT Token to access

How to get JWT Token-

- Download Keycloak
- Run Keycloak in Linux server
- Create a new client in Keycloak and keep note of the Client Credentials
- Assign it a Role of ADMIN(necessary as the code expects it, change code if not required)
- Send a POST request to http://localhost:***Keycloak Port***/realms/***Keycloak Realm***/protocol/openid-connect/token with the body as urlencoded-<br>
    - client_id:***Client ID*** <br>
    - client_secret:***Client Secret*** <br>
    - scope:openid email profile <br>
    - grant_type:client_credentials <br>
- Get the accessToken from the Response
- Send a GET request with the Access Token as an Authorization Header(add Bearer at the start)
- Profit.
