--create DATABASE CENSUS;
--\c census;
-- head_info table
create table head_info
(
 application_id varchar(30) primary key,
 firstname varchar(20)not null,
 lastname varchar(20) not null,
 suffix varchar(20) not null,
 dob date not null,
 gender varchar(20) not null,
 
);

-- members_info table

create table members_info
(
 application_id varchar(30) foreign key references head_info(application_id),
 firstname varchar(20),
 lastname varchar(20),
 suffix varchar(20),
 dob date,
 gender varchar(20),
 relation varchar(20)
);






