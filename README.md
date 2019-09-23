# SOAP-MiniApplication
SOAP web service project started(under development) 
This project use Spring Boot and SOAP web service and WSDL technologies.
This project ability is select data by id for now.

# Project Test Enviroment(POSTMAN)
<p>
Http Request                                                           
<h4>/subscribers.wsdl  [POST]:   http://localhost:8080/ws/subscribers.wsdl   ContextType:(text/xml) 
<h5>RequestBody: </h5>
 <h5> <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
	xmlns:gs="http://spring.io/guides/gs-producing-web-service">
   <soapenv:Header/>
   <soapenv:Body>
      <gs:getSubscriberById>
         <gs:id>1</gs:id>
      </gs:getSubscriberById>
   </soapenv:Body>
</soapenv:Envelope></h5>
 </h4>
 
 
<h4>Http Response                                                          
<h5>RequestBody: </h5>
 <h5> <SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:getSubscriberResponse xmlns:ns2="http://spring.io/guides/gs-producing-web-service">
            <ns2:subscriber>
                <ns2:id>1</ns2:id>
                <ns2:name>Sinem</ns2:name>
                <ns2:msisdn>5555</ns2:msisdn>
            </ns2:subscriber>
        </ns2:getSubscriberResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope></h5>
 </h4>


<a href="https://github.com/Burcukgo/WSPrototype/blob/master/img/test.png" target="_blank">
<img src="https://github.com/Burcukgo/WSPrototype/blob/master/img/test.png" width="200" style="max-width:100%;"></a>
  
</p> 
