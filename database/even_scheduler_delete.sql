SET GLOBAL event_scheduler = ON;

create event cleaning 
on schedule every 2 minute
starts current_timestamp()
do
	delete from shortener.url
    where url.expires_date < now();
