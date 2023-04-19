created a repository for sample application on GitHub.( i have done a spring boot application maven built.)
sample application:![image](https://user-images.githubusercontent.com/126280146/232312493-2e3500e3-6af3-461a-b91e-7a1bcf779c61.png)
postman:![image](https://user-images.githubusercontent.com/126280146/232312467-f7e7c9cb-3153-43d0-bb43-b290282b7012.png)

Created a Dockerfile for the application that includes all the dependencies and packages needed to run the application.
Created a new workflow java using maven .github/workflows directory in repository and added a maven.yaml file inside it. Added the workflow in the maven.yaml file. This includes specifying the trigger events, jobs, and steps!
Defined a job for the code build step in the workflow. This includes checking out the source code, installing dependencies, and running tests.
Defined a job for the Docker build step in the workflow. This includes building a Docker image, tagging it, and pushing it to a Docker registry and configured the necessary environment variables, such as the Docker hub registry login credentials.![image](https://user-images.githubusercontent.com/126280146/232310692-1af8227f-d001-4ffe-82ab-35d4105f7cdb.png)

Maven.yml file:)![image](https://user-images.githubusercontent.com/126280146/232310126-83bad471-127a-4f2f-938c-14dfec13bbdc.png)

[cmd prompt.txt](https://github.com/MunwarAli12/munwarrrrrrrr/files/11242308/cmd.prompt.txt)

![image](https://user-images.githubusercontent.com/126280146/232312782-63163c1f-ace7-4aca-9943-f9fc8cf7a3f3.png)


![Screenshot (61)](https://user-images.githubusercontent.com/126280146/232310040-0f9e73c0-fa25-4350-982f-bc626541b736.png)

![Screenshot (62)](https://user-images.githubusercontent.com/126280146/232310034-3c1204d3-aa9e-4e0e-87ba-1f22f869853a.png)

![Screenshot (63)](https://user-images.githubusercontent.com/126280146/232310025-18d16149-0c5b-4d81-aa2a-90d1d3271aea.png)

![Screenshot (66)](https://user-images.githubusercontent.com/126280146/232309978-8c043746-90d8-46d9-b30d-406ea180a70c.png)
![Screenshot (64)](https://user-images.githubusercontent.com/126280146/232310010-5589d6f4-0e16-45dc-9526-14b10a91c82b.png)
As a result, established a CI-CD pipeline for a spring boot application built using Maven and use the CI-CD tool Github Actions. The pipeline now includes a code build and a docker build step.
cmd Prompt:
![image](https://user-images.githubusercontent.com/126280146/233021281-ae60773b-645f-48d0-a4ec-709036094360.png)
![image](https://user-images.githubusercontent.com/126280146/233021424-a3dc0800-ccd4-4c0c-9f27-96b7cd66280b.png)
