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
cmd :
Microsoft Windows [Version 10.0.22621.1555]
(c) Microsoft Corporation. All rights reserved.

C:\Users\Munwar>docker pull munwarali/springboot-images-new
Using default tag: latest
latest: Pulling from munwarali/springboot-images-new
001c52e26ad5: Pull complete
d9d4b9b6e964: Pull complete
2068746827ec: Pull complete
9daef329d350: Pull complete
d85151f15b66: Pull complete
66223a710990: Pull complete
db38d58ec8ab: Pull complete
9c98f86ca531: Pull complete
Digest: sha256:d7df5814c6999ac8264034b958735aef6be38f5a6a5942c8e1579a57ed1e29b5
Status: Downloaded newer image for munwarali/springboot-images-new:latest
docker.io/munwarali/springboot-images-new:latest

C:\Users\Munwar>docker images
REPOSITORY                                                TAG                                                                          IMAGE ID       CREATED          SIZE
munwarali/springboot-images-new                           latest                                                                       67e9ca536efb   10 minutes ago   672MB
docker/welcome-to-docker                                  latest                                                                       924b9d1abd68   5 weeks ago      13.1MB
hubproxy.docker.internal:5555/docker/desktop-kubernetes   kubernetes-v1.25.4-cni-v1.1.1-critools-v1.25.0-cri-dockerd-v0.2.6-1-debian   2511e1796e7d   4 months ago     398MB
registry.k8s.io/kube-apiserver                            v1.25.4                                                                      00631e54acba   5 months ago     128MB
registry.k8s.io/kube-scheduler                            v1.25.4
               e2d17ec744c1   5 months ago     50.6MB
registry.k8s.io/kube-proxy                                v1.25.4
               2c2bc1864279   5 months ago     61.7MB
registry.k8s.io/kube-controller-manager                   v1.25.4
               8f59f6dfaed6   5 months ago     117MB
registry.k8s.io/etcd                                      3.5.5-0
               4694d02f8e61   7 months ago     300MB
registry.k8s.io/pause                                     3.8
               4873874c08ef   10 months ago    711kB
registry.k8s.io/coredns/coredns                           v1.9.3
               5185b96f0bec   10 months ago    48.8MB
hello-world                                               latest
               feb5d9fea6a5   18 months ago    13.3kB
docker/desktop-vpnkit-controller                          v2.0
               8c2c38aa676e   23 months ago    21MB
docker/desktop-storage-provisioner                        v2.0
               99f89471f470   23 months ago    41.9MB

C:\Users\Munwar>docker run -p 8080:8080 munwarali/springboot-images-new

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.6.3)

2023-04-16 10:33:02.771  INFO 1 --- [           main] c.m.g.GithubactionsCiCdApplication       : Starting GithubactionsCiCdApplication v0.0.1-SNAPSHOT using Java 11.0.16 on 62c803d29c79 with PID 1 (/springboot-images-new.jar started by root in /)
2023-04-16 10:33:02.774  INFO 1 --- [           main] c.m.g.GithubactionsCiCdApplication       : No active profile set, falling back to default profiles: default
2023-04-16 10:33:03.917  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2023-04-16 10:33:03.933  INFO 1 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-04-16 10:33:03.934  INFO 1 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.56]
2023-04-16 10:33:04.000  INFO 1 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-04-16 10:33:04.000  INFO 1 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1160 ms
2023-04-16 10:33:04.399  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2023-04-16 10:33:04.411  INFO 1 --- [           main] c.m.g.GithubactionsCiCdApplication       : Started GithubactionsCiCdApplication in 2.352 seconds (JVM running for 3.322)
2023-04-16 10:33:36.252  INFO 1 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2023-04-16 10:33:36.253  INFO 1 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2023-04-16 10:33:36.254  INFO 1 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 1 ms
