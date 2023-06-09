created a repository for sample application on GitHub.( i have done a spring boot application maven built.)
sample application:![image](https://user-images.githubusercontent.com/126280146/232312493-2e3500e3-6af3-461a-b91e-7a1bcf779c61.png)
postman:![image](https://user-images.githubusercontent.com/126280146/232312467-f7e7c9cb-3153-43d0-bb43-b290282b7012.png)

Created a Dockerfile for the application that includes all the dependencies and packages needed to run the application.
Created a new workflow java using maven .github/workflows directory in repository and added a maven.yaml file inside it. Added the workflow in the maven.yaml file. This includes specifying the trigger events, jobs, and steps!
Defined a job for the code build step in the workflow. This includes checking out the source code, installing dependencies, and running tests.
Defined a job for the Docker build step in the workflow. This includes building a Docker image, tagging it, and pushing it to a Docker registry and configured the necessary environment variables, such as the Docker hub registry login credentials.![image](https://user-images.githubusercontent.com/126280146/232310692-1af8227f-d001-4ffe-82ab-35d4105f7cdb.png)

Maven.yml file:)
![image](https://user-images.githubusercontent.com/126280146/233860268-d06c3501-0032-4c75-8225-a96e2214d830.png)
![image](https://user-images.githubusercontent.com/126280146/233860275-66c65ad7-fdf6-4f1b-8396-0b143ca62183.png)
[cmd prompt.txt](https://github.com/MunwarAli12/munwarrrrrrrr/files/11242308/cmd.prompt.txt)
![image](https://user-images.githubusercontent.com/126280146/232312782-63163c1f-ace7-4aca-9943-f9fc8cf7a3f3.png)
![Screenshot (66)](https://user-images.githubusercontent.com/126280146/232309978-8c043746-90d8-46d9-b30d-406ea180a70c.png)
![Screenshot (64)](https://user-images.githubusercontent.com/126280146/232310010-5589d6f4-0e16-45dc-9526-14b10a91c82b.png)
As a result, established a CI-CD pipeline for a spring boot application built using Maven and use the CI-CD tool Github Actions. The pipeline now includes a code build and a docker build step.
cmd Prompt:
![image](https://user-images.githubusercontent.com/126280146/233021281-ae60773b-645f-48d0-a4ec-709036094360.png)
![image](https://user-images.githubusercontent.com/126280146/233021424-a3dc0800-ccd4-4c0c-9f27-96b7cd66280b.png)
![image](https://user-images.githubusercontent.com/126280146/233860209-b9c43605-f044-418b-9407-4e4af20e0fc0.png)
build:
![image](https://user-images.githubusercontent.com/126280146/233860220-9b7ab5b2-cb66-4856-bdd7-857588f51a33.png)
deploy:
![image](https://user-images.githubusercontent.com/126280146/233860237-7f083d63-931c-4a71-903b-55f6f348e04b.png)
![image](https://user-images.githubusercontent.com/126280146/233860189-542918cf-a978-4682-b2ee-93d081c0c694.png)

There are multiple steps to this process, but it can be summed up as follows:
Written code is uploaded to a GitHub repository.
Using GitHub Actions, a workflow is made that outlines the procedures required to develop and release the code.The workflow is triggered and the specified actions are carried out when code is pushed to the repository. The process involves creating the code, testing it, creating a Docker image, and deploying it to a container registry. After that, the deployed image is downloaded and used in the target environment and runned via local host at post 8080.
where we taken basic spring boot java maven built appplication, Acontinuous integration and continuous deployment (CI/CD) pipeline is used throughout this process to automate the creation and deployment of code. Code changes set off the pipeline, which makes sure that they are tested, built, and delivered in a repeatable and dependable manner.
