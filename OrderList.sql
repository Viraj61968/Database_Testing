Create database MockData;

Use MockData;

Create table OrderList 
( 
id int,
First_Name VarChar(20),
Last_Name VarChar(20),
Email varchar(20),
Gender varchar(20),
City varchar(50),
Product varchar(50)
);

Select * From OrderList;

Insert into OrderList Values (1,'Chantalle','Garric','cgarric0@arizona.edu','Female','Armaza','X3 soul mini');
Insert into OrderList Values (2,'Heinrick','de Guerre','hdeguerr1@salon.com','Male','Pairiti','HP Data Manager');
Insert into OrderList Values (3,'Gustaf','Duding','gduding2@phpbb.com','Male','Wenping','E11117');
Insert into OrderList Values (4, 'Sileas','Ceaplan','sceaplen3@ihg.com','Polygender','Huangxi','Micromax Canvas');
Insert into OrderList Values (5, 'Conrade','Benda','cbenda4@1688.com','Male','Naguilian','Sony erricson');
Insert into OrderList Values (6, 'Ram','Religion','RR2@excel.com','God','Heaven','Magic wand');
Insert into OrderList Values (7, 'Viraj','N','VVVV@gamil.com','Male','Sin City','Future');




















