CREATE TABLE `employee_details` (
  `emp_id` int(11) NOT NULL,
  `emp_name` varchar(50) NOT NULL,
  `emp_aadhar` varchar(50) NOT NULL,
  `emp_sal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
INSERT INTO `employee_details` VALUES (1,'Abhay','123455443487',20000),(2,'rakesh','12885443487',20000);



CREATE TABLE `employee_master` (
  `emp_id` int(5) NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(50) NOT NULL,
  `emp_dept` varchar(55) NOT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
