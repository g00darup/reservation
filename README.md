# reservation

docker build -t reservation .

docker run -p 8080:8080 -d reservation

browse to localhost:8080/{appropriateContextPath}

insert {appropriateContextPath} by going to controllers folder in code
