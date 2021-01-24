 
CREATE TABLE `tenantdb1`.`users`
 ( `id` INT NOT NULL AUTO_INCREMENT , 
  `name`VARCHAR(100) NOT NULL , 
  `access` VARCHAR(10) NOT NULL ,
  `emailId` VARCHAR(30) NOT NULL ,
  PRIMARY KEY (`id`)) ENGINE =InnoDB;

insert into `tenantdb1`.`users` (id, name, access, emailId) values (1, 'T1-Arun Kumar', 'ADMIN', 'arun@xyz.com');
insert into `tenantdb1`.`users` (id, name, access, emailId) values (2, 'T1-Sumit', 'VIEW', 'sumit@xyz.com');
insert into `tenantdb1`.`users` (id, name, access, emailId) values (3, 'T1-Erika Joseph', 'WRITE', 'erika@xyz.com');

 
 CREATE TABLE `tenantdb2`.`users`
 ( `id` INT NOT NULL AUTO_INCREMENT , 
  `name`VARCHAR(100) NOT NULL , 
  `access` VARCHAR(10) NOT NULL ,
  `emailId` VARCHAR(30) NOT NULL ,
  PRIMARY KEY (`id`)) ENGINE =InnoDB;
  
insert into `tenantdb2`.`users` (id, name, access, emailId) values (1, 'T2-Surya Singhal', 'ADMIN', 'surya@abc.com');
insert into `tenantdb2`.`users` (id, name, access, emailId) values (2, 'T2-Kiran', 'VIEW', 'kiran@abc.com');
insert into `tenantdb2`.`users` (id, name, access, emailId) values (3, 'T2-Devishree', 'VIEW', 'devi@abc.com');
insert into `tenantdb2`.`users` (id, name, access, emailId) values (4, 'T2-Ranganathan', 'VIEW' , 'ranga@abc.com');

 
 CREATE TABLE `tenantdb3`.`users`
 ( `id` INT NOT NULL AUTO_INCREMENT , 
  `name`VARCHAR(100) NOT NULL , 
  `access` VARCHAR(10) NOT NULL ,
  `emailId` VARCHAR(30) NOT NULL ,
  PRIMARY KEY (`id`)) ENGINE =InnoDB;
  
insert into `tenantdb3`.`users` (id, name, access, emailId) values (1, 'T3-Tushar Khanna', 'ADMIN', 'tushar@alpha.com');
insert into `tenantdb3`.`users` (id, name, access, emailId) values (2, 'T3-Vinod', 'VIEW', 'vinod@alpha.com');
insert into `tenantdb3`.`users` (id, name, access, emailId) values (3, 'T3-Riya Prasad', 'VIEW', 'riya@abc.com');
insert into `tenantdb3`.`users` (id, name, access, emailId) values (4, 'T3-Chris Stewart', 'VIEW' , 'chris@alpha.com');
insert into `tenantdb3`.`users` (id, name, access, emailId) values (5, 'T3-Arjun Mithra', 'WRITE', 'arjun@alpha.com');

