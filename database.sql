CREATE TABLE user(
    ID int  PRIMARY KEY ,
    name varchar(12),
    password varchar(30),
    email varchar(20),
    telephone varchar(11),
    country varchar(40)
);
 CREATE TABLE loginTime(
     ID int ,
     loginTime datetime,
     foreign key (ID) references user(ID)
 );

CREATE TABLE score(
    ID int,
    score int,
    foreign key (ID) references user(ID)
);

 CREATE TABLE admin(
     ID int PRIMARY KEY ,
     name varchar(12),
     password varchar(20)
 );

CREATE TABLE adminLoginTime(
    ID int,
    LoginTime datetime,
    foreign key (ID) references admin(ID)
);

insert into user value (1,'BORBER','Spring','borber.drum@gmail.com','17379916772','China');