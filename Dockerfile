FROM ubuntu:latest
LABEL authors="gunjandixit"

ENTRYPOINT ["top", "-b"]

##
docker run --name mysql-local \
  -e MYSQL_ROOT_PASSWORD=root \
  -e MYSQL_DATABASE=interview_db \
  -p 3306:3306 \
  -d mysql:8.0

  ##