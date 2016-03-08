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

   <navigation-rule>
      <from-view-id>home.xhtml</from-view-id>
      <navigation-case>
         <from-action>#{navigationController.processPage1}</from-action>
         <from-outcome>page</from-outcome>
         <to-view-id>page1.jsf</to-view-id>
      </navigation-case>
      <navigation-case>
         <from-action>#{navigationController.processPage2}</from-action>
         <from-outcome>page</from-outcome>
         <to-view-id>page2.jsf</to-view-id>
      </navigation-case>
   </navigation-rule>
 --> 
         
