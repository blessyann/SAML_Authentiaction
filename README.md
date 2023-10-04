# SAML_Authentiaction
Sample demonstarion on how SAML authentication works 
# SAML Authentication working!!
SAML single sign-on authentication typically involves a service provider and an identity provider. The process flow usually involves the trust establishment and authentication flow stages.
When a user tries to access a resource, such as a web app, they are redirected to a centralized login system or IdP. This IdP authenticates the user, creates a SAML assertion, and sends it to the SP. The service provider then grants or denies access based on this assertion.

    1. Our identity provider is User1. 
    2. Our service provider is a fictional service, Server1
    3. Now, a user is trying to gain access to Server1 using SAML authentication.
This is the process flow:

    1. The user tries to log in to Server1 from a browser.
    2. Server1 responds by generating a SAML request.
    3. The browser redirects the user to an SSO URL, User1
    4. User1 parses the SAML request and authenticates the user. This could be with username and password or even social login. 
        If the user is already authenticated on User1, this step will be skipped. Once the user is authenticated, 
        User1 generates a SAML response.
    5. User1 returns the encoded SAML response to the browser.
    6. The browser sends the SAML response to Server1 for verification.
    7. If the verification is successful, the user will be logged in to Server1 and granted access to the 
        resources that they are authorized to view/modify.
 
