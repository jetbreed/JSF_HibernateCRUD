USE jsf_hibernate_crud;

CREATE TABLE IF NOT EXISTS `client` 
(
  `user_id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `email` varchar(100),
  `firstname` varchar(100),
  `lastname` varchar(100),
  `phone` varchar(100),
  `gender` varchar(100) NOT NULL,
  `age` date NOT NULL,
   PRIMARY KEY (`user_id`)
) 
ENGINE=InnoDB DEFAULT CHARSET=latin1;