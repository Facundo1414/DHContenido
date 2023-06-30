select title As "Titulos" from movies_db.series;

select title As "Titulos" from movies_db.movies
where rating > 3 and awards > 1 and release_date between "1988-01-01" and "2009-12-31"
order by rating desc;

select title As "Titulos",rating from movies_db.movies
where rating > 3 and awards > 1 and release_date between "1988-01-01" and "2009-12-31"
order by rating desc
limit 3;

select title As "Titulos",rating from movies_db.movies
where rating > 3 and awards > 1 and release_date between "1988-01-01" and "2009-12-31"
order by rating 
limit 3;

