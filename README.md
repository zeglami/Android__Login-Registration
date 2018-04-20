# Android__Login-Registration


**1-create database
create database android;
CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` text NOT NULL,
  `email` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=armscii8;


**2-go to Constants.java and change the ip address
          private static final String ROOT_URL="http://YourIpAddress/android/v1/";
