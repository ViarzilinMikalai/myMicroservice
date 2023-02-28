FROM postgres:14.3
ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD=postgres
ENV POSTGRES_DB=postgres
ENV PGDATA=/var/lib/postgresql/data/pgdata

#for building: docker build -t my/postgres .
#for running: docker run -p 5432:5432 my/postgres