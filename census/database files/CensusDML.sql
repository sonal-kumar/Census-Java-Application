-- insertion
insert into head_info (application_id,firstname,lastname,suffix,dob,gender)
values
('001','sonal','kumar','.','06-02-1998','male');


insert into members_info (application_id,firstname,lastname,suffix,dob,gender,relation)
values
('001','arvind','kumar','gupta','06-02-1973','male','father');



-- search application id '001'

select * from head_info join members_info  using  (application_id) where application_id='001';