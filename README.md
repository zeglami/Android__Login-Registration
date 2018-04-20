# Android__Login-Registration


**1-create database\n
create database android;\n
CREATE TABLE `users` (\n
  `id` int(11) NOT NULL,\n
  `username` varchar(100) NOT NULL,\n
  `password` text NOT NULL,\n
  `email` varchar(100) NOT NULL\n
) ENGINE=InnoDB DEFAULT CHARSET=armscii8;\n


**2-go to Constants.java and change the ip address\n
          private static final String ROOT_URL="http://YourIpAddress/android/v1/";\n
