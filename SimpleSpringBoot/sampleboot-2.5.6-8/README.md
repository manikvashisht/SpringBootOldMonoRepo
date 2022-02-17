This is a sample Springboot Application for experienced starters (created from https://start.spring.io/). This app will have following 

1. Rest Controller
2. 12 Factor implementations https://12factor.net/
3. Steps for local setup for Config Server, Docker , Kubernetes, PMD in Intel Mac.
4. Have Swagger Documentation for all CRUD oprations. No database in this project, we will keep it simple.

Local Setup : 

1. Install Java 8 you can use https://openjdk.java.net/projects/jdk8/ or Oracle JDK (This project is on OpenJdk)
2. Install Docker on Mac (Intel) : Follow https://docs.docker.com/desktop/mac/install/
3. Kubernetes : The Docker installation will have an option of Kubernetes for installing, but is you want to do independetly then follow : https://kubernetes.io/docs/tasks/tools/install-kubectl-macos/
4. Install SonarQube : https://docs.sonarqube.org/latest/setup/get-started-2-minutes/
For issues in local setup, please Google :) 

IDE Used : IntelliJ Community Edition (Always Latest)

How to run app locally (No Docker) : 
1. Use gradle version 7.2 if using terminal.
2. Run : gradle clean build
3. Run : gradle bootrun
4. Test : curl --location --request GET 'localhost:8080/example-get-mapping/firstname/{ENTER_FIRSTNAME_HERE}/lastName/{ENTER_LASTNAME_HERE}?format=US'


How to run app locally (With Docker) :
1. Use gradle version 7.2 if using terminal.
2. Run : gradle clean build
3. Run : docker build --build-arg JAR_FILE=build/libs/\*.jar -t springboot/sampleapplication .
4. Run:  docker run -p 8080:8080 -t springboot/sampleapplication
5. Test : curl --location --request GET 'localhost:8080/example-get-mapping/firstname/{ENTER_FIRSTNAME_HERE}/lastName/{ENTER_LASTNAME_HERE}?format=US'

How to run app locally (With Docker & Kubernetes) :
1. Use gradle version 7.2 if using terminal.
2. Run : gradle clean build
3. Run : docker build --build-arg JAR_FILE=build/libs/\*.jar -t springboot/sampleapplication .
4. Run:  docker tag springboot/sampleapplication:1.0 manikvashisht/samplespringbootapplication:1.0
5. Run: docker push manikvashisht/samplespringbootapplication:1.0 (Note: if you get error check in your docker repo and see if you are logged in properly.)
6. Run: kubectl create deployment springbootdemo --image=manikvashisht/samplespringbootapplication:1.0 --dry-run=client -o=yaml > deployment.yaml
7. Run: echo --- >> deployment.yaml
8. Run: kubectl create service clusterip springbootdemo --tcp=8080:8080 --dry-run=client -o=yaml >> deployment.yaml
9. Run: kubectl apply -f deployment.yaml
10. kubectl port-forward svc/springbootdemo 8080:8080
11. Test : curl --location --request GET 'localhost:8080/example-get-mapping/firstname/{ENTER_FIRSTNAME_HERE}/lastName/{ENTER_LASTNAME_HERE}?format=US'