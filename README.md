# Android__Login-Registration


**1-create database<br/>
create database android;<br/>
CREATE TABLE `users` (<br/>
  `id` int(11) NOT NULL,\n
  `username` varchar(100) NOT NULL,<br/>
  `password` text NOT NULL,<br/>
  `email` varchar(100) NOT NULL\n
) ENGINE=InnoDB DEFAULT CHARSET=armscii8;<br/>


**2-go to Constants.java and change the ip address<br/>
          private static final String ROOT_URL="http://YourIpAddress/android/v1/";<br/>
