# Android__Login-Registration


**1-Create database<br/>
create database android;<br/>
CREATE TABLE `users` (<br/>
  `id` int(11) NOT NULL,<br/>
  `username` varchar(100) NOT NULL,<br/>
  `password` text NOT NULL,<br/>
  `email` varchar(100) NOT NULL<br/>
) ENGINE=InnoDB DEFAULT CHARSET=armscii8;<br/>
**

**2-Go to Constants.java and change the ip address<br/>
          private static final String ROOT_URL="http://YourIpAddress/android/v1/";<br/>
**
