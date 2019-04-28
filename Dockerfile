# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
FROM tomcat:8.0-alpine
ADD ./dist/WebApplication1.war /usr/local/tomcat/webapps/WebApplication1.war
CMD ["catalina.sh", "run"]
