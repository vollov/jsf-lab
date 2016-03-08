mvn archetype:create -DgroupId=org.demo.pt -DartifactId=project-track -DarchetypeArtifactId=maven-archetype-webapp

mvn eclipse:eclipse -Dwtpversion=2.0

catalina.bat jpda start

         <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>2.3.1</version>
            <configuration>
               <source>1.7</source>
               <target>1.7</target>
            </configuration>
         </plugin>
     =================

    
    
     	<application>
      <locale-config>
         <default-locale>en</default-locale>
         <supported-locale>zh</supported-locale>
      </locale-config>
      <resource-bundle>
         <base-name>org.demo.pt.stock.web.messages</base-name>
         <var>msg</var>
      </resource-bundle>
   </application>
     ======================    
         
         
   <!-- 
<h:form>
    <h:inputText value="#{b1.sym}" required="true" label="Stock symbol"
        requiredMessage="Input is missing!">
    </h:inputText>
    
 
    on 
    <h:inputText value="#{b1.quoteDate}" required="true"
        label="Quote date" converterMessage="The quote date is invalid">
        <f:convertDateTime dateStyle="short" />
    </h:inputText>

     
    <h:commandButton action="ok" value="Submit query"></h:commandButton>
</h:form>
     -->