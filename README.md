# SpringData Reactive MongoDB with Mockito

* `Tutorial`: https://russianblogs.com/article/376818931

### Default MongoDB connection:
`
host = localhost;
port = 27017;
database = test;
`

Collection: `freelancers`

SDK: `Java-11`

---

POST
http://localhost:8080/person

```json
{
    "name": "sam",
    "age": 40,
    "skills": [ "js", "react", "python"]
}
```
```json
{
    "name": "jack",
    "age": 38,
    "skills": [ "js", "angular", "postgres"]
}
```
```json
{
    "name": "james",
    "age": 30,
    "skills": [ "java", "reactor", "mongo"]
}
```
```json
{
    "name": "smith",
    "age": 32,
    "skills": [ "qa", "selenium"]
}
```


GET
http://localhost:8080/person/62751dab37455e17fe38c34b


1. Just open terminal and type this command
    ```shell
    sudo chmod 666 /var/run/docker.sock
    ```
2. Make sure your Docker engine is up and running
    ```shell
    docker ps
    ```
3. Run all tests


---

### @Testcontainers

1. Just open terminal and type this command
   `sudo chmod 666 /var/run/docker.sock`
2. Make sure your Docker engine is up and running
   `docker ps`
3. Run all tests
   `repository.FreelancerRepositoryTest` on docker database

