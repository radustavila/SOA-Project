# SOA-Project


<h4> Summary </h4>

Car Catalog is a software system (MVP at the moment) based on Web Applications which interact among them 
as micro frontends and they are backed by a couple of Web Servers which are microservices 
that communicate with each other. 

<h4> Flow Diagram </h4>

![SOA](https://user-images.githubusercontent.com/62139439/217571160-557f5d2c-e4bd-42bc-ab85-3208ae23a929.png)

<h4> SOA Patterns </h4>

<h5> Aggregator </h5>  - The Car-Catalog-Service collects related data items from other microservices, 
applies business logic on them and then exposes them through an API endpoint.

<h5> Discovery </h5> - The Discovery-Server is a centralized server which maintain a global view of the 
client services; it facilitates the discovery of the services based on names set in application files & 
not hardcoded urls, also it would load balance the requests.

<h5> Decomposition Design </h5> Basically breaking down into small services which target a specific feature

