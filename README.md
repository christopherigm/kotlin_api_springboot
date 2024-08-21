# Kotlin API with Springboot

## Authors

- Adrian Talonia Ramos [Java FullStack Developer] [@adriantalonia](https://github.com/adriantalonia)

## Technology Stack

- Java 11
- Kotlin 1.6.21
- Springboot 2.7.2

## Development Prerequisites

- Intellij IDEA

### Production deployment

1. Build and publish Docker image

```sh
./gradlew build && \
docker build -t kotlin-app:latest . && \
docker tag kotlin-app:latest christopherguzman/kotlin-app:latest && \
docker push christopherguzman/kotlin-app:latest
```

2. Create namespace

```sh
kubectl create namespace kotlin-app
```

3. Deploy Postgres

```sh
helm install postgres-api deployment/postgres \
  --namespace=kotlin-app \
  --set config.POSTGRES_DB=kotlin-app \
  --set config.POSTGRES_USER=kotlin-app \
  --set config.POSTGRES_PASSWORD=kotlin-app
```

5. Deploy microservice

```sh
helm install kotlin-app deployment \
  --namespace=kotlin-app \
  --set config.POSTGRES_DATABASE_NAME=kotlin-app \
  --set config.POSTGRES_USER=kotlin-app \
  --set config.POSTGRES_PASSWORD=kotlin-app
```

6. Delete deployments

```sh
helm delete postgres-api -n kotlin-app && \
helm delete kotlin-app -n kotlin-app
```
