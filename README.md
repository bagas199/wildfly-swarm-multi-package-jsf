# wildfly-swarm-multi-package-jsf
-- Version 1.0.0
Example of Wildfly JSF project with WAR build for development (tried in Eclipse) and uberjar build for deployment.

1. Build for development
- Import as maven project
- run it in Wildfly 10.0.1.0

2. Build for Deployment
- Build
mvn clean install package -Pswarm-localdev
- Run
java -Djava.net.preferIPv4Stack=true -jar wsmpj-swarm.jar

Problem:
1. favicon not shown in uberjar version (creating a BUG report)

