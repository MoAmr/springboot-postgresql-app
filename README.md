![Java CI with Maven](https://github.com/MoAmr/springboot-postgresql-app/workflows/Java%20CI%20with%20Maven/badge.svg?event=push)

# springboot-postgresql-app


## How to install a docker image:-

[Download postgres docker image](https://hub.docker.com/_/postgres)

## How to start a postgres instance on docker:-


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

## How to expose the port that is running inside a docker container to the outside world:-

```console
docker port postgres-spring
```

**Note:** 5432 is the default port for postgres 

## How to bash into a container and create a DB:-

```console
docker exec -it CONTAINER ID bin/bash
```

**Example:**
```console
docker exec -it d1dd52e9f5cb bin/bash
```

## How to get inside postgresql DB using terminal:-

```console
psql -U postgres
```

## How to list all your databases:-

```console
postgres=# \l
```

## How to create a database:-

```sql
CREATE DATABASE demodb;
```

## How to connect to your newly created DB:-

```console
postgres=# \c demodb
```

## How to get info about everything in your DB (describe everything):-

```console
demodb=# \d
```

## How to get info about your DB's tables (describe tables only):-

```console
demodb=# \dt
```

## How to describe a table i.e (person table):-

```console
demodb=# \d person
```
