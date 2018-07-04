# dotCMS Signing Key Generator

This tool allows the generation of a new signing key for dotCMS 4.3.3 installations. 

## Building
This is a Maven repository, you can build the JAR as follow

```
mvn package
```

## Help
Starting the tool will generate a new signing key.

```
timo@dotcms ~/w/d/d/target> java -jar ./dotCMSSigningKeyGenerator-0.0.1-SNAPSHOT.jar 
----- dotCMS TokenGenerator PoC by MOGWAI LABS GmbH (https://mogwailabs.de) -----

Your config file will be somewhere arround: {dotCMSRoot}/dotserver/tomcat{versions}/webapps/ROOT/WEB-INF/classes/dotmarketing-config.properties
Key:
rO0ABXNyAB9qYXZheC5jcnlwdG8uc3BlYy5TZWNyZXRLZXlTcGVjW0cLZuIwYU0CAAJMAAlhbGdvcml0aG10ABJMamF2YS9sYW5nL1N0cmluZztbAANrZXl0AAJbQnhwdAADQUVTdXIAAltCrPMX+AYIVOACAAB4cAAAACBllWSDQmn5quvLdN8UMPMPIB7KBSIjw45vd+klKD6bqw==

```
Within the config file there is a line with ```# json.web.token.hash.signing.key={theDefaultKey}```. Delete the “#” (and any leadying whitespaces) at the beginning of the line. ```{theDefaultKey}``` needs to be replaced with the new generated key. 

After a restart of dotCMS the changes take effect.
