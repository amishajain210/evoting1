FROM tomcat:8.0-alpine
ADD ./dist/WebApplication1.war /usr/local/tomcat/webapps/WebApplication1.war
CMD ["catalina.sh", "run"]
