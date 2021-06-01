# KodlamaioHomeworks
## DataBase Design

## DataBase Codes

Create Table City(
	id integer NOT NULL GENERATED ALWAYS AS IDENTITY (start with 1 increment by 1),
	name VARCHAR(25) NOT NULL,
	code VARCHAR(2) NOT NULL,
	PRIMARY KEY(id)
);



Create Table Users (
 	id integer Not NUll GENERATED ALWAYS AS IDENTITY (start with 1 increment by 1),
	email VARCHAR(25) NOT NULL,
	password VARCHAR(20) NOT NULL,
	password_again VARCHAR(20) NOT NULL,
	PRIMARY KEY(id)
);



Create Table Employer_Verification(
	id integer Not NUll GENERATED ALWAYS AS IDENTITY (start with 1 increment by 1),
	verification_code varchar(5) Not NULL,
	verification_status Boolean Not Null,
	Primary key(id)
);



Create Table Employee_Verification(
	id integer Not NUll GENERATED ALWAYS AS IDENTITY (start with 1 increment by 1),
	verification_code varchar(5) Not NULL,
	verification_status Boolean Not Null,
	Primary key(id)
);



Create Table System_personal(
	id integer Not NUll GENERATED ALWAYS AS IDENTITY (start with 1 increment by 1),
	personal_id integer NOT NULL,
    national_id VARCHAR(10) UNIQUE not NULL,
    PRIMARY KEY (id),
	FOREIGN KEY (id) REFERENCES Users (id)
);



Create Table Job(
	id integer Not NUll GENERATED ALWAYS AS IDENTITY (start with 1 increment by 1),
	job_title Varchar(20) NOT NULL,
	PRIMARY KEY(id)
);



Create Table Employer(
	id integer Not NUll GENERATED ALWAYS AS IDENTITY (start with 1 increment by 1),
	employer_id VARCHAR(20) NOT NULL,
    company_name character varying(50) NOT NULL,
    company_website character varying(100) NOT NULL,
    company_phone character varying(10) NOT NULL,
    email VARCHAR(25) NOT NULL,
	verification_id integer NOT NULL,
	password VARCHAR(20) NOT NULL,
	password_again VARCHAR(20) NOT NULL,
    PRIMARY KEY (id),
	FOREIGN KEY (verification_id) REFERENCES Employer_Verification(id)
);



Create Table Employee(
	id integer Not NUll GENERATED ALWAYS AS IDENTITY (start with 1 increment by 1),
	employee_id Varchar(20) Not NULL,
	firstName VARCHAR(20) NOT NULL,
	lastName VARCHAR(20) NOT NULL,
	national_id VARCHAR(11) UNIQUE NOT NULL,
	birth_year Date NOT NULL,
	email VARCHAR(25) NOT NULL,
	verification_id integer NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (verification_id) REFERENCES Employer_Verification(id)
);



CREATE Table jobPosting(
	id integer NOT NULL GENERATED ALWAYS AS IDENTITY (start with 1 increment by 1),
	jobDescription VARCHAR(100) NOT NULL,
	minSallary integer Check(minSallary >= 0),
	maxSallary integer Check(maxSallary >= 0),
	availablePos integer Check(availablePos >= 0),
	publishDate Date Not NULL,
	isActive BOOLEAN NOT NULL,
	cityId integer,
	employerId integer,
	jobId integer,
	PRIMARY KEY(id),
	FOREIGN KEY (cityId) REFERENCES city(id),
	FOREIGN KEY (employerId) REFERENCES employer(id),
	FOREIGN KEY (jobId) REFERENCES job(id)
);



Create Table Candidate(
	candidate_id integer Not Null Generated Always As IDENTITY (start with 1 increment by 1),
	first_name Varchar(20) Not Null,
	last_name Varchar(20) Not Null,
	email Varchar(20) Not Null,
	password Varchar(20) Not Null,
	password_again Varchar(20) Not Null,
	Primary Key (candidate_id)
);



