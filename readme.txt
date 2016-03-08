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