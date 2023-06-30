select * from movies_db.movies;

select first_name,last_name,rating from movies_db.actors;

select title from movies_db.series;

select first_name,last_name, rating from movies_db.actors
where rating > 7.5;

select title,rating,awards from movies_db.movies
where rating > 7.5 and awards > 2;

select title,rating from movies_db.movies
order by rating;

select title,rating from movies_db.movies
where title like 'Toy Story%';

select * from movies_db.actors
where first_name like "Sam%";

select * from movies_db.movies
where release_date between "2004-01-01" and "2008-12-31";