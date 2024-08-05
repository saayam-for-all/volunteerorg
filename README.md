VolunteerOrg repository readme

The volunteerorg service is responsible for fetching various charity organisations and their data via 3rd party APIs such as Charity Navigator, Charity Watch, and GuideStar. 

# API endpoints:
This service exposes the following 2 API endpoints:
1. GET /volunteerorg/ping -> This is a health check endpoint that returns a 200 OK response if the service is up and running.
2. GET /volunteerorg/?requestId={requestId} -> This endpoint fetches the charity data from the 3rd party APIs and returns the data in a json format:

# Stakeholders:
The API wil be called by the volunteer to fetch the charity organisation data.

# Fetching RequestData
The API will be fetching request data from the postgres database using the requestId. The request data will contain the topic, location, language, etc. The API will use this data to fetch the charity data from the 3rd party APIs.
Currently we are able to fetch the charity data from the Charity Navigator API. We will be adding support for fetching data from other orgs as well.

# Tech stack:
- Java17
- Spring Boot
- Maven
- Docker