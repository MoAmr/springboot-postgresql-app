![Java CI with Maven](https://github.com/MoAmr/springboot-postgresql-app/workflows/Java%20CI%20with%20Maven/badge.svg?event=push)

# springboot-postgresql-app

## How to install a docker instance:


```console
docker run --name postgres-spring -e POSTGRES_PASSWORD=password -d -p 5432:5432 postgres:alpine
```

* Command Explanation:-
 
```console
--name postgres-spring -> docker image name 
-e -> environemnt vaiable 
POSTGRES_PASSWORD=password -> docker image password
-d -> on detach mode
-p 5432:5432 -> exposing the port that is running inside a docker container and expose it to the outside world
postgres:alpine -> smallest version
```

## How to expose the port that is running inside a docker container to the outside world?

```console
docker port postgres-spring
```

**Note:** 5432 is the default port for postgres 