Create Table cv_file(
	cv_id integer Not Null Generated Always as Identity (start with 1 increment by 1),
	candidate_id integer Not Null,
	university Varchar(25) Not Null,
	department Varchar(25) Not Null,
	education_start_date integer Check(education_start_date > 1980 and education_start_date < 2022),
	education_finish_date integer Check(education_finish_date > 1980 and education_finish_date < 2022),
	graduate_status boolean Not Null,
	company_name Varchar(25),
	position_name Varchar(25),
	work_start_date integer Check(work_start_date > 1980 and work_start_date < 2022),
	work_finish_date integer Check(work_finish_date > 1980 and work_finish_date < 2022),
	experience integer Default 0,
	languages Varchar(15) Not Null,
	language_status integer Check(language_status > 0 and language_status < 6),
	github Varchar(25),
	linkedln Varchar(25),
	cover_letter Varchar(400),
	Primary Key (cv_id),
	Foreign key (candidate_id) References Candidate(candidate_id)
);



Create View myView As
	select workStartDate, workFinishDate, workFinishDate - workStartDate as experience
	From CvFile;


INSERT INTO public.candidate(
	first_name, last_name, email, password, password_again)
	VALUES ('Baris', 'Kocaman', 'baris@gmail.com', '12345', '12345');
	
	
INSERT INTO public.cv_file(
	candidate_id, university, department, education_start_date, education_finish_date, graduate_status, company_name, position_name, work_start_date, work_finish_date, experience, languages, language_status, github, linkedln, cover_letter)
	VALUES (1, 'Baskent', 'CE', 2017, 2021, True, 'dasa', 'Engineer', 2020, 2021, 1, 'Eng', 4, 'git', 'link', 'dasdas');


INSERT INTO public.cv_file(
	cv_ref, university, department, education_start_date, education_finish_date, graduate_status, company_name, position_name, work_start_date, work_finish_date, experience, languages, language_status, github, linkedln, cover_letter, candidate_id)
	VALUES (1, 'Odtu', 'CE', 2017, 2021, True, 'dasdas', 'Engineer', '2020', 2020, 1, 'Germany', 2, 'dasdsa', 'dsadas', 'dsadsaddsadasdsadas', 1);


INSERT INTO public.city(name, code) VALUES ('Samsun', '55');
INSERT INTO public.city(name, code) VALUES ('İstanbul', '34');
INSERT INTO public.city(name, code) VALUES ('Ankara', '06');



INSERT INTO public.employer_verification(
	verification_code, verification_status)
	VALUES ('1', True);


INSERT INTO public.employer_verification(
	verification_code, verification_status)
	VALUES ('2', False);


INSERT INTO public.job(
	job_title)
	VALUES ('Java Developer');


INSERT INTO public.job(
	job_title)
	VALUES ('.Net Developer');


INSERT INTO public.job(
	job_title)
	VALUES ('ML Developer');


INSERT INTO public.employer(
	employer_id, company_name, company_website, company_phone, email, verification_id, password, password_again)
	VALUES (1, 'Kocaman', 'kocaman.com', '0535167567', 'kocaman@gmail.com', 2, '123', '123');
	
	
INSERT INTO public.employer(
	employer_id, company_name, company_website, company_phone, email, verification_id, password, password_again)
	VALUES (2, 'Kocamanlar', 'kocamanlarr.com', '0531234756', 'kocamanlar@gmail.com', 1, '12345', '12345');
	
	
	
INSERT INTO public.jobposting(
	jobdescription, minsallary, maxsallary, availablepos, publishdate, isactive, cityid, employerid, jobid)
	VALUES ('denemeler', 6500, 8500, 6, '2021-02-07', True, 2, 1, 2);


INSERT INTO public.jobposting(
	jobdescription, minsallary, maxsallary, availablepos, publishdate, isactive, cityid, employerid, jobid)
	VALUES ('talent', 5000, 9500, 10, '2021-06-12', True, 2, 1, 2);
	
	
INSERT INTO public.jobposting(
	jobdescription, minsallary, maxsallary, availablepos, publishdate, isactive, cityid, employerid, jobid)
	VALUES ('vovv', 6900, 8500, 6, '2021-12-15', False, 1, 2, 1);


